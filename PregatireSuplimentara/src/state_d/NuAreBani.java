package state_d;

public class NuAreBani implements Stare{

    protected NuAreBani() {
    }

    @Override
    public void seteazaStare(Bancomat bancomat) {
        bancomat.setStare(this);
    }
}
