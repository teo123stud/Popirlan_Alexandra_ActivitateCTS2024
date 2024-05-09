package template_b;

public class Masa extends Template{

    private int nrMasa;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    @Override
    public void curataMasa(Persoana persoana) {
        System.out.println("Masa "+ nrMasa+" a fost curatata!");
    }

    @Override
    public void aseazaServetele(Persoana persoana) {
        System.out.println("Pe masa "+ nrMasa+" au fost asezate servetelele!");
    }

    @Override
    public void aseazaTacamuri(Persoana persoana) {
        System.out.println("Pe masa "+ nrMasa+" au fost asezate tacamurile!"+ " Clientul "+ persoana.getNume()+ "este poftit la masa!");
    }
}
