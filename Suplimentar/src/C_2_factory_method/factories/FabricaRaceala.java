package C_2_factory_method.factories;

import C_2_factory_method.MedicamentFarmacie;
import C_2_factory_method.MedicamentRaceala;

public class FabricaRaceala implements FabricaMedicamente{
    @Override
    public MedicamentFarmacie createMedicament(String denumire, int pret) {
        return new MedicamentRaceala(denumire,pret);
    }
}
