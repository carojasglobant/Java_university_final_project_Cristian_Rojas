package controller;

import Model.modules.UniversityClass;
import Model.actors.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherController {

    public List<Teacher> teacherList = new ArrayList<Teacher>();

    public TeacherController(){

    }
    public TeacherController(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

//    public void listTeacherList(Enrollment enrollment){
//        if(!teacherList.isEmpty()) {
//            for (Teacher teacher : teacherList) {
//                teacher.showPersonalData();
//                List<UniversityClass> universityClasses = enrollment.getClassList();
//
//                if(!teacher.getClassIds().isEmpty()) {
//                    System.out.println("Professor of: ");
//                    for (UniversityClass universityClass : universityClasses) {
//                        if (teacher.getClassIds().contains(universityClass.getClassId())) {
//                            System.out.println("- " + universityClass.getClassName());
//                        }
//                    }
//                }
//                System.out.println(" ");
//            }
//        } else {
//            System.out.println("There are no teachers yet");
//        }
//    }

//    public void addClassAndAddStudents(Scanner sc, UniversityClass universityClass, Enrollment enrollment){
//        System.out.println("Type the teacher Id");
//        ArrayList<String> idsToUpdate = new ArrayList<>();
//        String teacherId = sc.nextLine();
//        if(searchTeacherById(teacherId)){
//            universityClass.setTeacherId(teacherId);
//            universityClass.setTeacherName(this.getProfessorNameById(teacherId));
//            System.out.println("Now lets add some students");
//            System.out.println("Type the student id or just type exit to leave");
//
//            while (true){
//                if(!enrollment.studentList.isEmpty()){
//                    enrollment.listStudents();
//                    String studentIdToAdd = sc.nextLine();
//                    if(studentIdToAdd.equals("exit")){
//                        break;
//                    }
//                    else if(!enrollment.checkStudentInClass(universityClass.getClassId(), studentIdToAdd)){
//                        universityClass.addStudentId(studentIdToAdd);
//                        idsToUpdate.add(studentIdToAdd);
//                        System.out.println("Student added");
//                    } else {
//                        System.out.println("Probably that student doesn't exist or is already registered in the class");
//                    }
//
//                }else {
//                    System.out.println("There are no students to add");
//                    break;
//                }
//
//            }
//            // Creo instancia de clase class
//            enrollment.addClass(universityClass);
//            // Actualizo estudiantes
//            enrollment.updateStudents(idsToUpdate, universityClass.getClassId());
//            // Actualizo profesor
//            this.addClassToTeacherById(universityClass.getTeacherId(), universityClass.getClassId());
//
//
//
//
//        } else{
//            System.out.println("Probably that teacher doesn't exist, start again");
//        }
//
//
//    }

     public String getProfessorNameById(String id){
        for (Teacher teacher: teacherList){
            if(teacher.getTeacherId().equals(id)){
                return teacher.getName();
            }
        }
        return "Null";
     }

    public boolean searchTeacherById(String id){
        boolean foundId = false;
        for(Teacher teacher:this.teacherList){
            if(teacher.getTeacherId().equals(id)){
                foundId = true;
                break;
            }
        }
        return foundId;
    }

    public void addTeacher(Teacher teacher){
        this.teacherList.add(teacher);
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

//    public void addClassToTeacherById(String teacherId, String classId){
//        for (Teacher teacher: teacherList){
//            if(teacher.getTeacherId().equals(teacherId)){
//                teacher.addClassToTeacher(classId);
//            }
//        }
//
//    }

}
