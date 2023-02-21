package fr.aelion.helpers;

import fr.aelion.models.course.Author;
import fr.aelion.models.course.Media;
import fr.aelion.models.course.Video;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediaBuilderTest {
    private MediaBuilder mediaBuilder =new MediaBuilder();
    @BeforeEach
    void setUp() {
        mediaBuilder.setMediaType("video");
        mediaBuilder
                .title("Test")
                .summary("joli test de builder")
                .author(new Author())
                .duration(5.35F);
    }

    @Test
    @DisplayName("should be an instance Video class")
    void build(){
        assertTrue(mediaBuilder.build().get() instanceof Video);
    }
    @Test
    @DisplayName("Title should be 'Test'")
    void titleAttributeTest(){
        Media video=mediaBuilder.build().get();
        assertEquals("Test", video.getTitle());
    }
    @Test
    @DisplayName("should have correct attribute values")
    void attributesTest(){
        Media video= mediaBuilder.build().get();
        Float duration=5.35F;
        assertAll(
                ()->assertEquals("Test", video.getTitle()),
                ()->assertEquals("joli test de builder", video.getSummary()),
                ()->assertEquals(duration, video.getDuration()),
                ()->assertTrue(video.getAuthor() instanceof Author)
        );

    }


}