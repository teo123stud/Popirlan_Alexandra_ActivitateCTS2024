package E_4_prototype;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> lista= new HashMap<>();
        lista.put("Meci RO-BG", "2022-23-01");
        lista.put("Meci RM-BAR", "2023-22-02");

        Rezervare prototip= new Rezervare("Oprescu", "07324112", "email", lista);
        System.out.println(prototip.toString());

        Rezervare clona= (Rezervare) prototip.clone();
        System.out.println(clona.toString());
        System.out.println("============");
        System.out.println(prototip.toString());
        clona.getListaMeciuriTrecute().put("meci nou", "12.12.12");
        System.out.println(clona.toString());
        System.out.println(prototip.toString());

        Rezervare clona2= (Rezervare) clona.clone();
        clona2.getListaMeciuriTrecute().put("ALT MECI", "2023-22-22");
        System.out.println(clona);
        System.out.println(clona2);



    }
}
