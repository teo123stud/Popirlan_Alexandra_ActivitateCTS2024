package factory_method_1_B.classes;

public class SupaCiuperci extends SupeRestaurant {

    public SupaCiuperci(int pret) {
        super(pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Ati selectat supa de ciuperci cu pretul "+ getPret());
    }
}
