package fr.aelion.models.course;

public class Slide extends Media {
    @Override
    public void play() {
        System.out.println("Je vais afficher un slide");
    }
}
