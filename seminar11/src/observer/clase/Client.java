package observer.clase;

public class Client implements  iClient{

    private String numeClient;

    public Client(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void afiseazaMesaj(String mesaj) {
        System.out.println(numeClient+" ai primit mesaj!");
    }
}
