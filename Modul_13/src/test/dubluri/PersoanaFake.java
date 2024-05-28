package test.dubluri;

import clase.IPersoana;
import clase.Persoana;

public class PersoanaFake implements IPersoana {

    private String valoareGetSex;

    private int valoareGetVarsta;
    private boolean valoreaGetCheckCNP;

    public void setValoareGetSex(String valoareGetSex) {
        this.valoareGetSex = valoareGetSex;
    }

    public void setValoareGetVarsta(int valoareGetVarsta) {
        this.valoareGetVarsta = valoareGetVarsta;
    }

    public void setValoreaGetCheckCNP(boolean valoreaGetCheckCNP) {
        this.valoreaGetCheckCNP = valoreaGetCheckCNP;
    }

    @Override
    public String getSex() {
        return valoareGetSex;
    }

    @Override
    public int getVarsta() {
        return valoareGetVarsta;
    }

    @Override
    public boolean checkCNP() {
        return valoreaGetCheckCNP;
    }
}
