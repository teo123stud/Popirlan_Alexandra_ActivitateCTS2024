package C_1_simple_factory;

public class MedicamentDurere extends MedicamentFarmacie{
    public MedicamentDurere(String denumire, int pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicament durere "+ getDenumire()+ " cu pret "+ getPret());
    }
}
