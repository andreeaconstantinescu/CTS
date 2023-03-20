package singletone_registry_nerecomandat;

public class Firma {
    private String denumire;

    private int cifraAfaceri;

    public void incheiereContract(int sumaContract) {
        this.cifraAfaceri +=sumaContract;
    }

     Firma(String denumire, int cifraAfaceri) {
        this.denumire = denumire;
        this.cifraAfaceri = cifraAfaceri;
    }

    @Override
    public String toString() {
        return "Firma{" +
                "denumire='" + denumire + '\'' +
                ", cifraAfaceri=" + cifraAfaceri +
                '}';
    }
}
