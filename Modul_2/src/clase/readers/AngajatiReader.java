package clase.readers;

import clase.Angajat;
import clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends ApplicationReader{

    public AngajatiReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> read() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(super.fileName));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Angajat angajat=new Angajat();
            super.readApplicant(input2, angajat);
            int salariu = input2.nextInt();
            String ocupatie = input2.next();
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        input2.close();
        return angajati;
    }
}
