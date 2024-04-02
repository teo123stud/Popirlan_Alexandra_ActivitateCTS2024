package C_4_prototype;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> solutiileInitiale = new HashMap<>();
        solutiileInitiale.put("Substanta1", 100.0);
        solutiileInitiale.put("Substanta2", 50.0);

        Reteta prototip= new Reteta("Med1", solutiileInitiale);
        Reteta clona= (Reteta) prototip.clone();

        System.out.println(prototip);
        System.out.println("----");
        System.out.println(clona.toString());

        clona.getListaSolutii().put("substanta3",2.0);
        System.out.println("--AFTER MODIFY CLONE--");
        System.out.println(prototip);
        System.out.println("----");
        System.out.println(clona.toString());

        Reteta clona2= (Reteta) clona.clone();
        System.out.println("--CLONE 2 after clone 1--");
        System.out.println(clona2);
        clona2.setNumeMedicament("Med4");
        System.out.println("--CLONE  1 care trebuie s afie med1--");
        System.out.println(clona);
        System.out.println("--CLONE  2 care trebuie s afie med4--");
        System.out.println(clona2);

        for(Map.Entry<String, Double> entry: clona2.getListaSolutii().entrySet()){
            System.out.println(entry.getKey()+ " + "+ entry.getValue());
        }
    }
}
