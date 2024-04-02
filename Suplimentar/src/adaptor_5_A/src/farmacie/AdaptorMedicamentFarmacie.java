package adaptor_5_A.src.farmacie;

import spital.Medicament;

public class AdaptorMedicamentFarmacie implements MedicamentFarmacie{

    private Medicament medicamentSpital;

    public AdaptorMedicamentFarmacie(Medicament medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
