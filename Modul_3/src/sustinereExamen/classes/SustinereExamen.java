package sustinereExamen.classes;

import sustinereExamen.classes.Student;

import java.util.HashMap;
import java.util.Map;

public class SustinereExamen {

    private String numeExamen;
    Map<Integer, Student> listaStudent= new HashMap<>();

    public SustinereExamen(String numeExamen) {
        this.numeExamen = numeExamen;
    }

    public String getNumeExamen() {
        return numeExamen;
    }

    public Map<Integer, Student> getListaStudent() {
        return listaStudent;
    }

    public void inregistrareStudent(Student student){
        if (listaStudent.containsKey(student.getId())){
            System.out.println("Studentul "+student.getName()+" a sustinut deja examenul.");
        }
        else{
            listaStudent.put(student.getId(), student);
            System.out.println("Stundetul "+student.getName()+" sustine acum examenul.");
        }
    }
}
