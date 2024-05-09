package state_b;

public class Rezervata implements Stare{

    protected Rezervata() {
    }

    @Override
    public void stareMasa(Rezervare rezervare) {
        rezervare.setStareMasa(this);
    }
}
