package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament extends StructuraAbstracta{

    private List<StructuraAbstracta> structuri;
    private String directorDepartament;
    @Override
    public void adaugaStructura(StructuraAbstracta sa) {
        structuri.add(sa);
    }

    @Override
    public void stergeStructura(StructuraAbstracta sa) {
        structuri.remove(sa);
    }

    @Override
    public StructuraAbstracta getStructura(int index) {
        if(index>=0 && index< this.structuri.size()) {
            return this.structuri.get(index);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void afiseazaDescriere(String indentare) {
        System.out.println(indentare + "Departamentul " + super.getNume()
        + " este condus de " + this.directorDepartament
        + " si are urmatoarea componenta: ");

        for(StructuraAbstracta sa: this.structuri){
            sa.afiseazaDescriere(indentare + "  ");
        }
    }

    public Departament(String nume, String director ) {
        super(nume);
        this.directorDepartament=director;
        this.structuri=new ArrayList<>();
    }
}
