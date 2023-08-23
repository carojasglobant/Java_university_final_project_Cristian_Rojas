package controller;

import campus.module.UniversityClass;
import campus.people.Student;

import java.util.ArrayList;
import java.util.List;

public class Enrollment {

    ArrayList<Student> studentList = new ArrayList<Student>();
    ArrayList<UniversityClass> classList = new ArrayList<UniversityClass>();

    public Enrollment(){

    }

    public Enrollment(ArrayList<Student> studentList, ArrayList<UniversityClass> classList) {
        this.studentList = studentList;
        this.classList = classList;
    }

    public ArrayList<UniversityClass> getClassList() {
        return classList;
    }


    public void createStudent(Student student){
        this.studentList.add(student);
    }

    public void addClass(UniversityClass universityClass){
        classList.add(universityClass);
    }

    public void showClasses(){
        if(!classList.isEmpty()) {
            for (int i = 0; i < classList.size(); i++) {
                System.out.println((i + 1) + " " + classList.get(i).getClassName());
            }

        } else {
            System.out.println("There are no classes in this university");

        }
    }

    public void searchStudentClassesById(String studentId){
        for (UniversityClass universityClass : classList ){
            List<String> studentsId =  universityClass.getStudentIds();
            for (String id: studentsId){
                if(id.equals(studentId)){
                    System.out.println("The student is in the class " + universityClass.getClassName());
                    System.out.println("Class id: "+universityClass.getClassId());
                    System.out.println("Class Teacher: "+universityClass.getTeacherId());
                }
            }
        }
    }
}
