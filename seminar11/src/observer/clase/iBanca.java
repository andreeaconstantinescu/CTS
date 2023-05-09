package observer.clase;

public interface iBanca {
    public void adaugaObserver(iClient client);
    public  void stergereObserver(iClient client);
    public void notifica(String mesaj);
}
