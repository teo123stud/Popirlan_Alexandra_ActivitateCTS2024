package decorator.decorator;

import decorator.spital.DiagnosticAbstract;

public abstract class Decorator implements DiagnosticAbstract{

    private DiagnosticAbstract diagnostic;

    public DiagnosticAbstract getDiagnostic() {
        return diagnostic;
    }

    public Decorator(DiagnosticAbstract diagnostic) {
        this.diagnostic = diagnostic;
    }

    @Override
    public void printeazaDiagnostic() {
        diagnostic.printeazaDiagnostic();
        System.out.println("Rezultatul este disponibil si pe platforma.");
    }

    @Override
    public String getNumeDiagnostic() {
        return diagnostic.getNumeDiagnostic();
    }

    @Override
    public String getSimptome() {
        return diagnostic.getSimptome();
    }

    @Override
    public boolean isNecesitaSpitalizare() {
        return diagnostic.isNecesitaSpitalizare();
    }

    public abstract void  afiseazaOnline();
}
