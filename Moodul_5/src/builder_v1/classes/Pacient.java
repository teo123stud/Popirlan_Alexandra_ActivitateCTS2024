package builder_v1.classes;

public class Pacient {

    private  boolean patRabatabil;

    private  boolean micDejunInclus;

    private  boolean papuciDeCamera;

    private boolean halatPentruInterior;


    public boolean isPatRabatabil() {
        return patRabatabil;
    }

     void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public boolean isMicDejunInclus() {
        return micDejunInclus;
    }

     void setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
    }

    public boolean isPapuciDeCamera() {
        return papuciDeCamera;
    }

     void setPapuciDeCamera(boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
    }

    public boolean isHalatPentruInterior() {
        return halatPentruInterior;
    }

     void setHalatPentruInterior(boolean halatPentruInterior) {
        this.halatPentruInterior = halatPentruInterior;
    }

    public Pacient(boolean patRabatabil, boolean micDejunInclus, boolean papuciDeCamera, boolean halatPentruInterior) {
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciDeCamera = papuciDeCamera;
        this.halatPentruInterior = halatPentruInterior;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "patRabatabil=" + patRabatabil +
                ", micDejunInclus=" + micDejunInclus +
                ", papuciDeCamera=" + papuciDeCamera +
                ", halatPentruInterior=" + halatPentruInterior +
                '}';
    }
}
