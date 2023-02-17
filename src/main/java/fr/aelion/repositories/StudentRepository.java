package fr.aelion.repositories;

import fr.aelion.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    public List<Student> students=new ArrayList<>();

    public StudentRepository() {
        this.populate();
    }
    private void populate(){
        //System.out.println("--------------------------------------");
        Student st=new Student("toto", "tutu","boudi_mohand@coucou.fr");
        //System.out.println(st.toString());
        st.setUserName("toutou");
        st.setPassword("12345");
        //add student to list
        this.students.add(st);
    }
}
