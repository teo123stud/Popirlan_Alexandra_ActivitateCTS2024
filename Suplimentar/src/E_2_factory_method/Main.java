package E_2_factory_method;

import E_1_simple_factory.Jucator;
import E_2_factory_method.factories.FabricaAtacant;
import E_2_factory_method.factories.FabricaFundas;
import E_2_factory_method.factories.FabricaJucator;
import E_2_factory_method.factories.FabricaPortar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        FabricaJucator fabricaAtacant= new FabricaAtacant();
        FabricaJucator fabricaFundas= new FabricaFundas();
        FabricaJucator fabricaPortar= new FabricaPortar();

        Jucator atacant= fabricaAtacant.createJucator("Razvan", 23);
        Jucator fundas= fabricaFundas.createJucator("Ion", 43);
        Jucator portar= fabricaPortar.createJucator("Ellen", 33);

        atacant.afisareDetalii();
        fundas.afisareDetalii();
        portar.afisareDetalii();


    }
}
