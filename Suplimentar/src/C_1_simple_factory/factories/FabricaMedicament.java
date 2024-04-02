package C_1_simple_factory.factories;

import C_1_simple_factory.MedicamentBody;
import C_1_simple_factory.MedicamentDurere;
import C_1_simple_factory.MedicamentFarmacie;
import C_1_simple_factory.MedicamentRaceala;

public class FabricaMedicament {

    public MedicamentFarmacie createMedicament(TipMedicament tipMedicament, String denumire, int pret) throws Exception {
        switch (tipMedicament){
            case BODY:
                return new MedicamentBody(denumire, pret);
            case DUERERE:
                return new MedicamentDurere(denumire, pret);
            case RACEALA:
                return new MedicamentRaceala(denumire, pret);
            default:throw  new Exception("nu exista tipul!");
        }
    }
}
