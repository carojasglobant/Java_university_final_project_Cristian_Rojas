package campus.module;

import java.util.ArrayList;
import java.util.List;

public class UniversityClass {

    public String classId;
    public String className;
    public String teacherId;

    private List<String> studentIds = new ArrayList<String>();

    public UniversityClass(String classId, String className, String teacherId) {
        this.classId = classId;
        this.className = className;
        this.teacherId = teacherId;
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
        studentIds.add(studentId);
    }
}
