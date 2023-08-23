package campus.people;

public class Student extends Person {
    private String studentID;

    public Student(String idPersona, String name, String studentID) {
        super(idPersona, name);
        this.studentID=studentID;
    }


}
