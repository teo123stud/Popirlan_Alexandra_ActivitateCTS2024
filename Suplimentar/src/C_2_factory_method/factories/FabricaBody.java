package C_2_factory_method.factories;

import C_2_factory_method.MedicamentBody;
import C_2_factory_method.MedicamentFarmacie;

public class FabricaBody implements FabricaMedicamente{
    @Override
    public MedicamentFarmacie createMedicament(String denumire, int pret) {
        return new MedicamentBody(denumire,pret);
    }
}
