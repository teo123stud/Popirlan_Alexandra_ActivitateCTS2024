package state_c;

public class Solicitata implements Stare{

    protected Solicitata() {
    }

    @Override
    public void seteazaStare(Reteta reteta) {
        reteta.setStare(this);
    }
}
