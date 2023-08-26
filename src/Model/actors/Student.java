package Model.actors;

public class Student {
    public String getName() {
        return name;
    }

    public String name;
    private final String studentID;

    public Student(String name,String studentID) {
        this.name = name;
        this.studentID=studentID;
    }

    public String getStudentID() {
        return studentID;
    }
}
