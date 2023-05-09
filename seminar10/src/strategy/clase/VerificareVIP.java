package strategy.clase;

import flyweight.clase.Spectator;

public class VerificareVIP implements Strategy{
    @Override
    public void modVerificareSpectatori(Spectator spectator) {
        System.out.println(spectator.getNume() + "este verificat VIP");
    }
}
