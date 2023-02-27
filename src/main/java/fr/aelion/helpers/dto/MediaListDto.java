package fr.aelion.helpers.dto;

import fr.aelion.models.course.Media;

public class MediaListDto {
    /**
     * title of a media
     * @property String title
     */
    public String title;
    /**
     * duration of a media
     */
    public Float duration;
    public String summary;


    /**
     * transform a media object to a mediaListDto object
     * @param media media to deserialize to mediaListDto
     */
   /* public void deserialize(Media media){
        this.title=media.getTitle();
        this.duration= media.getDuration();
    }*/

}
