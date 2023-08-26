package Model.modules;

import Model.actors.Student;

import java.util.ArrayList;
import java.util.List;

public class UniversityClass {

    public String classId;
    public String className;
    public String teacherId;

    public String teacherName;

    private List<Student> students = new ArrayList<>();

    public UniversityClass(String classId, String className, String teacherId, String teacherName, List<Student> students) {
        this.classId = classId;
        this.className = className;
        this.teacherId = teacherId;
        this.students = students;
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

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Student searchStudentInClass(String studentID){
        for (Student student : students){
            if(student.getStudentID().equals(studentID)){
                return student;
            }
        }
        return null;
    }

    public void listStudents(){
        if(!students.isEmpty()) {
            for (Student student : students) {
                System.out.println("- "+student.getName());
            }
            System.out.println(" ");
        } else  {
            System.out.println("No students enrolled yet \n");
        }
    }

    public void describe(){
        System.out.println("Class name: " + this.className);
        System.out.println("Class ID: "+this.classId);
        System.out.println("Teacher Assigned: "+ this.teacherName);
        System.out.println("Teacher ID: "+ this.teacherId);
        System.out.println("Amount of students: "+ this.students.size());

    }
}
