package sustinereExamen.classes;

public class Student {

    private int id;
    private String name;

    private String email;

    private int an;

    public Student(int id, String name, String email, int an) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.an = an;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", an=" + an +
                '}';
    }
}
