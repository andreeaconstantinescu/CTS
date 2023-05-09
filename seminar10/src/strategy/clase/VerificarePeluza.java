package strategy.clase;

import flyweight.clase.Spectator;

public class VerificarePeluza implements Strategy {
    @Override
    public void modVerificareSpectatori(Spectator spectator) {
        //System.out.println(spectator.getNume()+"este verificat pt intrarea in cadrul peluzei");
    }
}
