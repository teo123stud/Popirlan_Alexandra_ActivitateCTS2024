package prototype_4_B;

import java.util.HashMap;
import java.util.Map;

public class Rezervare implements RezervareAbstracta{

    private String numeClient;

    private String numarTelefon;

    private Map<Integer, String> listaRezervari;

    public Rezervare() {
        numeClient="Not applicable";
        numarTelefon="Unknown";
        listaRezervari=null;
    }

    public Rezervare(String numeClient, String numarTelefon, Map<Integer, String> listaRezervari) {
        this.numeClient = numeClient;
        this.numarTelefon = numarTelefon;
        this.listaRezervari = listaRezervari;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    public Map<Integer, String> getListaRezervari() {
        return listaRezervari;
    }

    public void setListaRezervari(Map<Integer, String> listaRezervari) {
        this.listaRezervari= new HashMap<>();
        for(Integer id: listaRezervari.keySet()){
            this.listaRezervari.put(id, listaRezervari.get(id));
        }
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "numeClient='" + numeClient + '\'' +
                ", numarTelefon='" + numarTelefon + '\'' +
                ", listaRezervari=" + listaRezervari +
                '}';
    }

    @Override
    public RezervareAbstracta clone() {
        Rezervare abstracta= new Rezervare();
        abstracta.setNumarTelefon(this.numarTelefon);
        abstracta.setListaRezervari(this.listaRezervari);
        abstracta.setNumeClient(this.numeClient);
        return abstracta;
    }
}
