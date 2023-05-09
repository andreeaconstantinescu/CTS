package template.clase;

public class BancomatBitcoin extends BancomatAbstract{
    public BancomatBitcoin(String adresa) {
        super(adresa);
    }

    @Override
    protected void introduceCard() {
        System.out.println("a fost introdus cardul Bitcoin in bancomatul din "+super.getAdresa());
    }

    @Override
    protected void introducePin() {
        System.out.println("A fost introdus pin ul pentru cardul Bitcoin in "+super.getAdresa());

    }

    @Override
    protected void specificareSuma(int suma) {
        System.out.println("a fost specificata suma de cripto pentru retragere "+suma);

    }

    @Override
    protected void retrageSuma() {
        System.out.println("a fost retrasa suma de cripto solicitata din "+super.getAdresa());

    }

    @Override
    protected void retrageCard() {
        System.out.println("a fost retrasa suma de cripto din "+super.getAdresa());
    }
}
