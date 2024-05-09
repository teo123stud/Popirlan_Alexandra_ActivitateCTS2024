package state_b;

public class Ocupata implements  Stare{

    protected Ocupata() {
    }

    @Override
    public void stareMasa(Rezervare rezervare) {
        rezervare.setStareMasa(this);
    }
}
