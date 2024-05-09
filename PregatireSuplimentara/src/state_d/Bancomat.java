package state_d;

public class Bancomat {

    private String nrSerieBancomat;

    private Stare stare;

    private int suma;

    public Bancomat(String nrSerieBancomat, int suma) {
        this.nrSerieBancomat = nrSerieBancomat;
        this.stare = new NuAreCard();
        this.suma=suma;
    }

    public String getNrSerieBancomat() {
        return nrSerieBancomat;
    }

    public Stare getStare() {
        return stare;
    }

    protected void setNrSerieBancomat(String nrSerieBancomat) {
        this.nrSerieBancomat = nrSerieBancomat;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }


    public void introduCard( ){
        if(this.stare instanceof NuAreCard ){
            Stare stare= new AreCard();
            stare.seteazaStare(this);

            System.out.println("Ati introdus cardul in bancomatul "+ nrSerieBancomat);
        }
        else{
            System.out.println("Introduceti card!");

        }
    }

    public void introducerePIN( ){
        if(this.stare instanceof AreCard ){
            Stare stare= new ArePinIntrodus();
            stare.seteazaStare(this);

            System.out.println("Ati introdus pinul in bancomatul "+ nrSerieBancomat);
        }
        else{
            System.out.println("Nu aveti introdus cardul!");

        }
    }

    public void retragere( int sumaRetras){
        if(this.stare instanceof ArePinIntrodus && sumaRetras<suma){

            System.out.println("Veti primi suma de "+ sumaRetras);
            suma-=sumaRetras;


        }
        else if(this.stare instanceof ArePinIntrodus && sumaRetras>suma){
            System.out.println("Nu mai sunt bani in bancomat!");
        }
        else{

            System.out.println("Nu aveti introdus cardul!");

        }
    }


}
