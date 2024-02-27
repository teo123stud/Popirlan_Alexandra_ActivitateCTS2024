package clase.readers;

import clase.Aplicant;
import clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends ApplicationReader{

    public StudentReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> read() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(super.fileName));
        input2.useDelimiter(",");
        List<Aplicant> studenti = new ArrayList<>();

        while (input2.hasNext()) {
            Student aplicant= new Student();
            super.readApplicant(input2, aplicant);
            int anStudii = input2.nextInt();
            String facultate= input2.next();
            aplicant.setAn_studii(anStudii);
            aplicant.setFacultate(facultate);
            studenti.add(aplicant);
        }
        input2.close();
        return studenti;
    }
}
