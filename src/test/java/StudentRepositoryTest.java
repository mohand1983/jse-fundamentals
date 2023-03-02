import fr.aelion.helpers.exceptions.StudentException;
import fr.aelion.models.Student;
import fr.aelion.repositories.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.xml.stream.events.StartDocument;
import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentRepositoryTest {
    StudentRepository studentRepository;
    @BeforeEach
    public void setup(){
        studentRepository=new StudentRepository();
    }
    @Test
    @DisplayName("Student list should have 100 element ")
    public void setStudentinstanciationTest() throws SQLException {
        List<Student> students=studentRepository.findAll();
        assertEquals(100,students.size());
    }
    @Test
    @DisplayName("should have ")
    public void firstStudentMustMatch() throws SQLException{
        List<Student> students=studentRepository.findAll();
        Student student=students.get(0);
        assertAll(
                ()->assertEquals("Andre", student.getLastName()),
                ()->assertEquals(26 , student.getId()),
                ()->assertEquals("Oury", student.getFirstName())

        );
    }
    @Test
    @DisplayName("should have ")
    public void findByLoginAndPassword() throws SQLException{
        Student student=studentRepository.findByLoginAndPassword("Andre_Oury36", "ca7DWWSiHMpsag1Mh986");
        assertAll(
                ()->assertEquals("Andre_Oury36", student.getUsername()),
                ()->assertEquals("ca7DWWSiHMpsag1Mh986", student.getPassword())

        );
    }
    @Test
    @DisplayName("should have ID ")
    public void findById() throws StudentException, SQLException{
        Student student=studentRepository.findById(26);
        assertAll(
                ()->assertTrue(student instanceof Student),
                ()->assertEquals("Andre", student.getLastName())

        );
    }




}
