package controller;

import Model.modules.UniversityClass;
import Model.actors.Student;
import Model.actors.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Enrollment {


    ArrayList<Student> studentList = new ArrayList<>();
    ArrayList<UniversityClass> classList = new ArrayList<>();

    public Enrollment(){

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

//    public void showClasses(Scanner sc){
//        if(!classList.isEmpty()) {
//            this.listClasses();
//
//            System.out.println("Type a class number to view details (1,2 or 3, etc...): ");
//            int classToDetail = sc.nextInt();
//            if(classToDetail > 0 && classToDetail <= classList.size()) {
//                classList.get(classToDetail - 1).describe();
//                List<String> listOfStudentsRegisteredIds = classList.get(classToDetail-1).getStudentIds();
//                System.out.println("List of students: ");
//                for (Student student : studentList) {
//                    if (listOfStudentsRegisteredIds.contains(student.getStudentID())) {
//                        System.out.println("-" + student.getName());
//                    }
//                }
//                System.out.println(" ");
//            } else{
//                System.out.println("Try again");
//            }
//        } else {
//            System.out.println("There are no classes in this university");
//
//        }
//    }

    public void listClasses(){
        if(!classList.isEmpty()){
            for (int i = 0; i < classList.size(); i++) {
                System.out.println((i + 1) + " " + classList.get(i).getClassName()+" Class Id: "+classList.get(i).getClassId());
            }
        }
    }


//    public void searchStudentClassesById(Scanner sc, TeacherController teacherController){
//        this.listClasses();
//        System.out.println("Type the student id: ");
//        String studentIdToFind = sc.next();
//
//        int studentFound=0;
//
//        for (UniversityClass universityClass : classList ){
//            List<String> studentsId =  universityClass.getStudentIds();
//            for (String id: studentsId){
//                if(id.equals(studentIdToFind)){
//                    studentFound ++;
//                    System.out.println("The student is in the class: " + universityClass.getClassName());
//                    System.out.println("Class id: "+universityClass.getClassId());
//                    System.out.println("Class Teacher: " + searchTeacherNameById(universityClass.getTeacherId(), teacherController));
//                    System.out.println(" ");
//                }
//            }
//        }
//        if(studentFound==0){
//            System.out.println("Student not found");
//        }
//    }

    public String searchTeacherNameById(String teacherId, TeacherController teacherController){
        if(!teacherController.getTeacherList().isEmpty()) {
            for (Teacher teacher : teacherController.getTeacherList()) {
                if(teacher.getTeacherId().equals(teacherId)){
                    return teacher.getName();
                }
            }
        } else {
            return "Null";
        }
        return "Null";
    }

//    public void addClassesForNewStudent(Scanner sc, Student newStudent){
//
//        System.out.println("Now add the classes to the student");
//        if(!this.classList.isEmpty()){
//            boolean keepAdingClasses = true;
//            this.listClasses();
//            while (keepAdingClasses) {
//                System.out.println("Type the class id or exit to leave");
//                String classIdToAdd = sc.nextLine();
//                if(classIdToAdd.equals("exit")){
//                    keepAdingClasses = false;
//                } else {
//                    if (findClassById(classIdToAdd) && !newStudent.checkClass(classIdToAdd)) {
//                        for(UniversityClass universityClass: this.classList){
//                            if(universityClass.getClassId().equals(classIdToAdd)){
//                                universityClass.enrollStudent(newStudent.getStudentID());
//                            }
//                        }
//                        newStudent.addClassToStudent(classIdToAdd);
//                    } else {
//                        System.out.println("Class not found or already registered");
//                    }
//                }
//            }
//            this.studentList.add(newStudent);
//            System.out.println("Student successfully created");
//        } else {
//            System.out.println("There are no classes to add");
//        }
//    }
    public boolean findClassById(String classId){
        boolean foundClass = false;
        for (UniversityClass universityClass : classList ){
            if(universityClass.getClassId().equals(classId)){
                foundClass = true;
                break;
            }
        }
        return foundClass;
    }

    public void listStudents(){
        for(int i=0; i<studentList.size(); i++){
            System.out.println((i+1)+" "+studentList.get(i).getName()+" Student Id: "+studentList.get(i).getStudentID());
        }
    }

//    public boolean checkStudentInClass(String classId, String studentId){
//        boolean studentFound=false;
//        for(UniversityClass universityClass:classList){
//            List<String> studentsIdInClass = universityClass.getStudentIds();
//            for(String classStudentId : studentsIdInClass){
//                if (classStudentId.equals(studentId) && universityClass.getClassId().equals(classId)) {
//                    studentFound = true;
//                    break;
//                }
//            }
//        }
//        return studentFound;
//
//    }
    public ArrayList<Student> getStudentList() {
        return studentList;
    }

//    public void updateStudents(List<String> listOfIds, String classId){
//        for (Student student : this.studentList) {
//            for (String idStudent : listOfIds) {
//                if (student.getStudentID().equals(idStudent)) {
//                    student.addClassToStudent(classId);
//                }
//            }
//        }
//    }


}
