package fr.aelion.helpers.dto;

import fr.aelion.helpers.MediaBuilder;
import fr.aelion.models.course.Author;
import fr.aelion.models.course.Video;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class MediaListDtoTest {
    private MediaListDto dto;
    private Video video;

    @BeforeEach
    void setUp() {

        dto= new MediaListDto();

        video= new Video();
        video.setTitle("Test vidéo");
        video.setDuration(5.35F);
        video.setSummary("Resumé video");
        video.setAuthor(new Author());
    }

    @Test
    void deserialize() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        DtoMapper mapper=new DtoMapper();
        dto=(MediaListDto) mapper.map(video, dto);
        assertEquals(video.getTitle(), dto.title);
    }

}