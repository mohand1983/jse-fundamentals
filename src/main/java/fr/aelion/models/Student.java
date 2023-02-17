package fr.aelion.models;

import javax.swing.*;

public class Student {
    // les attributs
    public String lastName;
    public String firstName;
    private String email;
    private String userName;
    private String password;
    private Boolean isLoggedIn=false;
    // le constructeur

    public Student(String lastName, String firstName, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
    }
    /*public void logout(String userName, String password){
            this.userName=userName;
            this.password=password;
    }*/

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(Boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    // les méthodes
    public  Boolean login(String username, String password){
        if(username.equals(this.userName)&& password.equals(this.password)){
            this.isLoggedIn=true;
            return true;
        }
        return false;
    }
    public void logout(){
        this.isLoggedIn=false;
    }

    public boolean isLoggedIn(){

        return this.isLoggedIn;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", isLoggedIn=" + isLoggedIn +
                '}';
    }
}
