package campus.module;

import java.util.ArrayList;
import java.util.List;

public class UniversityClass {

    public String classId;
    public String className;
    public String teacherId;

    public String teacherName;

    private List<String> studentIds = new ArrayList<>();

    public UniversityClass(String classId, String className, String teacherId, String teacherName, List<String> studentIds) {
        this.classId = classId;
        this.className = className;
        this.teacherId = teacherId;
        this.studentIds = studentIds;
        this.teacherName = teacherName;
    }

    public String getClassId() {
        return classId;
    }

    public String getClassName() {
        return className;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public List<String> getStudentIds() {
        return studentIds;
    }

    public void enrollStudent(String studentId){
        this.studentIds.add(studentId);
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void addStudentId(String studentId){
        this.studentIds.add(studentId);
    }


    public void describe(){
        System.out.println("Class name: " + this.className);
        System.out.println("Class id: "+this.classId);
        System.out.println("Teacher Assigned: "+ this.teacherName);
        System.out.println("Teacher Id: "+ this.teacherId);
        System.out.println("Amount of students: "+ this.studentIds.size());

    }
}
