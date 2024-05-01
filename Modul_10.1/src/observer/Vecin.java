package observer;

public class Vecin implements Observer {

    private String nume;

    private float distantaKm;

    public Vecin(String nume, float distantaKm) {
        this.nume = nume;
        this.distantaKm = distantaKm;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(nume+ " , abonatii de la sala situatata la distanta de "+ distantaKm+
                " au primit urmatorul mesaj "+ mesaj);
    }
}
