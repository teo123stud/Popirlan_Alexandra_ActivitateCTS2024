package Adaptor_C_5.softVechi;

public class Medicament implements AplicatieVanzare {

    private int id;

    private int nrBucatiStoc;

    public Medicament(int id, int nrBucatiStoc) {
        this.id = id;
        this.nrBucatiStoc = nrBucatiStoc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNrBucatiStoc() {
        return nrBucatiStoc;
    }

    public void setNrBucatiStoc(int nrBucatiStoc) {
        this.nrBucatiStoc = nrBucatiStoc;
    }

    @Override
    public String toString() {
        return "Medicament{" +
                "id=" + id +
                ", nrBucatiStoc=" + nrBucatiStoc +
                '}';
    }

    @Override
    public void setareMedicament(Integer id) {
        this.id=id;
    }

    @Override
    public boolean verificareDisponibilitate(Integer numarDorit) {
        if(nrBucatiStoc>=numarDorit){
            return true;
        }
        else return false;
    }
}
