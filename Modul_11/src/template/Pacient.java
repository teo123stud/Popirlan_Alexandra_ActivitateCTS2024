package template;

public class Pacient {

    private String nume;

    private int stareSanatate;

    public Pacient(String nume) {
        this.nume = nume;
    }

    public Pacient(String nume, int stareSanatate) {
        this.nume = nume;
        this.stareSanatate = stareSanatate;
    }

    public String getNume() {
        return nume;
    }

    public int getStareSanatate() {
        return stareSanatate;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setStareSanatate(int stareSanatate) {
        this.stareSanatate = stareSanatate;
    }
}
