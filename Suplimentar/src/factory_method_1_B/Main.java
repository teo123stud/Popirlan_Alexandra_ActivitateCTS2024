package factory_method_1_B;

import factory_method_1_B.classes.SupeRestaurant;
import factory_method_1_B.factories.FabricaRestaurant;
import factory_method_1_B.factories.FabricaSupaCiuperci;
import factory_method_1_B.factories.FabricaSupaLegume;
import factory_method_1_B.factories.FabricaSupaVita;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FabricaRestaurant fabricaSupaCiuperci=new FabricaSupaCiuperci();
        FabricaRestaurant fabricaSupaLegume=new FabricaSupaLegume();
        FabricaRestaurant fabricaSupaVita=new FabricaSupaVita();

        SupeRestaurant supaCiuperci=fabricaSupaCiuperci.createSupa(20);
        SupeRestaurant supaLegume=fabricaSupaLegume.createSupa(22);
        SupeRestaurant supaVita=fabricaSupaVita.createSupa(26);

        supaCiuperci.afisareDetalii();
        supaLegume.afisareDetalii();
        supaVita.afisareDetalii();

    }
}