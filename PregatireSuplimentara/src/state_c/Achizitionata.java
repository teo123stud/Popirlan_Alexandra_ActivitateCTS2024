package state_c;


public class Achizitionata implements Stare {
    protected Achizitionata() {
    }


    @Override
    public void seteazaStare(Reteta reteta) {
        reteta.setStare(this);
    }
}
