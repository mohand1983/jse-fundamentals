package fr.aelion.helpers.dto;

import fr.aelion.helpers.MediaBuilder;
import fr.aelion.helpers.dto.annotations.Initial;
import fr.aelion.helpers.interfaces.Builder;
import fr.aelion.models.course.Media;

public class MediaDetailDto {

    /**
     * title of a madia
     */
    public String title;
    /**
     * Summary of a media
     */
    public String summary;
    /**
     * Duration of a media
     */
    public Float duration;
    /**
     * mediaType of a media
     */
    @Initial
    public String mediaType;

    /**
     *
     * @param media
     */
    /*public void deserialize(Media media){
        this.title=media.getTitle();
        this.duration= media.getDuration();
        this.summary= media.getSummary();
        this.mediaType=media.getClass().getSimpleName().substring(0,1);
    }*/
}
