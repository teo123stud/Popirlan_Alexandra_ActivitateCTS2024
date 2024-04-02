package C_4_prototype;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements RetetaAbstracta{

    private String numeMedicament;

    private Map<String, Double> listaSolutii;

    public Reteta(String numeMedicament, Map<String, Double> listaSolutii) {
        this.numeMedicament = numeMedicament;
        this.listaSolutii = listaSolutii;
    }

    public Reteta() {
        this.numeMedicament="unknown";
        this.listaSolutii=new HashMap<>();
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public void setNumeMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public Map<String, Double> getListaSolutii() {
        return listaSolutii;
    }

    public void setListaSolutii(Map<String, Double> listaSolutii) {
        this.listaSolutii = new HashMap<>();
        for (String solutie: listaSolutii.keySet()){
            this.listaSolutii.put(solutie, listaSolutii.get(solutie));
        }
    }

    @Override
    public RetetaAbstracta clone() {
        Reteta abstracta= new Reteta();
        abstracta.setListaSolutii(this.listaSolutii);
        abstracta.setNumeMedicament(this.numeMedicament);
        return abstracta;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "numeMedicament='" + numeMedicament + '\'' +
                ", listaSolutii=" + listaSolutii +
                '}';
    }
}
