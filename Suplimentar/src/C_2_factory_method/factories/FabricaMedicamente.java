package C_2_factory_method.factories;

import C_2_factory_method.MedicamentFarmacie;

public interface FabricaMedicamente {

    public MedicamentFarmacie createMedicament(String denumire, int pret);
}
