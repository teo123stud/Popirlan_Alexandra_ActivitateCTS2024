package template_d;

public class Spital extends Template {

    private String numeSpital;

    private int nrLocuri;

    public Spital(String numeSpital, int nrLocuri) {
        this.numeSpital = numeSpital;
        this.nrLocuri = nrLocuri;
    }

    public String getNumeSpital() {
        return numeSpital;
    }

    public void setNumeSpital(String numeSpital) {
        this.numeSpital = numeSpital;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    @Override
    protected void analizeazaStare(Pacient pacient) {
        System.out.println(" Pacientul "+ pacient.getNume()+ " are o gravitate a starii de "+ pacient.getGravitateStare()+"/5");
    }

    @Override
    protected int disponibilitateSalon() {
        return nrLocuri;
    }

    @Override
    protected void emiteFisa(Pacient pacient) {
        nrLocuri--;
       System.out.println(" Pacientului "+ pacient.getNume()+ " i s-a emis fisa si va fi internat in Spitalul "+ getNumeSpital());
    }

    @Override
    protected void refuzaInternare(Pacient pacient) {
        System.out.println(" Nu mai exsita locuri libere in spital!");
    }
}
