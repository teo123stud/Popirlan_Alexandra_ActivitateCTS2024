package factory_method_1_B.factories;

import factory_method_1_B.classes.SupaCiuperci;
import factory_method_1_B.classes.SupeRestaurant;

public class FabricaSupaCiuperci implements FabricaRestaurant{

    @Override
    public SupeRestaurant createSupa(int pret) {
        return new SupaCiuperci(pret);
    }
}
