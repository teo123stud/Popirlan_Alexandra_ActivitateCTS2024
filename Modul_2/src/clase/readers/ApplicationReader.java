package clase.readers;

import clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class ApplicationReader {

    protected String fileName;

    public ApplicationReader(String fileName) {
        this.fileName = fileName;
    }

    public Aplicant readApplicant(Scanner input, Aplicant aplicant){

        String nume = input.next();
        String prenume = input.next();
        int varsta = input.nextInt();
        int punctaj = input.nextInt();
        int nr = input.nextInt();
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = input.next();
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setNr_proiecte(nr, vect);
        aplicant.setPunctaj(punctaj);
        return  aplicant;
    }
    public abstract List<Aplicant> read() throws FileNotFoundException;
}
