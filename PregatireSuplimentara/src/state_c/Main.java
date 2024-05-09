package state_c;

public class Main {

    public static void main(String[] args) {
        Reteta reteta= new Reteta("536367");

        reteta.solicitaMedicamente();
        reteta.achizitioneazaMedicamente();
    }
}
