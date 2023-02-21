package fr.aelion.models.course;

public abstract class Media {
    protected String title;
    protected String Summary;
    protected Float duration;
    //@todo create Author and move type to
    protected  Author author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String summary) {
        Summary = summary;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public abstract void play();
}
