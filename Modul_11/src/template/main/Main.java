package template.main;

import template.Pacient;
import template.Spital;

public class Main {

    public static void main(String[] args) {
        Spital spital= new Spital("Coltea", 2 );

        Pacient pacient1= new Pacient("Ion", 2);
        Pacient pacient2= new Pacient("Ion", 5);
        Pacient pacient3= new Pacient("Ion", 3);


        spital.internare(pacient1);
        spital.internare(pacient2);
        spital.internare(pacient3);

    }
}
