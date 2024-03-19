package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Reteta implements RetetaAbstracta {

    private Map<String, Double> solutii;

    private String numeMedicament;

    public Reteta() {
        numeMedicament="Not applicable";
        solutii=null;
    }

    public Reteta(Map<String, Double> solutie, String numeMedicament) {
        this.solutii = solutie;
        this.numeMedicament = numeMedicament;
    }

    public Map<String, Double> getSolutie() {
        return solutii;
    }

    public void setSolutie(Map<String, Double> solutii) {
        this.solutii= new HashMap<>();
        for (String solutie: solutii.keySet()){
            this.solutii.put(solutie, solutii.get(solutie));
        }

    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public void setNumeMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    @Override
    public RetetaAbstracta clone() {
        Reteta abstracta= new Reteta();
        abstracta.setNumeMedicament(this.numeMedicament);
        abstracta.setSolutie(this.solutii);
        return abstracta;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "solutii=" + solutii +
                ", numeMedicament='" + numeMedicament + '\'' +
                '}';
    }
}
