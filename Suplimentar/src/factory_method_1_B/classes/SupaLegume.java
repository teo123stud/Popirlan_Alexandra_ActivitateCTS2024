package factory_method_1_B.classes;

public class SupaLegume extends SupeRestaurant{
    public SupaLegume(int pret) {
        super(pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Ati selectat supa de legume cu pretul "+ getPret());
    }
}
