package factory_method_1_B.factories;

import factory_method_1_B.classes.SupaLegume;
import factory_method_1_B.classes.SupeRestaurant;

public class FabricaSupaLegume implements FabricaRestaurant{
    @Override
    public SupeRestaurant createSupa(int pret) {
        return new SupaLegume(pret);
    }
}
