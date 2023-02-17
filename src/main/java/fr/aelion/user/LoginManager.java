package fr.aelion.user;

import fr.aelion.models.Student;
import fr.aelion.repositories.StudentRepository;

/**
 *
 */
public class LoginManager {
    private String login;
    private String password;
    private StudentRepository studentRepository=new StudentRepository();

    /**
     * Constructeur
     */
    public LoginManager(String login, String password){
        this.login=login;
        this.password=password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
    public String login(){
    return this.studentRepository.findByLoginAndPassword(this.login, this.password) ?"200 ok" : "404 NOT Found";

    }
    public void logout(){

    }
}
