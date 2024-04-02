package C_1_simple_factory;

import C_1_simple_factory.factories.FabricaMedicament;
import C_1_simple_factory.factories.TipMedicament;

public class Main {

    public static void main(String[] args) throws Exception {

        FabricaMedicament fabricaMedicament= new FabricaMedicament();

        MedicamentFarmacie medicamentCorp= fabricaMedicament.createMedicament(TipMedicament.BODY, "Crema corp", 22);

        MedicamentFarmacie medicamentDurere= fabricaMedicament.createMedicament(TipMedicament.DUERERE, "Nurofen", 22);

        MedicamentFarmacie medicamentRaceala= fabricaMedicament.createMedicament(TipMedicament.RACEALA, "Brufen", 22);

        medicamentCorp.afisareDetalii();
        medicamentDurere.afisareDetalii();
        medicamentRaceala.afisareDetalii();
    }

}
