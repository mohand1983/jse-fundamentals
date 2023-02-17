package fr.aelion.run;

import fr.aelion.models.Person;

/**
 * @name PersonRun
 * Make some Person instances and make each say hello
 */
public class PersonRun {
    public void run(){
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
    }
}
