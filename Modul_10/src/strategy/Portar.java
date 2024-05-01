package strategy;

public class Portar {



    private Verificator verificator;

    public Portar( Verificator verificator) {
        this.verificator = verificator;
    }

    public Portar() {

        this.verificator = new VerificatorPeluza();
    }


    public Verificator getVerificator() {
        return verificator;
    }

    public void setVerificator(Verificator verificator) {
        this.verificator = verificator;
    }

    public void verifcareSuporter(String numeSuporter){
        verificator.verificare(numeSuporter);
    }
}
