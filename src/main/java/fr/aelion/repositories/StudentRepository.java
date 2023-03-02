package fr.aelion.repositories;

import fr.aelion.dbal.DbConnect;
import fr.aelion.dbal.postgres.PgConnect;
import fr.aelion.models.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    /**
     *connexion  instance base
     */

    private DbConnect dbconnect;

    public StudentRepository() {

        this.dbconnect= PgConnect.getInstance();
    }

    /**
     *
     * @return list of students of our DB
     */
    public List<Student> findAll() throws SQLException {
    ArrayList<Student> students=new ArrayList<>();
    //Need a sql Query
        String sqlQuery="SELECT id, last_name, first_name, email, phone_number, login, password ";
        sqlQuery+="FROM student ORDER BY last_name, first_name;";
        //Send sqlQuery to RDBMS => Need to create a statement object
        Connection connection=this.dbconnect.connect();
        Statement statement=connection.createStatement();
        ResultSet resultSet= statement.executeQuery(sqlQuery);
        // Expploit the resultat object=>loop over a cursor
        while(resultSet.next()){
            Student student=new Student();
            student.setId(resultSet.getInt(1));
            student.setLastName(resultSet.getString("last_name"));
            student.setFirstName(resultSet.getString("first_name"));
            student.setEmail(resultSet.getString("email"));
            student.setPhoneNumber(resultSet.getString("phone_number"));
            student.setUsername(resultSet.getString("login"));
            student.setPassword(resultSet.getString("password"));
            //Add brand new student object to the ArrayList
            students.add(student);

        }
        //Free resources
        statement.close();
        resultSet.close();
        this.dbconnect.disconnect();
        return students;
    }
    public Student findByLoginAndPassword(String login, String password) throws SQLException {
        //Need a sql Query
        String sqlQuery="SELECT id, last_name, first_name, email, phone_number, login, password ";
        sqlQuery+="FROM student WHERE login= '" +login+ "' AND password= '" +password+"'  ;";
        //Send sqlQuery to RDBMS => Need to create a statement object
        Connection connection=this.dbconnect.connect();
        Statement statement=connection.createStatement();
        ResultSet resultSet= statement.executeQuery(sqlQuery);
        while(resultSet.next()) {
            Student student=new Student();
            student.setUsername(resultSet.getString("login"));
            student.setPassword(resultSet.getString("password"));
            if(login.equals(student.getUsername()) && password.equals(student.getPassword())){
                return student;
            }
        }
        //Free resources
        statement.close();
        resultSet.close();
        this.dbconnect.disconnect();
        return null;
    }
    public Student findById(int id) throws SQLException {
        //Need a sql Query
        String sqlQuery="SELECT id, last_name, first_name, email, phone_number, login, password ";
        sqlQuery+="FROM student WHERE id= '" +id+ "';";
        //Send sqlQuery to RDBMS => Need to create a statement object
        Connection connection=this.dbconnect.connect();
        Statement statement=connection.createStatement();
        ResultSet resultSet= statement.executeQuery(sqlQuery);
        if(resultSet.next()==false){
            return null;
        }else{
            Student student=new Student();
            student.setId(resultSet.getInt("id"));
            student.setLastName(resultSet.getString("last_name"));
            student.setFirstName(resultSet.getString("first_name"));
            student.setEmail(resultSet.getString("email"));
            student.setPhoneNumber(resultSet.getString("phone_number"));
            student.setUsername(resultSet.getString("login"));
            student.setPassword(resultSet.getString("password"));
            return student;
        }
    }
}