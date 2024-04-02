package E_3_builder;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare.RezervareBuilder().setHasBauturaInclusa(true).build();
        Rezervare rezervare1 = new Rezervare.RezervareBuilder().setHasBauturaInclusa(false).build();

        System.out.println(rezervare1.toString());

    }
}
