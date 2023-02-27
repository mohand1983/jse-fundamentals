package fr.aelion.services;

import fr.aelion.models.course.Media;
import fr.aelion.models.course.Video;
import fr.aelion.repositories.course.Course;
import fr.aelion.services.courses.DisplayCourse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class DisplayCourseTest {
    private DisplayCourse displayCourse ;
    private StringBuilder expected=new StringBuilder();

    @BeforeEach
    void setUp() {
        Course course=new Course();
        Media video=new Video();
        video.setTitle("video test");
        course.setTitle("test");
        course.addMedia(video);
        expected.append("Course : test" )
                .append("\n")
                .append("video test")
                .append("\n");
        displayCourse=new DisplayCourse();
        displayCourse.setCourse(course);
    }

    @Test
    @DisplayName("Should display the whole course")
    void displayBuilder() {

        assertEquals(expected.toString(), displayCourse.displayBuilder());
    }
}