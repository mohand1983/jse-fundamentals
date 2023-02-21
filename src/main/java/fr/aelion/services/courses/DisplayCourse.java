package fr.aelion.services.courses;

import fr.aelion.repositories.course.Course;

import java.sql.SQLOutput;

public class DisplayCourse {
    private Course course;

    public void setCourse(Course course) {
        this.course = course;
    }
    public void display(){
        System.out.println("Course :" +course.getTitle());
        //Next display
        course.getMedias().forEach(media -> {
            System.out.println(media.getTitle());
        });
    }
}
