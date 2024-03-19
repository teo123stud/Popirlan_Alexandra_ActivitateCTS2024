package builder_v1.main;


import builder_v1.classes.Pacient;
import builder_v1.classes.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        Pacient pacient= new PacientBuilder().setPatRabatabil(true).setPapuciDeCamera(true).setMicDejunInclus(true).setHalatPentruInterior(true).build();

        Pacient pacient2= new PacientBuilder().setPatRabatabil(true).build();

        System.out.println(pacient);
        System.out.println(pacient2);

        builder_v3.Pacient.PacientBuilder builder= new builder_v3.Pacient.PacientBuilder();

        builder_v3.Pacient pacient3= builder.setHalatPentruInterior(true).setPapuciDeCamera(false).setMicDejunInclus(true).setPatRabatabil(true).build();

        System.out.println(pacient3.toString());
    }
}