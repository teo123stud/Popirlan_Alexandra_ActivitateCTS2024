package E_1_simple_factory.factories;

import E_1_simple_factory.Atacant;
import E_1_simple_factory.Fundas;
import E_1_simple_factory.Jucator;
import E_1_simple_factory.Portar;

public class FabricaJucator {

    public Jucator creareJucator(TipJucator tipJucator, String nume, int varsta) throws Exception {
        switch (tipJucator){
            case FUNDAS:
                return  new Fundas(nume, varsta);
            case PORTAR:
                return  new Portar(nume, varsta);

            case ATACANT:
            return  new Atacant(nume, varsta);
            default:throw  new Exception("nu este tipul corect!");
        }
    };
}
