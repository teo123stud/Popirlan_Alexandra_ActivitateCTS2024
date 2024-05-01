package strategy;

public class VerificatorVIP implements Verificator{

    @Override
    public void verificare(String nume) {
        System.out.println(" Sunt verificate bagajele lui "+ nume+ " la VIP");
    }
}
