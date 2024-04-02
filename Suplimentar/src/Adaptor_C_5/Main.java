package Adaptor_C_5;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AdaptorAplicatieGestiune adaptorAplicatieGestiune= new AdaptorAplicatieGestiune();

        GestionareDepozit gestionareDepozit=adaptorAplicatieGestiune;
        Integer idMedicament = 1; // presupunând că acesta este ID-ul medicamentului pentru care se face verificarea

        Integer numarDorit = 10; // presupunând că se doresc 10 bucăți din medicamentul cu ID-ul specificat

        boolean disponibilitate = gestionareDepozit.verificăStocPentruMedicament(idMedicament, numarDorit);

        // Afișăm rezultatul verificării stocului
        if (disponibilitate) {
            System.out.println("Stoc suficient pentru medicamentul cu ID-ul " + idMedicament);
        } else {
            System.out.println("Stoc insuficient pentru medicamentul cu ID-ul " + idMedicament);
        }
    }
}