package fr.aelion.helpers.fatory;

import fr.aelion.models.course.Document;
import fr.aelion.models.course.Media;
import fr.aelion.models.course.Slide;
import fr.aelion.models.course.Video;

import java.util.HashMap;

public class MediaFactory {
    private HashMap<String, Media> mediaTypes=new HashMap<>();
    public MediaFactory(){
        mediaTypes.put("VIDEO", new Video());
        mediaTypes.put("SLIDE", new Slide());
        mediaTypes.put("DOCUMENT", new Document());
    }
    public Media getMedia(String mediaType){
        return mediaTypes.get(mediaType.toUpperCase());
    }
}
