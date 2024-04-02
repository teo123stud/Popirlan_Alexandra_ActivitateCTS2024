package softNou;

import softVechi.Produs;
import softVechi.SoftBucatarie;

public class AdapterBarBucatarie extends Bar implements SoftBucatarie {
    @Override
    public void printareBon() {
     super.printareNoteDePlata();
    }

    @Override
    public void adaugareProdus(Produs p) {
        //nu este recomdat, trebuia adapter de clasa
         Bautura b= new Bautura(p.getPret(), p.getDenumire(), 0);
         super.adaugaBautura(b);
    }
}
