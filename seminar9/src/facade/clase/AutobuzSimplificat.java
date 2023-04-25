package facade.clase;

public class AutobuzSimplificat {
    Autobuz autobuz;

    public AutobuzSimplificat(String nrInmatriculare) {
        this.autobuz = new Autobuz("B636347");
    }

    public void deschideUsi(){
        autobuz.deschideUsaFata();;
        autobuz.deschideUsaSpate();
        autobuz.deschideUsaMijloc();
    }

    public void ramaneLiber(){
        autobuz.ramaneLiberUsaFata();
        autobuz.ramaneLiberUsaSpate();
        autobuz.ramaneLiberUsaMijloc();
    }
}
