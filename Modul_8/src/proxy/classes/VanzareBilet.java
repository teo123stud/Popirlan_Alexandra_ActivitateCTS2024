package proxy.classes;

public class VanzareBilet implements Vanzare {

    private  String meci;

    private float pret;

    public VanzareBilet(String meci, float pret) {
        this.meci = meci;
        this.pret = pret;
    }

    @Override
    public void vanzare(Persoana persoana) {
        System.out.println("Perosna "+ persoana.getNume()+ " a cumparat la meciul "+ meci + " platind " + pret);
    }
}
