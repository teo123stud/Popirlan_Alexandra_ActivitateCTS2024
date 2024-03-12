package main;

import classes.Asistent;
import classes.Medic;
import classes.PersonalSpital;
import classes.factory.FabricaAsistent;
import classes.factory.FabricaBrancardier;
import classes.factory.FabricaMedic;
import classes.factory.FabricaPersonal;


public class Main {

    public  static void prelucrarePersonal(FabricaPersonal fabricaPersonal, String nume, int salariu){
        PersonalSpital personalSpital=fabricaPersonal.createPersonal(nume, salariu);
        personalSpital.afisareDetalii();
    }


    public static void main(String[] args) {



        FabricaPersonal fabricaMedic= new FabricaMedic();
        FabricaPersonal fabricaAsistent= new FabricaAsistent();
        FabricaPersonal fabricaBrancardier= new FabricaBrancardier();

        PersonalSpital medic= fabricaMedic.createPersonal("Popescu Ion", 1100);
        PersonalSpital asistent= fabricaAsistent.createPersonal("Popescu Ioana", 1200);
        PersonalSpital brancardier= fabricaBrancardier.createPersonal("Popescu Ioana Maria", 1300);

        prelucrarePersonal(new FabricaMedic(), "Butacu Marian", 200);



        medic.afisareDetalii();
        asistent.afisareDetalii();
        brancardier.afisareDetalii();

    }
}