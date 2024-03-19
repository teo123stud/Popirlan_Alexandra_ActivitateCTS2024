package builder_v1.classes;

public class PacientBuilder implements Builder {

    Pacient pacient;

    public PacientBuilder(){
        pacient= new Pacient(false, false, false, false);

    }


    public PacientBuilder setPatRabatabil(boolean patRabatabil) {
        this.pacient.setPatRabatabil(patRabatabil);
        return this;
    }


    public PacientBuilder setMicDejunInclus(boolean micDejunInclus) {
        this.pacient.setMicDejunInclus(micDejunInclus);
        return this;
    }


    public PacientBuilder setPapuciDeCamera(boolean papuciDeCamera) {
        this.pacient.setPapuciDeCamera(papuciDeCamera);
        return this;
    }

    public PacientBuilder setHalatPentruInterior(boolean halatPentruInterior) {
        this.pacient.setHalatPentruInterior(halatPentruInterior);
        return this;
    }

    @Override
    public Pacient build() {
        return pacient;
    }
}
