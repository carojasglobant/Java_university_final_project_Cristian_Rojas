package campus.people;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String studentID;

    public List<String> universityClassIds = new ArrayList<String>();
    public Student(String idPersona, String name, int age,String studentID, List<String> classIds) {
        super(idPersona, name, age);
        this.studentID=studentID;
        this.universityClassIds = classIds;
    }

    public void addClassToStudent(String classId){
        universityClassIds.add(classId);
    }

    public boolean checkClass(String classId){
        boolean classRegistered = false;
        for (String universityClassId: universityClassIds){
            if(universityClassId.equals(classId)){
                classRegistered=true;
                break;
            }
        }
        return classRegistered;
    }

    public String getStudentID() {
        return studentID;
    }
}
