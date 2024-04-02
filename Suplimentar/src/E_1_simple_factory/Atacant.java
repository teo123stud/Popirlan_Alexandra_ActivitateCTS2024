package E_1_simple_factory;

public class Atacant extends Jucator{
    public Atacant(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Atacantul "+ getNume()+ " are varsta "+ getVarsta());

    }
}
