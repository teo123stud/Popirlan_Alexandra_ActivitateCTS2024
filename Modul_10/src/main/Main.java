package main;

import strategy.Portar;
import strategy.VerificatorPeluza;
import strategy.VerificatorTribuna;
import strategy.VerificatorVIP;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Portar portar= new Portar();

        String suporter1="GigelVIP";
        String suporet2="IonPeluza";
        String suporter3="AnaTribuna";
        portar.setVerificator(new VerificatorVIP());
        portar.verifcareSuporter(suporter1);

        portar.setVerificator(new VerificatorPeluza());
        portar.verifcareSuporter(suporet2);
        portar.setVerificator(new VerificatorTribuna());
        portar.verifcareSuporter(suporter3);


    }
}