package Main;

import classes.ConexiuneBazaDeDate;

public class Main {
    public static void main(String[] args) {
        //apeleaza constructorul doar pentru prima conexiune
        ConexiuneBazaDeDate conexiuneBazaDeDate1= ConexiuneBazaDeDate.getInstance("Baza1", 4, "link1");
        ConexiuneBazaDeDate conexiuneBazaDeDate2= ConexiuneBazaDeDate.getInstance("Baza2", 5, "link2");
        System.out.println(conexiuneBazaDeDate1);
        System.out.println(conexiuneBazaDeDate2);
        conexiuneBazaDeDate1.setNumeBaza("NumeBazaNoua");
        conexiuneBazaDeDate2.setNumeBaza("NumeBazaNoua2");
        System.out.println(conexiuneBazaDeDate1);


    }
}