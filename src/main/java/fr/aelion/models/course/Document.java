package fr.aelion.models.course;

public class Document extends Media {
    @Override
    public void play() {
        System.out.println("Je vais afficher le document");
    }
}
