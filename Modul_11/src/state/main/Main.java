package state.main;

import state.Pacient;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pacient pacient= new Pacient("Ion");

        pacient.agravareStare();
        pacient.vindecare();

        Pacient pacient3= new Pacient("Iona");

        pacient3.vindecare();
    }
}