package fr.aelion.helpers.fatory;

import fr.aelion.models.course.Document;
import fr.aelion.models.course.Media;
import fr.aelion.models.course.Slide;
import fr.aelion.models.course.Video;

import java.util.HashMap;

public class MediaFactory {
    private HashMap<String, Media> mediaTypes=new HashMap<>();
    private final static String classRoot ="fr.aelion.models.course";

    public Media getMedia(String mediaType) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String className = mediaType.toLowerCase();
        className = String.valueOf(mediaType.charAt(0)).toUpperCase() + className.substring(1);
        return getInstance(className);
    }

   private Media getInstance(String mediaType) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String className = MediaFactory.classRoot + "." + mediaType;
        return (Media) Class.forName(className).newInstance();
    }
    /*private Video getVideoInstance() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String className=MediaFactory.classRoot +".Vedio"; // fr.aelion.models.course.Video"
        return (Video) Class.forName(className).newInstance();
    }
    private Document getDocumentInstance() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String className=MediaFactory.classRoot +".Document"; // fr.aelion.models.course.Video"
        return (Document) Class.forName(className).newInstance();
    }
    private Slide getSlideInstance() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String className=MediaFactory.classRoot +".Slide"; // fr.aelion.models.course.Video"
        return (Slide) Class.forName(className).newInstance();
    }*/

}
