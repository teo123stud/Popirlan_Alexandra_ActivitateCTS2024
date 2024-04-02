package simple_factory_3_B.classes;

public class SupaVita extends SupeRestaurant{
    public SupaVita(int pretSupa) {
        super(pretSupa);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Ati comandat supa de vita in valoare de "+ getPretSupa());
    }
}
