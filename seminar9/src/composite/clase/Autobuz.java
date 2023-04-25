package composite.clase;

import jdk.jshell.spi.ExecutionControl;

public class Autobuz implements Element {
    private String producator;
    private int capacitateaCilindrica;
    private int numarLocuri;

    public Autobuz(String producator, int capacitateaCilindrica, int numarLocuri) {
        this.producator = producator;
        this.capacitateaCilindrica = capacitateaCilindrica;
        this.numarLocuri = numarLocuri;
    }

    @Override
    public float calculeazaSumaAsigurare() {
        float suma = 1.5f * this.capacitateaCilindrica;
        return suma;
    }

    @Override
    public void adaugaGrup(Element grupGeneral) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("adaugare");
    }

    @Override
    public void stergeGrup(Element grupGeneral) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("sters");
    }

    @Override
    public Element getGrup(int pozitie) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("get");
    }

    @Override
    public void afisareSumaAsiguare() {
        System.out.println("Suma de asigurare pentru autobuzul cu capacitatea cilindrica" + this.capacitateaCilindrica +" este "+ this.calculeazaSumaAsigurare());
    }
}
