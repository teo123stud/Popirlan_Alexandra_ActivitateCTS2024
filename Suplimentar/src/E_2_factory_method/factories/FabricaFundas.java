package E_2_factory_method.factories;

import E_1_simple_factory.Fundas;
import E_1_simple_factory.Jucator;

public class FabricaFundas implements FabricaJucator{
    @Override
    public Jucator createJucator(String nume, int varsta) {
        return new Fundas(nume, varsta);
    }
}
