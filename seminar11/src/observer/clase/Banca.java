package observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Banca implements iBanca{

    public List<iClient> observari;
    public String numeBanca;

    public Banca(String numeBanca) {
        this.numeBanca = numeBanca;
        this.observari= new ArrayList<iClient>();
    }

    @Override
    public void adaugaObserver(iClient client) {
        this.observari.add(client);
    }

    @Override
    public void stergereObserver(iClient client) {
        this.observari.remove(client);

    }

    @Override
    public void notifica(String mesaj) {
        for(iClient oberver:observari){
            oberver.afiseazaMesaj(mesaj);
        }

    }

    public void adaugaTipClient(){
        notifica(numeBanca+ "Am adaugat un nou tip de credit, daca doriti sa il accesari ne puteti contacta!");
    }

    public  void acrualizeazaAplicatia(){
        notifica(numeBanca+" aplicatia a fost actualizata!");
    }
}
