package main;

import observer.Abonat;
import observer.Observer;
import observer.Vecin;
import subject.Sala;
import subject.Stadion;
import subject.Subject;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Observer abonat= new Abonat("Ion");

        Observer vecini= new Vecin("Bloc 14", 13);

        Subject sala= new Sala();

        sala.adaugaAbonat(abonat);
        sala.adaugaAbonat(vecini);
        sala.notificaFotbal();
        sala.notificaFotbal();
        sala.notificaVolei();

        Subject stadion=new Stadion();

        stadion.adaugaAbonat(abonat);
        stadion.adaugaAbonat(vecini);


        // cast pentru o metoda specifica
        ((Stadion)stadion).notificaConcert();

    }
}