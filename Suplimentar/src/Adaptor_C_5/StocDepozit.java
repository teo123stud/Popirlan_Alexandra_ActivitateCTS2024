package Adaptor_C_5;

import Adaptor_C_5.softNou.softVechi.Medicament;

public class StocDepozit extends Medicament implements GestionareDepozit {
    public StocDepozit(int id, int nrBucatiStoc) {
        super(id, nrBucatiStoc);
    }

    @Override
    public boolean verificăStocPentruMedicament(Integer id, Integer numarDorit) {
        if(super.getNrBucatiStoc()>numarDorit){
            return  true;
        }
        else return false;
    }
}
