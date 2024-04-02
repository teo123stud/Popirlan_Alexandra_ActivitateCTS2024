package softVechi;

public class Produs {

    private  String denumire;

    private float pret;

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                '}';
    }

    public Produs(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }
}
