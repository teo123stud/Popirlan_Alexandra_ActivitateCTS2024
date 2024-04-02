package E_2_factory_method;

public class Fundas extends Jucator {
    public Fundas(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Fundasul "+ getNume()+ " are varsta "+ getVarsta());

    }
}
