package flyweight.classes;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {

    private Map<String, Flyweight> spectatori;

    public Fabrica() {
        this.spectatori = new HashMap<String, Flyweight>();
    }

    public Flyweight getSpectatori(int inaltime, int latime){
        String cheie= " " + inaltime + "_" + latime;
        Flyweight flyweight= spectatori.get(cheie);
        if(flyweight==null){
            flyweight=new Spectator(inaltime, latime);
            spectatori.put(cheie, flyweight);
        }
        return flyweight;
    }
}
