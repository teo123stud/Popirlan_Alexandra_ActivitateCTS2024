package state_b;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rezervare rezervare= new Rezervare("Ion");

        rezervare.rezervaMasa();
        rezervare.ocupaMasa();
        rezervare.golesteMasa();
    }
}