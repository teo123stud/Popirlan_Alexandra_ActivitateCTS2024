package template_d;

public class Main {

    public static void main(String[] args) {
        Pacient pacient= new Pacient("Ion", 4);

        Spital spital= new Spital("Coltea", 1);
        Spital spital1= new Spital("Matei Balsh", 0);

        spital.internare(pacient);
        spital1.internare(pacient);
    }
}
