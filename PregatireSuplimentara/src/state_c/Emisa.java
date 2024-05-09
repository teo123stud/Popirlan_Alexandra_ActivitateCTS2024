package state_c;

public class Emisa implements Stare{

    protected Emisa() {
    }

    @Override
    public void seteazaStare(Reteta reteta) {
        reteta.setStare(this);
    }
}
