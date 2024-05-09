package state_d;

public class NuAreCard implements Stare{

    protected NuAreCard() {
    }

    @Override
    public void seteazaStare(Bancomat bancomat) {
        bancomat.setStare(this);
    }
}
