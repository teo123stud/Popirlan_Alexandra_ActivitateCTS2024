package main;

import classes.PersonalSpital;
import classes.fabrica.FabricaPersonal;
import classes.fabrica.TipPersonal;


public class Main {
    public static void main(String[] args) throws Exception {
        FabricaPersonal fabricaPersonal= new FabricaPersonal();
        PersonalSpital medic=fabricaPersonal.createPersonal(TipPersonal.MEDIC, "Popescu Maria", 5000);
        PersonalSpital asistent=fabricaPersonal.createPersonal(TipPersonal.ASISTENT, "Popescu Ana", 7000);
        PersonalSpital brancardier = fabricaPersonal.createPersonal(TipPersonal.BRANCARDIER, "Popescu Mihai", 8000);

        medic.afisareDetalii();
        asistent.afisareDetalii();
        brancardier.afisareDetalii();


    }
}