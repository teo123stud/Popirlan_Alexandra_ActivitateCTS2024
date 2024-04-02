package simple_factory_3_B.factories;

import simple_factory_3_B.classes.SupaCiuperci;
import simple_factory_3_B.classes.SupaLegume;
import simple_factory_3_B.classes.SupaVita;
import simple_factory_3_B.classes.SupeRestaurant;

public class FabricaSupa {

    public SupeRestaurant createSupa( TipSupa tipSupa, int pret) throws Exception {
        switch (tipSupa){
            case VITA:
                return new SupaVita(pret);
            case LEGUME:
                return new SupaLegume(pret);
            case CIUPERCI:
                return new SupaCiuperci(pret);
            default:throw new Exception("Nu exista tipul acesta de supa!");
        }
    }
}
