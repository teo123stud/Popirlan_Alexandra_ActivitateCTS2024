package C_1_simple_factory;

public class MedicamentBody extends MedicamentFarmacie{
    public MedicamentBody(String denumire, int pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicament body "+ getDenumire()+ " cu pret "+ getPret());
    }
}
