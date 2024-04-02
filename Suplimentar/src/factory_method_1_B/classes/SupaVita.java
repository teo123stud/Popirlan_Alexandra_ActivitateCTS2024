package factory_method_1_B.classes;

public class SupaVita extends SupeRestaurant{


    public SupaVita(int pret) {
        super(pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Ati selectat supa de vita cu pretul "+ getPret());
    }
}
