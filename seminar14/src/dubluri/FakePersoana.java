package dubluri;

import clase.IPersoana;

public class FakePersoana implements IPersoana {

    private String getSexValue;
    private int getVarsta;
    private boolean checkCNPValue;

    public void setGetSexValue(String getSexValue) {
        this.getSexValue = getSexValue;
    }

    public void setGetVarsta(int getVarsta) {
        this.getVarsta = getVarsta;
    }

    public void setCheckCNPValue(boolean checkCNPValue) {
        this.checkCNPValue = checkCNPValue;
    }

    @Override
    public String getSex() {
        return getSexValue;
    }

    @Override
    public int getVarsta() {
        return getVarsta;
    }

    @Override
    public boolean checkCNP() {
        return checkCNPValue;
    }
}
