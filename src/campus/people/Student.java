package campus.people;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String studentID;

    public List<String> universityClassIds = new ArrayList<String>();
    public Student(String idPersona, String name, int age,String studentID) {
        super(idPersona, name, age);
        this.studentID=studentID;
    }

    public void addClassToStudent(String classId){
        universityClassIds.add(classId);
    }


}