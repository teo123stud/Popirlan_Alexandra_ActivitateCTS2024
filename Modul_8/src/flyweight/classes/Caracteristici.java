package flyweight.classes;

public class Caracteristici {

    private int pozitiX;

    private int pozitieY;


    private String culoareTricou;

    public Caracteristici(int pozitiX, int pozitieY, String culoareTricou) {
        this.pozitiX = pozitiX;
        this.pozitieY = pozitieY;
        this.culoareTricou=culoareTricou;
    }


    @Override
    public String toString() {
        return "Caracteristici{" +
                "pozitiX='" + pozitiX + '\'' +
                ", pozitieY='" + pozitieY + '\'' +
                ", culoareTricou='" + culoareTricou + '\'' +
                '}';
    }
}
