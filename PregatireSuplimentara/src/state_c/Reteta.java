package state_c;


public class Reteta {

    private String serieUnica;

    private Stare stare;

    public Reteta(String serieUnica) {
        this.serieUnica = serieUnica;
        this.stare = new Emisa();
    }

    public void setSerieUnica(String serieUnica) {
        this.serieUnica = serieUnica;
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }


    public void solicitaMedicamente(){
        if(this.stare instanceof Emisa){
            Stare stare= new Solicitata();
            stare.seteazaStare(this);

            System.out.println(" Reteta "+ serieUnica+ " a fost solicitata!");
        }
        else{
            System.out.println(" Reteta nu a fost emisa!");
        }
    }

    public void achizitioneazaMedicamente(){
        if(this.stare instanceof Solicitata){
            Stare stare= new Achizitionata();
            stare.seteazaStare(this);

            System.out.println(" Reteta "+ serieUnica+ " a fost achizitionata!");
        }
        else{
            System.out.println(" Reteta nu a fost solcitata!");
        }
    }
}
