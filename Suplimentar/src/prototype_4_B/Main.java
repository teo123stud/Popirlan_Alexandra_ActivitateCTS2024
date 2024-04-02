package prototype_4_B;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        Map<Integer, String> listaRezervare = new HashMap<>();
        listaRezervare.put(1, "11-02-2022");
        listaRezervare.put(2, "13-12-2023");

        Rezervare prototip= new Rezervare("Ion", "0732451482", listaRezervare);

        System.out.println(prototip);

        Rezervare clona= (Rezervare) prototip.clone();


         System.out.println(clona);

    }
}
