import campus.module.UniversityClass;
import campus.people.FullTimeTeacher;
import campus.people.PartTimeTeacher;
import campus.people.Student;
import controller.Enrollment;
import controller.TeacherController;
import template.MainView;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scaner to receive the inputs
        Scanner sc = new Scanner(System.in);

        // start the view of the program
        MainView program = new MainView();

        // Start the controllers of the program
        Enrollment enrollment = new Enrollment();
        TeacherController teacherController = new TeacherController();

        // Instantiate Students
        Student studentOne = new Student("10007", "Cristian Londoño",17,"ST1", new ArrayList<>() {{
            add("C1");
            add("C2");
            add("C3");
        }});
        Student studentTwo = new Student("10008", "Pablo Cuerno",19,"ST2", new ArrayList<>() {{
            add("C1");
        }});
        Student studentThree = new Student("10009", "Juan Velez",21,"ST3", new ArrayList<>() {{
            add("C3");
        }});
        Student studentFour = new Student("10010", "Pegro Gaviria",17,"ST4", new ArrayList<>() {{
            add("C2");
            add("C3");
        }});
        Student studentFive = new Student("10011", "Mariana Vanegas",16,"ST5", new ArrayList<>() {{
            add("C1");
            add("C2");
            add("C3");
        }});
        Student studentSix = new Student("10012", "Laura Perez",18,"ST6", new ArrayList<>() {{
            add("C1");
            add("C2");
        }});
        enrollment.createStudent(studentOne);
        enrollment.createStudent(studentTwo);
        enrollment.createStudent(studentThree);
        enrollment.createStudent(studentFour);
        enrollment.createStudent(studentFive);
        enrollment.createStudent(studentSix);
        // Instantiate Teachers
        FullTimeTeacher fullTimeTeacherOne = new FullTimeTeacher("1001", "Javier Zapata", 32, "T1", 32000.00, new ArrayList<String>() {{add("C1");}},9);
        FullTimeTeacher fullTimeTeacherTwo = new FullTimeTeacher("1002", "Fernando Velazques", 55, "T2", 64000.00, new ArrayList<String>() {{add("C2");}},30);
        FullTimeTeacher fullTimeTeacherThree = new FullTimeTeacher("1003", "Marlon Lopez", 40, "T3", 40000.00, new ArrayList<String>() {{add("C3");}},15);
        PartTimeTeacher partTimeTeacherOne = new PartTimeTeacher("1004", "Juan David Roble",20, "T4", 20000.00,new ArrayList<String>(),42);
        PartTimeTeacher partTimeTeacherTwo = new PartTimeTeacher("1004", "Cristian Alejandro Rojas", 24,"T5", 24000.00, new ArrayList<String>(),42);
        PartTimeTeacher partTimeTeacherThree = new PartTimeTeacher("1005", "Sebastian Lopez Mazp", 27,"T6", 40000.00,new ArrayList<String>(), 50);
        teacherController.addTeacher(fullTimeTeacherOne);
        teacherController.addTeacher(fullTimeTeacherTwo);
        teacherController.addTeacher(fullTimeTeacherThree);
        teacherController.addTeacher(partTimeTeacherOne);
        teacherController.addTeacher(partTimeTeacherTwo);
        teacherController.addTeacher(partTimeTeacherThree);
        // Instantiate Classes
        UniversityClass universityClass = new UniversityClass("C1", "Physics", "T1", fullTimeTeacherOne.getName(), new ArrayList<>() {{
            add("ST1");
            add("ST2");
            add("ST3");
            add("ST6");
        }});
        UniversityClass universityClassTwo = new UniversityClass("C2", "History of language", "T2", fullTimeTeacherTwo.getName(), new ArrayList<>() {{
            add("ST1");
            add("ST4");
            add("ST5");
            add("ST6");
        }});
        UniversityClass universityClassThree = new UniversityClass("C3", "Thermodynamic", "T3", fullTimeTeacherThree.getName(), new ArrayList<>() {{
            add("ST1");
            add("ST3");
            add("ST4");
            add("ST5");
        }});
        enrollment.addClass(universityClass);
        enrollment.addClass(universityClassTwo);
        enrollment.addClass(universityClassThree);

        // A greeting to the user
        program.startProgram();

        // boolean to define if program is running

        while (true){
            program.showOptions();
            int mainOption= sc.nextInt();
            switch (mainOption) {
                case 1 ->
                    // list teachers
                        teacherController.listTeacherList(enrollment);
                case 2 ->
                    // list classes and then a specific class
                        enrollment.showClasses(sc);
                case 3 -> {
                    // Create a new student
                    Student newStudent = program.showStudentCreation(sc);
                    // Add the new student to a class
                    enrollment.addClassesForNewStudent(sc, newStudent);
                }
                case 4 -> {
                    // Create new Class
                    UniversityClass newUniversityClass = program.showClassCreation(sc);
                    // Add students to the class
                    teacherController.addClassAndAddStudents(sc, newUniversityClass, enrollment);

                }
                // Create a new class and add an existing teacher, students and relevant data

                case 5 ->
                    // Search classes by student id
                        enrollment.searchStudentClassesById(sc, teacherController);
                case 6 -> System.exit(0);
            }

        }
    }
}
