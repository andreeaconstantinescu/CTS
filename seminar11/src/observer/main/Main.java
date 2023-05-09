package observer.main;

import observer.clase.Banca;
import observer.clase.Client;
import observer.clase.iClient;

public class Main {
    public static void main(String[] args){
        Banca banca = new Banca("BCR");
        iClient client1 = new Client("Marcel");
        iClient client2 = new Client("Gigel");
        iClient client3 = new Client("George");

        banca.acrualizeazaAplicatia();

        banca.adaugaObserver(client1);
        banca.adaugaTipClient();

        banca.adaugaObserver(client2);
        banca.adaugaObserver(client3);
        banca.stergereObserver(client1);

        banca.acrualizeazaAplicatia();}


}
