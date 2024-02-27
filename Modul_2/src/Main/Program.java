package Main;

import clase.Aplicant;
import clase.readers.AngajatiReader;
import clase.readers.ApplicationReader;

import java.io.FileNotFoundException;
import java.util.List;



public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		ApplicationReader angajatiReader= new AngajatiReader("angajati.txt");
		try {
			listaAngajati = angajatiReader.read();
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
