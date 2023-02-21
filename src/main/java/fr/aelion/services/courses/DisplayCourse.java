package fr.aelion.services.courses;

import fr.aelion.repositories.course.Course;

import java.sql.SQLOutput;

public class DisplayCourse {
    private Course course;

    public void setCourse(Course course) {
        this.course = course;
    }
    public String displayBuilder(){
        final String[] output = new String[1];
        output[0] ="Course : " +course.getTitle()+ "\n";
        //Next display
        course.getMedias().forEach(media -> {
            output[0] +=media.getTitle() + "\n";
        });
        return output[0];
    }
}
