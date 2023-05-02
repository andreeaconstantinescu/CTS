package decorator.clase;

public class BiletDecorat extends Decorator{


    public BiletDecorat(iBilet bilet) {
        super(bilet);
    }

    @Override
    public void printareMesajSustinere() {
        System.out.println("Sustinem echipa 1 "+ super.getBilet().getNumeEchipa1());
    }

    @Override
    public String getNumeEchipa1() {
        return null;
    }
}
