package simple_factory_3_B.classes;

public class SupaCiuperci extends SupeRestaurant{
    public SupaCiuperci(int pretSupa) {
        super(pretSupa);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Ati comandat supa de ciuperci in valoare de "+ getPretSupa());

    }
}
