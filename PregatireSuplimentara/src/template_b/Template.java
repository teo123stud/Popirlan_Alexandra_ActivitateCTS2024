package template_b;

public abstract class Template {

    public final void ocupaMasa(Persoana persoana){
        curataMasa(persoana);
        aseazaServetele(persoana);
        aseazaTacamuri(persoana);
    }

    public abstract void curataMasa(Persoana persoana);
    public abstract void aseazaServetele(Persoana persoana);
    public abstract void aseazaTacamuri(Persoana persoana);
}
