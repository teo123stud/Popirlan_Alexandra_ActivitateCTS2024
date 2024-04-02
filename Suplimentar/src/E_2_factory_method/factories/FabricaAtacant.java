package E_2_factory_method.factories;

import E_1_simple_factory.Atacant;
import E_1_simple_factory.Jucator;

public class FabricaAtacant implements FabricaJucator{

    @Override
    public Jucator createJucator(String nume, int varsta) {
        return new Atacant(nume, varsta);
    }
}
