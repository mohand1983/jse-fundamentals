package fr.aelion;

import fr.aelion.models.Person;
import fr.aelion.models.Student;

public class Main {
    private static Main app;

    public static void main(String[] args) {
        //app=new Main("Jean-Luc");
        app=new Main();
        //System.out.println("I'm the main method");

    }
    /*
    *Class Constructor : trigger when an instance of this Class is created
     */
    public Main(){
       // System.out.println("I'am the Main constructeur");
        //instanciation de la la classe personne
        Person jl=new Person();
        jl.setLastName("Aubert");
        jl.setFirstName("Boudi");
        jl.setPhoneNumber("0619975522");
        jl.setEmail("boudi_mohand@yahoo.fr");
        System.out.println("bonjour je m'appelle " + jl.greetings());

        Person bt =new Person();
        bt.setLastName("Aubert1");
        bt.setFirstName("Boudi1");
        bt.setPhoneNumber("06199755221");
        bt.setEmail("boudi_mohand@yahoo.fr1");
        System.out.println("bonjour je m'appelle " + bt.greetings());

        Person al=new Person();
        al.setLastName("Aubert2");
        al.setFirstName("Boudi2");
        al.setPhoneNumber("06199755222");
        al.setEmail("boudi_mohand@yahoo.fr2");
        System.out.println("bonjour je m'appelle " + al.greetings());
        Person aa=new Person("toto", "titi", "0619852585","boudi@mohand");
        System.out.println("bonjour je m'appelle " + aa.greetings());
        Person bond=new Person("bond", "boudi@mohand");
        System.out.println("bonjour je m'appelle " + bond.greetings());

        ////***********************************************************////
        /*
        Make
         */
        Student st=new Student("toto", "tutu","boudi_mohand@coucou.fr");
        System.out.println(st.toString());
        st.setUserName("toutou");
        st.setPassword("12345");
        if(st.isLoggedIn()==false){
            if(st.login("toutou","12345")){
                System.out.println("bonjour" +st.firstName+ " " +st.lastName);
            }else{
                System.out.println("désolé mais aucun utilisateur ne correspond à vos identifiants");
            }
        }

        //try to connect with bad credentials
        if (st.isLoggedIn()){
            st.logout();
        }
        if(!st.login("toto", "tata")){
            System.out.println("désolé mais aucun utilisateur ne correspond à ces identifiants");
        }

    }

    public Main(String name){
        System.out.println("Hello "+ name);
    }


}