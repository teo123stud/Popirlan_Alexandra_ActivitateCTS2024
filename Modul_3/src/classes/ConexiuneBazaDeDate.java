package classes;

public class ConexiuneBazaDeDate {

    private String numeBaza;

    private int nrTabele;

    private String linkConexiune;

    private static ConexiuneBazaDeDate instanta=null;

    private ConexiuneBazaDeDate(String numeBaza, int nrTabele, String linkConexiune) {
        this.numeBaza = numeBaza;
        this.nrTabele = nrTabele;
        this.linkConexiune = linkConexiune;
    }

    public ConexiuneBazaDeDate(String numeBaza) {
        this.numeBaza = numeBaza;
    }



    public void setNumeBaza(String numeBaza) {
        this.numeBaza = numeBaza;
    }


    public void setNrTabele(int nrTabele) {
        this.nrTabele = nrTabele;
    }

    public void setLinkConexiune(String linkConexiune) {
        this.linkConexiune = linkConexiune;
    }



    @Override
    public String toString() {
        return "Baza De Date " + numeBaza + " cu "+
                nrTabele + " tabele"+
                ", linkConexiune: " + linkConexiune ;
    }

    //eager initialization vs lazy initialization
    //apelata doar pe aceszt fir de executie
    //synchronized nu permite sa se treaca pe firul 2 de executie, ca sa nu se apeleze de mai multe ori constructorul
    public  static synchronized ConexiuneBazaDeDate getInstance(String numeBaza, int nrTabele, String linkConexiune){
        if (instanta==null){
            instanta=new ConexiuneBazaDeDate(numeBaza, nrTabele, linkConexiune);
        }
       return instanta;
    }
}
