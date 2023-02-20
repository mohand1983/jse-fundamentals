import fr.aelion.models.Student;
import fr.aelion.repositories.StudentRepository;
import fr.aelion.user.LoginManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LoginManagerTest {
    public LoginManager loginManager;
    @BeforeEach
    public void setup(){
        this.loginManager=new LoginManager("bond", "007");
    }
    @Test
    @DisplayName("Login and password should be 'bond' and '007'")
    public void haveCredentials(){
        assertAll("Credentials",
                () ->assertEquals("bond", this.loginManager.getLogin()),
                () ->assertEquals("007", this.loginManager.getPassword())
                );
    }
    @Test
    @DisplayName("Should return 200 OK if Credentilas was good")
    public void goodCredentials(){
        assertEquals("200 ok", this.loginManager.login());
    }
    @Test
    @DisplayName("Should return 404 not found if bad credentials")
    public void badCredentials(){
        LoginManager loginManager=new LoginManager("toto", "tata");
        assertEquals("404 NOT Found", loginManager.login());
    }
    @Test
    @DisplayName("Student should be logged in")
    public void studentLogin(){
        StudentRepository studentRepository=this.loginManager.getStudentRepository();
        //StudentRepository studentRepository=new StudentRepository();
        Student student=studentRepository.findByLoginAndPassword("bond", "007");
        assertEquals(false, student.isLoggedIn());
        this.loginManager.login();
        assertEquals(true, student.isLoggedIn());
    }

}
