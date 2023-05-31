package dubluri;

import clase.IPersoana;

public class StabPersoana implements IPersoana {

    @Override
    public String getSex() {
        return "M";
    }

    @Override
    public int getVarsta() {
        return 21;
    }

    @Override
    public boolean checkCNP() {
        return true;
    }
}
