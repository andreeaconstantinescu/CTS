package factory_method.clase;

public class Medic implements PersonalSpital {
    private String nume;

    protected Medic(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Medicul " + nume);
    }
}
