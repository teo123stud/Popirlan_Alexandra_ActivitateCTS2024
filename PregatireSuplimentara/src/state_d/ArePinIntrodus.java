package state_d;

public class ArePinIntrodus implements Stare{

    protected ArePinIntrodus() {
    }

    @Override
    public void seteazaStare(Bancomat bancomat) {
        bancomat.setStare(this);
    }
}
