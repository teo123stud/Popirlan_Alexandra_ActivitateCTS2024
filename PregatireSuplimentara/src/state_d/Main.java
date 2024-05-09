package state_d;

public class Main {

    public static void main(String[] args) {


        Bancomat bancomat= new Bancomat("s57eg", 12000);

        bancomat.introduCard();
        bancomat.introducerePIN();
        bancomat.retragere(2200);
        bancomat.retragere(12000);

    }
}
