package fr.aelion.run;

import fr.aelion.helpers.MediaBuilder;
import fr.aelion.models.course.*;
import fr.aelion.repositories.course.Course;
import fr.aelion.services.courses.DisplayCourse;

public class CourseRun {
    private Course course=new Course();
    public CourseRun(){
        this.course.setTitle("SQL");
        this.makeCourse();
    }
    public void run(){
        DisplayCourse displayCourse=new DisplayCourse();
        displayCourse.setCourse(this.course);
        System.out.println(displayCourse.displayBuilder());
    }
    private void makeCourse(){
        MediaBuilder videoBuilder= new MediaBuilder();
        videoBuilder.setMediaType("video");
        videoBuilder
                .title("Create table")
                .summary("Creer une table")
                .duration(5.35F)
                .author(new Author());
        MediaBuilder slideBuilder=new MediaBuilder();
        slideBuilder.setMediaType("slide");
        slideBuilder
                .title("Alter table")
                .summary("Modifier une table")
                .duration(5.35F)
                .author(new Author());
        MediaBuilder documentBuilder=new MediaBuilder();
        documentBuilder.setMediaType("document");
        documentBuilder
                .title("Drop table")
                .summary("Supprimer une table")
                .duration(5.35F)
                .author(new Author());
        MediaBuilder badBuilder=new MediaBuilder();
        badBuilder
                .title("Not in the list")
                .duration(5.35F);

    try{
        this.course.addMedia(videoBuilder.build());
    }catch (Exception e){
        System.out.println("Unable to add the video media");

    }
        try{
            this.course.addMedia(slideBuilder.build());
        }catch (Exception e){
            System.out.println("Unable to add the slide media");

        }
        try{
            this.course.addMedia(documentBuilder.build());
        }catch (Exception e){
            System.out.println("Unable to add doc" +
                    " media");

        }
        try{
            this.course.addMedia(badBuilder.build());
        }catch (Exception e){
            System.out.println(e.getMessage());

        }


    }

}
