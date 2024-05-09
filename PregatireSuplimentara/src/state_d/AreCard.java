package state_d;

public class AreCard implements Stare{

    protected AreCard() {
    }

    @Override
    public void seteazaStare(Bancomat bancomat) {
        bancomat.setStare(this);
    }
}
