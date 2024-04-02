package E_2_factory_method.factories;

import E_1_simple_factory.Jucator;

public interface FabricaJucator {

    public Jucator createJucator(String nume, int varsta);
}
