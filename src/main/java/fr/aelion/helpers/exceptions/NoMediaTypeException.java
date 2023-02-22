package fr.aelion.helpers.exceptions;

public class NoMediaTypeException extends Exception{
    public NoMediaTypeException(){
        super("No Type was passed to Media");
    }
}
