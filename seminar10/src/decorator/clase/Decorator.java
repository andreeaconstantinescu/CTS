package decorator.clase;

public abstract class Decorator implements iBilet{
    private iBilet bilet;

    public Decorator(iBilet bilet) {
        super();
        this.bilet = bilet;
    }

    public iBilet getBilet() {
        return bilet;
    }

    @Override
    public void printareBilet() {
        this.bilet.printareBilet();
        printareMesajSustinere();

    }

    public abstract void printareMesajSustinere();
}
