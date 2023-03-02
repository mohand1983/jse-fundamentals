package fr.aelion.user;

import fr.aelion.models.Student;
import fr.aelion.repositories.StudentRepository;

/**
 *
 */
public class LoginManager {
    private String login;
    private String password;
    private StudentRepository studentRepository = new StudentRepository();

    /**
     * Constructeur
     */
    public LoginManager(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public StudentRepository getStudentRepository() {
        return this.studentRepository;
    }

    public String login() {
        //return this.studentRepository.findByLoginAndPassword(this.login, this.password) ?"200 ok" : "404 NOT Found";
        /*if (this.login.equals(null) || this.password.equals(null)) {
            return "403 Forbidden";
        }*/
       /* Student student = this.studentRepository.findByLoginAndPassword(this.login, this.password);
        if (student instanceof Student){
            student.isLoggedIn(true);
            return "200 ok" ;
        }*/
        return "404 NOT Found";
    }
    public void logout() {
        /*Student student =this.studentRepository.findByLoginAndPassword(this.login, this.password);
        if(student instanceof Student){
            student.isLoggedIn(false);
        }*/
        }
}
