package singletone_registry.main;

import singletone_registry.DomeniuInternet;

public class Main {
    public static void main(String[] args) {
        DomeniuInternet domeniuInternet1 = DomeniuInternet.getDomeniu("seminar4.ro");
        DomeniuInternet domeniuInternet2 = DomeniuInternet.getDomeniu("seminar5.ro");
        DomeniuInternet domeniuInternet3 = DomeniuInternet.getDomeniu("seminar5.ro");
        domeniuInternet1.setAnInregistrare(2019);
        domeniuInternet2.setAnInregistrare(2023);
        domeniuInternet3.setAnInregistrare(2026);

        System.out.println(domeniuInternet1);
        System.out.println(domeniuInternet2);
        System.out.println(domeniuInternet3);

    }
}
