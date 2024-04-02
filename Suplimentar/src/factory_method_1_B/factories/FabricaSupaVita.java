package factory_method_1_B.factories;

import factory_method_1_B.classes.SupaVita;
import factory_method_1_B.classes.SupeRestaurant;

public class FabricaSupaVita implements FabricaRestaurant{
    @Override
    public SupeRestaurant createSupa(int pret) {
        return new SupaVita(pret);
    }
}
