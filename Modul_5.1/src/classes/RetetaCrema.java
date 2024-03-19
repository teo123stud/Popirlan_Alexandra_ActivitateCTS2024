package classes;

public class RetetaCrema implements RetetaAbstracta {

    private String nume;

    private int cantitate;

    public RetetaCrema(String nume, int cantitate) {
        this.nume = nume;
        this.cantitate = cantitate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }



    public RetetaCrema() {
        nume="Not applicable";
        cantitate=10;
    }

    @Override
    public RetetaAbstracta clone() {
        RetetaCrema retetaCrema= new RetetaCrema();
        retetaCrema.setNume(this.nume);
        retetaCrema.setCantitate(this.cantitate);
        return retetaCrema;
    }

    @Override
    public String toString() {
        return "RetetaCrema{" +
                "nume='" + nume + '\'' +
                ", cantitate=" + cantitate +
                '}';
    }
}
