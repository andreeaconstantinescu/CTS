package strategy.clase;

import flyweight.clase.Spectator;

public class VerificareTribuna implements Strategy{
    @Override
    public void modVerificareSpectatori(Spectator spectator) {
       // System.out.println(spectator.getNume() + "este veriifcat pt intrarea in tribuna ");
    }
}
