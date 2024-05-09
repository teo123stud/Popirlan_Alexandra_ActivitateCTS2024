package state_b;

public class Libera implements Stare{

    protected Libera() {
    }

    @Override
    public void stareMasa(Rezervare rezervare) {
        rezervare.setStareMasa(this);
    }
}
