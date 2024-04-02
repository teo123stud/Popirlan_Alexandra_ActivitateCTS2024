package simple_factory_3_B.classes;

public class SupaLegume extends SupeRestaurant{
    public SupaLegume(int pretSupa) {
        super(pretSupa);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Ati comandat supa de legume in valoare de "+ getPretSupa());

    }
}
