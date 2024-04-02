package C_2_factory_method.factories;

import C_2_factory_method.MedicamentDurere;
import C_2_factory_method.MedicamentFarmacie;

public class FabricaDurere implements FabricaMedicamente{
    @Override
    public MedicamentFarmacie createMedicament(String denumire, int pret) {
        return new MedicamentDurere(denumire, pret);
    }
}
