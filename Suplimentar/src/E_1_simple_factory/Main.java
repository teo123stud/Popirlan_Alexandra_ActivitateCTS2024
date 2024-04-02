package E_1_simple_factory;

import E_1_simple_factory.factories.FabricaJucator;
import E_1_simple_factory.factories.TipJucator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        FabricaJucator fabricaJucator= new FabricaJucator();

        Jucator portar= fabricaJucator.creareJucator(TipJucator.PORTAR, "Ion", 22);
        Jucator fundas= fabricaJucator.creareJucator(TipJucator.FUNDAS, "Ionel", 22);

        portar.afisareDetalii();
        fundas.afisareDetalii();
        }
    }
