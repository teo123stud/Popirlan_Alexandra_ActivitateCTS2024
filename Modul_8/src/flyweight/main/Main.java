package flyweight.main;

import flyweight.classes.Caracteristici;
import flyweight.classes.Fabrica;
import flyweight.classes.Flyweight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Fabrica fabrica= new Fabrica();

        Caracteristici caracteristici_1= new Caracteristici(10,15,"rosu");
        Caracteristici caracteristici_2= new Caracteristici(11,16,"verde");
        Caracteristici caracteristici_3= new Caracteristici(11,16,"albastru");

        fabrica.getSpectatori(10,10).deseneaza(caracteristici_1);
        fabrica.getSpectatori(20, 10).deseneaza(caracteristici_2);
        fabrica.getSpectatori(13, 10).deseneaza(caracteristici_3);



    }
}