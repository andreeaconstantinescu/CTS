package composite.main;

import composite.clase.Autobuz;
import composite.clase.Element;
import composite.clase.Group;
import jdk.jshell.spi.ExecutionControl;

public class Main {
    public static  void main(String[] args) throws ExecutionControl.NotImplementedException {
        Element autobuz1 = new Autobuz("Mercedes",3000,9);
        Element autobuz2 = new Autobuz("Mercedes",3000,7);
        Element groupAutobuzeMici = new Group("Autobuze mici");
        groupAutobuzeMici.adaugaGrup(autobuz1);
        groupAutobuzeMici.adaugaGrup(autobuz2);
        groupAutobuzeMici.afisareSumaAsiguare();

        Element autobuz3 = new Autobuz("Mercedes",5000,15);
        Element autobuz4 = new Autobuz("Mercedes",4000,20);
        Element groupAutobuzeMijl = new Group("Autobuze mijl");
        groupAutobuzeMijl.adaugaGrup(autobuz3);
        groupAutobuzeMijl.adaugaGrup(autobuz4);
        groupAutobuzeMijl.afisareSumaAsiguare();

        Element flota = new Group("autobuze");
        flota.adaugaGrup(groupAutobuzeMici);
        flota.adaugaGrup(groupAutobuzeMijl);
        flota.afisareSumaAsiguare();

        Element autobuzVIP = new Autobuz("Renault",9000,30);
        flota.adaugaGrup(autobuzVIP);
        flota.afisareSumaAsiguare();

    }
}
