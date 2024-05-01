package strategy;

public class VerificatorPeluza implements Verificator{

    @Override
    public void verificare(String nume) {
        System.out.println(" Este verificat corporal si la bagaje spectatorul "+ nume + " la peluza");
    }
}
