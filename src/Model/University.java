package Model;

import Model.actors.Student;
import Model.actors.Teacher;
import Model.modules.UniversityClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class University {
    List<Student> studentList = new ArrayList<>();
    List<UniversityClass> universityClassList = new ArrayList<>();
    List<Teacher> teacherList = new ArrayList<>();


    public void addStudent(Student student){
        studentList.add(student);
    }

    public void addTeacher(Teacher teacher){
        teacherList.add(teacher);
    }
    public void addUniversityClass(UniversityClass universityClass){
        universityClassList.add(universityClass);
    }

    public void listTeachers(){
        for (Teacher teacher: teacherList){
            teacher.showPersonalData();
        }
    }

    public void listUniversityClasses(){
        for(UniversityClass universityClass : universityClassList){
            System.out.println(universityClass.getClassId()+" "+universityClass.getClassName());
        }
    }

    public void listClassesAndSelectOneToDescribe(Scanner sc){
        this.listUniversityClasses();
        System.out.println("Type the class ID to see the class information");
        sc.nextLine();
        String universityClassID = sc.nextLine();
        if(this.searchUniversityClassByID(universityClassID) != null) {
            this.searchUniversityClassByID(universityClassID).describe();
            this.findStudentsByClassID(universityClassID);
        } else {
            System.out.println("Class not found, try again");
        }
    }

    public void findStudentsByClassID(String classID){
        UniversityClass universityClass = this.searchUniversityClassByID(classID);
        if(universityClass != null) {
            universityClass.listStudents();
        }
    }

    public Student searchStudentByID(String studentID){
        for(Student student : studentList){
            if(student.getStudentID().equals(studentID)){
                return student;
            }
        }
        return null;
    }
    public UniversityClass searchUniversityClassByID(String universityClassID){
        for(UniversityClass universityClass : universityClassList){
            if(universityClass.getClassId().equals(universityClassID)){
                return universityClass;
            }
        }
        return null;
    }
    public Teacher searchTeacherByID(String teacherID){
        for(Teacher teacher : teacherList){
            if(teacher.getTeacherId().equals(teacherID)){
                return teacher;
            }
        }
        return null;
    }
    public void createStudentAndAddHimToClasses(Scanner sc) {
        System.out.println("Student Creation Interface: ");
        System.out.println("Type the student full name");
        sc.nextLine();
        String studentFullName = sc.nextLine();
        System.out.println("Type the student ID");
        String studentID = sc.nextLine();
        if (searchStudentByID(studentID) == null){
            Student newStudent = new Student(studentFullName, studentID);
            studentList.add(newStudent);
            System.out.println("Now add the classes to the student");
            if (!this.universityClassList.isEmpty()) {
                boolean keepAddingClasses = true;
                this.listUniversityClasses();
                while (keepAddingClasses) {
                    System.out.println("Type the class ID or exit to leave");
                    String classIDToAdd = sc.nextLine();
                    if (classIDToAdd.equals("exit")) {
                        keepAddingClasses = false;
                    } else {
                        UniversityClass universityClass = searchUniversityClassByID(classIDToAdd);
                        if (universityClass != null && universityClass.searchStudentInClass(studentID) == null) {
                            universityClass.addStudent(searchStudentByID(studentID));
                            System.out.println("Added successfully");
                        } else {
                            System.out.println("Class not found or already registered");
                        }
                    }
                }

                System.out.println("Student successfully created");
            } else {
                System.out.println("There are no classes to add");
            }
        } else {
            System.out.println("Student already exists, try again");
        }

    }

    public void searchStudentClassesByStudentID(Scanner sc){
        System.out.println("Type the student ID");
        sc.nextLine();
        String studentID = sc.nextLine();
        if(this.searchStudentByID(studentID) != null){
            System.out.println("The student is in the following class(es)");
            for (UniversityClass universityClass : universityClassList){
                if(universityClass.searchStudentInClass(studentID) != null){
                    System.out.println(universityClass.getClassId()+" "+universityClass.getClassName());
                }
            }
            System.out.println(" ");
        } else {
            System.out.println("Student not found!");
        }
    }

    public void listStudentsShortly(){
        if(!studentList.isEmpty()) {
            for (Student student : studentList) {
                System.out.println(student.getStudentID()+ " "+ student.getName());
            }
        } else {
            System.out.println("There are no students to show \n");
        }
    }

    public void createClassAndAddItsStudents(Scanner sc){
        List<Student> studentsToAdd = new ArrayList<>();

        System.out.println("Type the class name");
        sc.nextLine();
        String className = sc.nextLine();
        System.out.println("Type the class ID");
        String classID = sc.nextLine();
        if(this.searchUniversityClassByID(classID) == null) {
            System.out.println("Type the teacher ID to assign as the new class teacher");
            this.listTeachersShortly();
            String teacherID = sc.nextLine();
            Teacher teacher = searchTeacherByID(teacherID);
            if (teacher != null) {
                if (searchUniversityClassByID(classID) == null) {
                    System.out.println("Now add the students to the class");
                    if (!this.studentList.isEmpty()) {
                        boolean keepAddingClasses = true;
                        this.listStudentsShortly();
                        while (keepAddingClasses) {
                            System.out.println("Type the student ID or exit to leave");
                            String studentToAdd = sc.nextLine();
                            if (studentToAdd.equals("exit")) {
                                keepAddingClasses = false;
                            } else {
                                Student student = searchStudentByID(studentToAdd);
                                if (student != null && !studentsToAdd.contains(student)) {
                                    studentsToAdd.add(student);
                                } else {
                                    System.out.println("Student not found");
                                }
                            }
                        }
                        UniversityClass newClass = new UniversityClass(classID, className, teacher.getTeacherId(), teacher.getName(), studentsToAdd);
                        this.universityClassList.add(newClass);
                        System.out.println("Class created successfully");
                    } else {
                        System.out.println("There are no students to add");
                    }
                } else {
                    System.out.println("Class already exists, try again");
                }
            } else {
                System.out.println("Teacher doesn't exists, try again");
            }
        } else {
            System.out.println("Class already exists, try again");
        }
    }

    public void listTeachersShortly(){
        for(Teacher teacher :teacherList){
            System.out.println(teacher.getTeacherId()+" "+teacher.getName());
        }
    }


}
