package facade.clase;

public class Autobuz {
    private String nrInmatriculare;

    public Autobuz(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public void deschideUsaFata(){
        System.out.println("Usa din fata a fost deschisa pentru autobuzul cu nr "+this.nrInmatriculare);
    }

    public void deschideUsaSpate(){
        System.out.println("Usa din spate a fost deschisa pentru autobuzul cu nr "+this.nrInmatriculare);
    }

    public void deschideUsaMijloc(){
        System.out.println("Usa din mijloc a fost deschisa pentru autobuzul cu nr "+this.nrInmatriculare);
    }

    public void ramaneLiberUsaFata(){
        System.out.println("Usa din fata poate sa fie deschisa pentru calatori petru autobuzul cu nr  "+this.nrInmatriculare);
    }

    public void ramaneLiberUsaSpate(){
        System.out.println("Usa din spate poate sa fie deschisa pentru calatori petru autobuzul cu nr  "+this.nrInmatriculare);
    }
    public void ramaneLiberUsaMijloc(){
        System.out.println("Usa din mijloc poate sa fie deschisa pentru calatori petru autobuzul cu nr  "+this.nrInmatriculare);
    }
}
