package main;

import clase.Administrator;
import clase.Inregistrare;
import clase.Soare;
import singletone_registry.DomeniuInternet;

public class Main {

    public static void main(String[] args) {
        Administrator administrator1 = Administrator.getInstanta();
        Administrator administrator2 = Administrator.getInstanta();

        System.out.println(administrator1.toString());
        System.out.println(administrator2.toString());

        Soare soare1 = Soare.getInstance("galben", 1000);
        Soare soare2 = Soare.getInstance("portocaliu", 1000);

        System.out.println(soare1.toString());
        System.out.println(soare2.toString());

        Inregistrare inregistrare1 = Inregistrare.getInstance("Alexandru", "12345", "0745698712");
        Inregistrare inregistrare2 = Inregistrare.getInstance("Ditan", "34589", "0778921712");
        System.out.println(inregistrare1.toString());
        System.out.println(inregistrare2.toString());
    }
}
