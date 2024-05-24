package template_d;

public class Pacient {
    
    private String nume;
    
    private int gravitateStare;

    public Pacient(String nume, int varsta) {
        this.nume = nume;
        this.gravitateStare = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getGravitateStare() {
        return gravitateStare;
    }

    public void setGravitateStare(int gravitateStare) {
        this.gravitateStare = gravitateStare;
    }
}
