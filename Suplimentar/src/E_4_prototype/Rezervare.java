package E_4_prototype;

import java.util.HashMap;
import java.util.Map;

public class Rezervare implements  RezervareAbstracta {

    private String nume;

    private String nrTelefon;

    private String email;

    private Map<String, String> listaMeciuriTrecute;

    public Rezervare() {
        this.nume = "Not applicable";
        this.nrTelefon = "Not applicable";
        this.email = "Not applicable";
        this.listaMeciuriTrecute = new HashMap<>();
    }

    public Rezervare(String nume, String nrTelefon, String email, Map<String, String> listaMeciuriTrecute) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
        this.listaMeciuriTrecute = listaMeciuriTrecute;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, String> getListaMeciuriTrecute() {
        return listaMeciuriTrecute;
    }

    public void setListaMeciuriTrecute(Map<String, String> listaMeciuriTrecute) {
        this.listaMeciuriTrecute = new HashMap<>();
        for (String string : listaMeciuriTrecute.keySet()) {
            this.listaMeciuriTrecute.put(string, listaMeciuriTrecute.get(string));
        }
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "nume='" + nume + '\'' +
                ", nrTelefon='" + nrTelefon + '\'' +
                ", email='" + email + '\'' +
                ", listaMeciuriTrecute=" + listaMeciuriTrecute +
                '}';
    }

    @Override
    public RezervareAbstracta clone() {
        Rezervare rezervare = new Rezervare();
        rezervare.setEmail(this.email);
        rezervare.setNrTelefon(this.nrTelefon);
        rezervare.setNume(this.nume);
        rezervare.setListaMeciuriTrecute(this.listaMeciuriTrecute);
        return rezervare;
    }


}
