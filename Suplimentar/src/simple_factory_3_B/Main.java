package simple_factory_3_B;

import simple_factory_3_B.classes.SupeRestaurant;
import simple_factory_3_B.factories.FabricaSupa;
import simple_factory_3_B.factories.TipSupa;

public class Main {
    public static void main(String[] args) throws Exception {

        FabricaSupa fabricaSupa= new FabricaSupa();

        SupeRestaurant ciuperci= fabricaSupa.createSupa(TipSupa.CIUPERCI, 30);
        SupeRestaurant vita= fabricaSupa.createSupa(TipSupa.VITA, 20);
        SupeRestaurant legume= fabricaSupa.createSupa(TipSupa.LEGUME, 10);

        ciuperci.afisareDetalii();
        vita.afisareDetalii();
        legume.afisareDetalii();


    }
    }

