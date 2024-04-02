package builder_v3_2_B;

public class Main {
    public static void main(String[] args) {

    Rezervare rezervare= new Rezervare.RezervareBuilder().setDecorareaMesei(true).setMuzicaAmbientala(true).setGenMuzica("hip-hop").build();
    Rezervare rezervare1= new Rezervare.RezervareBuilder().build();
    System.out.println(rezervare1.toString());

}}
