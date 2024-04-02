package E_2_factory_method.factories;

import E_1_simple_factory.Jucator;
import E_1_simple_factory.Portar;

public class FabricaPortar implements FabricaJucator{

    @Override
    public Jucator createJucator(String nume, int varsta) {
        return new Portar(nume, varsta);
    }
}
