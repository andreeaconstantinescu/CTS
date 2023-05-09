package state.clase;

public class Bancomat {
    private iStare stare;
    private Integer baniRamasi;

    public Bancomat(Integer baniRamasi) {
        this.baniRamasi = baniRamasi;
        stare = new StareNuAreCard();
    }

    public iStare getStare() {
        return stare;
    }

    protected void setStare(iStare stare) {
        this.stare = stare;
    }

    public void introducePin(){
        iStare stare = new StarePinIntrodus();
        stare.modificaStare(this);
    }

    public void retragereBani(Integer sumaRetrasa) {
        if (stare instanceof StarePinIntrodus) {
            if (baniRamasi >= sumaRetrasa) {
                this.baniRamasi = baniRamasi - sumaRetrasa;
                System.out.println("A fost retrasa suma de " + sumaRetrasa);
                if (baniRamasi == 0) {
                    iStare stare = new StareNuAreBani();
                    stare.modificaStare(this);

                }
            }
        }
    }

    public void retrageCard(){
        iStare stare = new StareNuAreCard();
        stare.modificaStare(this);}
}
