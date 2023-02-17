package fr.aelion.run;

import fr.aelion.models.Student;

/**
 * @name StudentRun
 * Make some Student instances and make each say hello
 */
public class StudentRun {
    public void run(){
        //System.out.println("--------------------------------------");
        Student st=new Student("toto", "tutu","boudi_mohand@coucou.fr");
        //System.out.println(st.toString());
        st.setUserName("toutou");
        st.setPassword("12345");
        if(st.isLoggedIn()==false){
            if(st.login("toutou","12345")){
                System.out.println("bonjour " +st.firstName+ "  " +st.lastName);
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
}
