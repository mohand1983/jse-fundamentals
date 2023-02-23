package fr.aelion.helpers;


import fr.aelion.helpers.exceptions.NoMediaTypeException;
import fr.aelion.helpers.exceptions.NotEnoughArgsException;
import fr.aelion.helpers.fatory.MediaFactory;
import fr.aelion.helpers.interfaces.Builder;
import fr.aelion.models.course.*;

import java.util.Optional;

public class MediaBuilder implements Builder<Media> {
    private String title;
    private String summary;
    private Float duration;
    private Author author;
    private String mediaType;

    public void setMediaType(String mediaType) {

        this.mediaType = mediaType;
    }

    public MediaBuilder title(String title){
        this.title=title;
        return this;
    }
    public MediaBuilder summary(String summary){
        this.summary=summary;
        return this;
    }
    public MediaBuilder duration(Float duration){
        this.duration=duration;
        return this;
    }
    public MediaBuilder author(Author author){
        this.author=author;
        return this;
    }
    @Override
    public Media build() throws NoMediaTypeException, NotEnoughArgsException{

        //Hey Buddy
        if (this.title==null || this.duration==null) {
            throw new NotEnoughArgsException();
        }
        if(this.mediaType==null){
            throw new NoMediaTypeException();
        }

        Media media = null;
        try {
            media = new MediaFactory().getMedia(this.mediaType);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        if(media==null){
            throw new IllegalArgumentException("MediaType" +mediaType+ "doest't exist");
        }

        media.setTitle(this.title);
        media.setAuthor(this.author);
        media.setDuration(this.duration);
        media.setSummary(this.summary);
        return media;
    }
}


