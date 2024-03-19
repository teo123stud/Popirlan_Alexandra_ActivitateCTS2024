package main;

import classes.Reteta;
import classes.RetetaAbstracta;
import classes.RetetaCrema;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<String, Double> solutii= new HashMap<>();
        solutii.put("solutie1", 11.23);
        solutii.put("solutie2", 13.23);
        solutii.put("solutie3", 14.23);
        Reteta prototip= new Reteta(solutii, "Medicament1");

        RetetaAbstracta reteta2= prototip.clone();

        System.out.println(prototip);
        System.out.println(reteta2);

        RetetaCrema prototip1= new RetetaCrema("medicament1", 10);

        RetetaAbstracta reteta3= prototip1.clone();

        System.out.println(prototip1);
        System.out.println(reteta3);


    }
}