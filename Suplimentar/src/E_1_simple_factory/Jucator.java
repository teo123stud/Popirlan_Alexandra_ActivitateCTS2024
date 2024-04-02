package E_1_simple_factory;

public abstract class Jucator {
    private String nume;

    private int varsta;

    public Jucator(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public abstract void afisareDetalii();

}
