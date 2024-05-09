package state_b;

public class Rezervare {

    private String numeClient;

    private Stare stareMasa;

    public Rezervare(String numeClient) {
        this.numeClient = numeClient;
        this.stareMasa = new Libera();
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    protected void setStareMasa(Stare stareMasa) {
        this.stareMasa = stareMasa;
    }

    public void rezervaMasa(){
        if( this.stareMasa instanceof Libera){
            Stare stare= new Rezervata();
            stare.stareMasa(this);

            System.out.println(" Clientul "+ this.numeClient+ " a rezervat masa!");
        }
        else{
            System.out.println(" Nu exista mese libere!");
        }
    }

    public void ocupaMasa(){
        if( this.stareMasa instanceof Rezervata){
            Stare stare= new Ocupata();
            stare.stareMasa(this);

            System.out.println(" Clientul "+ this.numeClient+ " a ocupat masa!");
        }
        else{
            System.out.println(" Nu ati facut rezervare! Masa nu se poate ocupa fara!");
        }
    }

    public void golesteMasa(){
        if( this.stareMasa instanceof Ocupata){
            Stare stare= new Libera();
            stare.stareMasa(this);

            System.out.println(" Clientul "+ this.numeClient+ " a parasit masa! ");
        }
        else{
            System.out.println(" Masa nu este ocupata!");
        }
    }



}
