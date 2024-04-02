package C_2_factory_method;

public class MedicamentDurere extends MedicamentFarmacie {
    public MedicamentDurere(String denumire, int pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicament durere "+ getDenumire()+ " cu pret "+ getPret());
    }
}
