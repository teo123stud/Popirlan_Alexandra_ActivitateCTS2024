package simple_factory_3_B.classes;

public abstract class SupeRestaurant {

    private int pretSupa;

    public SupeRestaurant(int pretSupa) {
        this.pretSupa = pretSupa;
    }

    public int getPretSupa() {
        return pretSupa;
    }

    public void setPretSupa(int pretSupa) {
        this.pretSupa = pretSupa;
    }

    public abstract void afisareDetalii();
}
