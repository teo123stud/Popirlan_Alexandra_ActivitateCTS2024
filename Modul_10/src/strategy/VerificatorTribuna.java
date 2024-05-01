package strategy;

public class VerificatorTribuna implements Verificator{

    @Override
    public void verificare(String nume) {
        System.out.println(" Este verificat biletul lui "+ nume+ " la tribuna");
    }
}
