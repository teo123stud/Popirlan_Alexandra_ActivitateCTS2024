package template_b;

public class Main {

    public static void main(String[] args) {
        Persoana persoana= new Persoana("Ion");

        Masa masa= new Masa(1);

        masa.curataMasa(persoana);
        masa.aseazaServetele(persoana);
        masa.aseazaTacamuri(persoana);
    }
}
