import sustinereExamen.classes.Student;
import sustinereExamen.classes.SustinereExamen;

public class Main {
    public static void main(String[] args){
        Student student1= new Student(123, "Pop Denis", "popdenis@stud.ase.ro", 3);
        Student student2= new Student(124, "Popa Denisa", "popadenisa@stud.ase.ro", 3);
        Student student3= new Student(125, "Popirlan Denis", "popirlandenis@stud.ase.ro", 3);

        SustinereExamen examenPoo= new SustinereExamen("Programre Orientata Obiect");
        SustinereExamen examenCts= new SustinereExamen("Calitate si Testare Software");

        //singleton registry
        examenPoo.inregistrareStudent(student1);
        examenPoo.inregistrareStudent(student2);
        examenPoo.inregistrareStudent(student1);
        examenPoo.inregistrareStudent(student3);

    }
}
