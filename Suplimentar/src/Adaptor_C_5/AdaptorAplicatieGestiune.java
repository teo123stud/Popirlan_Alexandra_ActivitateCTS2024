package Adaptor_C_5;

import Adaptor_C_5.softNou.softVechi.AplicatieVanzare;

public class AdaptorAplicatieGestiune implements GestionareDepozit{

    private AplicatieVanzare aplicatieVanzare;

    public AplicatieVanzare getAplicatieVanzare() {
        return aplicatieVanzare;
    }

    @Override
    public boolean verificăStocPentruMedicament(Integer id, Integer numarDorit) {
       if(aplicatieVanzare!=null && aplicatieVanzare.verificareDisponibilitate(id)){
           return true;
       }
       else return false;
    }
}
