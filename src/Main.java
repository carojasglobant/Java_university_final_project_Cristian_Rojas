import campus.module.UniversityClass;
import campus.people.FullTimeTeacher;
import campus.people.PartTimeTeacher;
import campus.people.Student;
import campus.people.Teacher;
import controller.Enrollment;
import controller.TeacherController;
import template.View;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scaner to receive the inputs
        Scanner sc = new Scanner(System.in);

        // start the view of the program
        View program = new View();

        // Start the controllers of the program
        Enrollment enrollment = new Enrollment();
        TeacherController teacherController = new TeacherController();

        // Instantiate Students


        // Instantiate Teachers
        FullTimeTeacher fullTimeTeacherOne = new FullTimeTeacher("1001", "Javier Zapata", 32, "001", 32000.00, 9);
        FullTimeTeacher fullTimeTeacherTwo = new FullTimeTeacher("1002", "Fernando Velazques", 55, "002", 64000.00, 30);
        FullTimeTeacher fullTimeTeacherThree = new FullTimeTeacher("1003", "Marlon Lopez", 40, "003", 40000.00, 15);
        PartTimeTeacher partTimeTeacherOne = new PartTimeTeacher("1004", "Juan David Roble",20, "004", 20000.00,42);
        PartTimeTeacher partTimeTeacherTwo = new PartTimeTeacher("1004", "Cristian Alejandro Rojas", 24,"005", 24000.00, 42);
        PartTimeTeacher partTimeTeacherThree = new PartTimeTeacher("1005", "Sebastian Lopez Mazp", 27,"006", 40000.00, 50);
        teacherController.addTeacher(fullTimeTeacherOne);
        teacherController.addTeacher(fullTimeTeacherTwo);
        teacherController.addTeacher(fullTimeTeacherThree);
        teacherController.addTeacher(partTimeTeacherOne);
        teacherController.addTeacher(partTimeTeacherTwo);
        teacherController.addTeacher(partTimeTeacherThree);
        // Instantiate Classes
        UniversityClass universityClass = new UniversityClass("C1", "Physics", "001", new ArrayList<String>() {{add("01");add("02");add("03");}});
        UniversityClass universityClassTwo = new UniversityClass("C2", "History of language", "002",new ArrayList<String>() {{add("01");add("02");add("03");}});
        UniversityClass universityClassThree = new UniversityClass("C3", "Thermodynamic", "003", new ArrayList<String>() {{add("01");add("04");}});
        enrollment.addClass(universityClass);
        enrollment.addClass(universityClassTwo);
        enrollment.addClass(universityClassThree);

        // A greeting to the user
        program.startProgram();

        // boolean to define if program is running
        boolean isProgramOn=true;
        while (isProgramOn){
            program.showOptions();
            int mainOption= sc.nextInt();
            switch (mainOption){
                case 1:
                    // list teachers
                    teacherController.listTeacherList();
                    break;
                case 2:
                    // list classes and then a specific class
                    enrollment.showClasses(sc);
                    break;
                case 3:
                    // Create a new student
                    Student newStudent = program.showStudentCreation(sc);
                    // Add the new student to a class
                    enrollment.addClassesForNewStudent(sc, newStudent);
                    break;
                case 4:
                    // Create a new class and add an existing teacher, students and relevant data

                    break;
                case 5:
                    // Search classes by student id
                    enrollment.searchStudentClassesById(sc, teacherController);
                    break;
                case 6:
                    isProgramOn=false;
                    System.exit(0);
                    break;
            }

        }
    }
}
