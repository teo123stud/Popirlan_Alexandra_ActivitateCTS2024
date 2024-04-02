package E_1_simple_factory;

public  class Portar extends  Jucator{


    public Portar(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Portarul "+ getNume()+ " are varsta "+ getVarsta());
    }
}
