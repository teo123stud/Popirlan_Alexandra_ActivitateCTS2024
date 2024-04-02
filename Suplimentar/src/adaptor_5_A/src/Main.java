package adaptor_5_A.src;

import farmacie.AdaptorMedicamentFarmacie;
import spital.Medicament;
import spital.MedicamentSpital;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Medicament medicamentSpital= new MedicamentSpital();
        AdaptorMedicamentFarmacie adaptorMedicamentFarmacie= new AdaptorMedicamentFarmacie(medicamentSpital);

        adaptorMedicamentFarmacie.cumparaMedicament();

    }
}