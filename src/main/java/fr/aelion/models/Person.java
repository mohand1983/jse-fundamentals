package fr.aelion.models;

public class Person {
    //les attributs
    private String lastName;
    private String firstName;


    private String phoneNumber;
    private String email;
    //le constructeur
    public Person(String firstName, String lastName, String phoneNumber, String email){
        this.firstName=firstName;
        this.lastName=lastName;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }
    public Person(String lastName,String email){
        this.lastName=lastName;
        this.email=email;
    }
    public Person(){

    }
    //les getters et les setters
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //les méthodes
    public String greetings(){
        return this.firstName + "  " +this.lastName.toUpperCase();
    }

}
