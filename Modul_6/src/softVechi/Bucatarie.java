package softVechi;

import java.util.ArrayList;
import java.util.List;

public class Bucatarie implements SoftBucatarie {

    private List<Produs> listaProduse;
    public Bucatarie() {
        this.listaProduse = new ArrayList<>();
    }

    public void adaugareProdus(Produs produs){
        this.listaProduse.add(produs);
    }

    @Override
    public String toString() {
        return "Bucatarie{" +
                "listaProduse=" + listaProduse +
                '}';
    }

    @Override
    public void printareBon() {
        System.out.println("Lista de produse este: ");
        float total=0;
        for(Produs p: listaProduse){
            System.out.println("Produsul "+ p);
            total=total+p.getPret();

        }
        System.out.println("Totalul bonului:"+ total);
    }
}
