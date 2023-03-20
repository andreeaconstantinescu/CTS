package clase;

public class Inregistrare {
    private String nume;
    private String parola;
    private String numarTelefon;

    private static Inregistrare instanta = null;

    private Inregistrare(String nume, String parola, String numarTelefon) {
        this.nume = nume;
        this.parola = parola;
        this.numarTelefon = numarTelefon;
    }

    public static synchronized Inregistrare getInstance(String nume, String parola, String numarTelefon) {
        if (instanta == null) {
            instanta = new Inregistrare(nume, parola, numarTelefon);
        }
        return instanta;
    }

    @Override
    public String toString() {
        return "Inregistrare{" +
                "nume='" + nume + '\'' +
                ", parola='" + parola + '\'' +
                ", numarTelefon='" + numarTelefon + '\'' +
                '}';
    }
}
