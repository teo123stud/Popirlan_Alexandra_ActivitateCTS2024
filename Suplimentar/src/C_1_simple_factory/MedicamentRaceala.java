package C_1_simple_factory;

public class MedicamentRaceala extends  MedicamentFarmacie{
    public MedicamentRaceala(String denumire, int pret) {
        super(denumire, pret);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Medicament raceala "+ getDenumire()+ " cu pret "+ getPret());
    }
}
