package template_d;

import sun.font.CreatedFontTracker;

public abstract class Template {

    public final void internare(Pacient pacient){
        analizeazaStare(pacient);
        if( disponibilitateSalon()>0){
            emiteFisa(pacient);
        }
        else{
            refuzaInternare(pacient);
        }
    }


    protected abstract void analizeazaStare(Pacient pacient);

    protected abstract int disponibilitateSalon();

    protected abstract void emiteFisa(Pacient pacient);

    protected abstract void refuzaInternare(Pacient pacient);
}
