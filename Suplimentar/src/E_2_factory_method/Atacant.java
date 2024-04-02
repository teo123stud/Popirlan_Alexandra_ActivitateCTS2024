package E_2_factory_method;

public class Atacant extends Jucator {
    public Atacant(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Atacantul "+ getNume()+ " are varsta "+ getVarsta());

    }
}
