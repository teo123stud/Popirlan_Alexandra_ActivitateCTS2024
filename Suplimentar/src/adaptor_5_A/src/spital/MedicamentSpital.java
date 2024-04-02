package adaptor_5_A.src.spital;

public class MedicamentSpital implements Medicament{
    @Override
    public void achizitioneazaMedicament() {
        System.out.println("Achiziționare medicament din spital.");
        prezintaReteta();
    }

    @Override
    public void prezintaReteta() {
    System.out.println("Se verifica reteta");
    }
}
