package C_2_factory_method;

public abstract class MedicamentFarmacie {

    private String denumire;

    private int pret;

    public MedicamentFarmacie(String denumire, int pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getPret() {
        return pret;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "MedicamentFarmacie{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                '}';
    }

    public abstract  void afisareDetalii();
}
