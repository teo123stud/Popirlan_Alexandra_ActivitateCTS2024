package template;

import template.Pacient;

public class Spital extends Template{

    private String numeSpital;
    private int nrPaturiLibere;

    public Spital(String numeSpital, int nrPaturiLibere) {
        this.numeSpital = numeSpital;
        this.nrPaturiLibere = nrPaturiLibere;
    }

    @Override
    protected void analizeazaStare(Pacient pacient) {
        pacient.setStareSanatate(pacient.getStareSanatate());
        System.out.println("Pacientul " + pacient.getNume() + " are starea "
                + pacient.getStareSanatate());
    }

    @Override
    protected int verificareDisponibilitate() {
        return nrPaturiLibere;
    }

    @Override
    protected void emitereFisa(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume()
                + " este internat in spitalul " + numeSpital);
        nrPaturiLibere--;
    }

    @Override
    protected void refuzaInternare(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume()
                + " este trimis la alt spital pentru ca spitalul "+ numeSpital + " nu mai are locuri");
    }
}
