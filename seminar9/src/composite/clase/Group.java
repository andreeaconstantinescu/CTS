package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Group implements Element {
    private List<Element> elemente;
    private String denumireGrup;

    public Group(String denumireGrup) {
        super();
        this.elemente = new ArrayList<>();
        this.denumireGrup = denumireGrup;
    }

    @Override
    public float calculeazaSumaAsigurare() {
        float suma =0;
        for(Element grupGeneral : elemente){
            suma += grupGeneral.calculeazaSumaAsigurare();
        }
        return suma;
    }

    @Override
    public void adaugaGrup(Element groupGeneral) {
        elemente.add(groupGeneral);
    }

    @Override
    public void stergeGrup(Element groupGeneral) {
        this.elemente.remove(groupGeneral);
    }

    @Override
    public Element getGrup(int pozitie) {
        return this.elemente.get(pozitie);
    }

    @Override
    public void afisareSumaAsiguare(){
        System.out.println("Suma pentru asigurare este de "+ this.calculeazaSumaAsigurare());
    }


}
