package decorator.decorator;

import decorator.spital.DiagnosticAbstract;

public class WebSite extends  Decorator{
    public WebSite(DiagnosticAbstract diagnostic) {
        super(diagnostic);
    }

    @Override
    public void afiseazaOnline() {
        System.out.println("In cadrul aplicatiei web ati primit diagnosticul "
                + super.getNumeDiagnostic()
                + " cu simptomele " + super.getSimptome()
                + " si " + (super.isNecesitaSpitalizare() ? " ": " nu ") +  " aveti nevoie de spitalizare: "+ super.isNecesitaSpitalizare());
    }
}
