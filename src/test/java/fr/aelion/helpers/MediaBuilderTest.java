package fr.aelion.helpers;

import fr.aelion.models.course.Author;
import fr.aelion.models.course.Media;
import fr.aelion.models.course.Video;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class MediaBuilderTest {
    private MediaBuilder badBuilder =new MediaBuilder();
    private MediaBuilder mediaBuilder =new MediaBuilder();
    @BeforeEach
    void setUp() {
        mediaBuilder.setMediaType("video");
        mediaBuilder
                .title("Test")
                .summary("Joli test de builder")
                .author(new Author())
                .duration(5.35F);
        badBuilder
                .author(new Author())
                .summary("L'objet ne sera pas créé")
                .title("No Name");
    }

    @Test
    @DisplayName("Should be an instanceof Video class")
    void build() {
        try {
            Media media = mediaBuilder.build();
            assertTrue(media instanceof Video);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    @DisplayName("Title should be 'Test'")
    void titleAttributeTest() {
        Media video = null;
        try {
            video = mediaBuilder.build();
            assertEquals("Test", video.getTitle());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    @DisplayName("Should have correct attribute values")
    void attributesTest() {
        Media video = null;
        try {
            video = mediaBuilder.build();
            Float duration = 5.35F;
            Media finalVideo = video;
            assertAll(
                    () -> assertEquals("Test", finalVideo.getTitle()),
                    () -> assertEquals("Joli test de builder", finalVideo.getSummary()),
                    () -> assertEquals(duration, finalVideo.getDuration()),
                    () -> assertTrue(finalVideo.getAuthor() instanceof Author)
            );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    @DisplayName("Not enough args should raised an exception")
    void notEnoughAttribute(){
        assertThrows(Exception.class, ()->badBuilder.build());

    }
    @Test
    @DisplayName("No type should raised an Exception")
    void noType(){
        MediaBuilder bad =new MediaBuilder();
        bad
                .title("Bad")
                .summary("bad")
                .author(new Author())
                .duration(5.35F);
        assertThrows(Exception.class, ()-> bad.build());
    }


}