package template;

public abstract class Template {

    public final void internare(Pacient pacient     ) {
      analizeazaStare(pacient);
      if(verificareDisponibilitate()>0){
          emitereFisa(pacient);
      }
      else {
          refuzaInternare(pacient);
      }
    }

    protected abstract void analizeazaStare(Pacient pacient);
    protected abstract int verificareDisponibilitate();

    protected abstract void emitereFisa(Pacient pacient);

    protected abstract void refuzaInternare(Pacient pacient);


}
