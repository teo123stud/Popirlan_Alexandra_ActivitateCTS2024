package clase.readers;

import clase.Aplicant;
import clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader extends ApplicationReader{

    public EleviReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> read() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(super.fileName));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (input2.hasNext()) {
            Elev elev= new Elev();
            super.readApplicant(input2, elev);
            int clasa = input2.nextInt();
            String tutore = input2.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }

        input2.close();
        return elevi;
    }
}
