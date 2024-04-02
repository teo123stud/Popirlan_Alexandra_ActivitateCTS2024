package program;

import softNou.AdapterBarBucatarie;
import softNou.Bar;
import softNou.Bautura;
import softVechi.AdapterBauturaProdus;
import softVechi.Bucatarie;
import softVechi.Produs;
import softVechi.SoftBucatarie;

public class Main {

    public static void platesteConsumatia(SoftBucatarie comanda){
       comanda.printareBon();
    }


    public static void main(String[] args) {
        SoftBucatarie softBucatarie=new Bucatarie();

        Produs produs= new Produs("1", 12);
        Produs produs2= new Produs("2", 13);

        softBucatarie.adaugareProdus(produs);
        softBucatarie.adaugareProdus(produs2);

        platesteConsumatia(softBucatarie);

        AdapterBarBucatarie adapterBarBucatarie= new AdapterBarBucatarie();
        adapterBarBucatarie.adaugaBautura(new Bautura(22, "apa",12.4f));


        adapterBarBucatarie.adaugareProdus(new AdapterBauturaProdus(new Bautura(12, "sprite", 12.3f)));

        platesteConsumatia(adapterBarBucatarie);
    }
}