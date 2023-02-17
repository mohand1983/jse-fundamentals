package fr.aelion.repositories;

import fr.aelion.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<Student> students=new ArrayList<>();

    public StudentRepository() {

        this.populate();
    }
    public boolean findByLoginAndPassword(String login, String password){
        for(Student student: this.students){
            if(student.getUserName()==login && student.getPassword()==password){
                System.out.println("j'ai trouvé un étudiant");
                return true;
            }
        }
        return false;
    }
    public int size(){
        return this.students.size();
    }
    private void populate(){
        //System.out.println("--------------------------------------");
        Student st=new Student("toto", "tutu","boudi_mohand@coucou.fr");
        //System.out.println(st.toString());
        st.setUserName("bond");
        st.setPassword("007");
        //add student to list
        this.students.add(st);
    }
}
