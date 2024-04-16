package proxy.classes;

public class Proxy implements Vanzare{

    private Vanzare vanzareBilet;
    private static int varstaMinima=14;

    //daca e sttaic n-ai nevoie de constructor cu ambii
    public Proxy(Vanzare vanzareBilet) {
        this.vanzareBilet = vanzareBilet;
    }


    public static void setVarstaMinima(int varstaMinima) {
        Proxy.varstaMinima = varstaMinima;
    }

    @Override
    public void vanzare(Persoana persoana) {
        if (persoana.getVarsta() >= varstaMinima) {
            vanzareBilet.vanzare(persoana);
        } else {
            System.out.println("Persoana trebuie sa aiba peste 14 ani, dar aceasta are "+ persoana.getVarsta()+" !");
        }
    }
}
