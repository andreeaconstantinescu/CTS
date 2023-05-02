package flyweight.clase;

import java.util.HashMap;

public class FabricaSpectatori {

    private HashMap<Integer, iSpectator> spectatori;

    public FabricaSpectatori() {
        this.spectatori = new HashMap<>();
    }

    public iSpectator getSpectator(int id, float inaltime, float latimeUmeri) {
        if (this.spectatori.get(id) != null) {
            return this.spectatori.get(id);
        } else {
            iSpectator spectator = new Spectator(inaltime, latimeUmeri, id);
            this.spectatori.put(id, spectator);
            return spectator;
        }
    }
}