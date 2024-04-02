package C_3_builder;

public class Main {

    public static void main(String[] args) {
     Factura factura= new Factura.FacturaBuilder().setCardFidelitate(true).setPlataCuCard(true).build();
        Factura factura2= new Factura.FacturaBuilder().setCardFidelitate(true).setNrPungi(3).build();

     System.out.println(factura.toString());
        System.out.println(factura2.toString());
    }
}
