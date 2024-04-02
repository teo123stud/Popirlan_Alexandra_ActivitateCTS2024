package factory_method_1_B.classes;

public abstract class SupeRestaurant {
    private int pret;

    public SupeRestaurant(int pret) {
        this.pret = pret;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public abstract void afisareDetalii();
}
