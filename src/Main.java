import Model.University;
import Model.modules.UniversityClass;
import Model.actors.FullTimeTeacher;
import Model.actors.PartTimeTeacher;
import Model.actors.Student;
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
        University university = new University();

        // Instantiate Students
        Student studentOne = new Student("Cristian Londoño","ST1");
        Student studentTwo = new Student("Pablo Cuerno","ST2");
        Student studentThree = new Student("Juan Velez","ST3");
        Student studentFour = new Student("Pegro Gaviria","ST4");
        Student studentFive = new Student("Mariana Vanegas","ST5");
        Student studentSix = new Student("Laura Perez","ST6");
        university.addStudent(studentOne);
        university.addStudent(studentTwo);
        university.addStudent(studentThree);
        university.addStudent(studentFour);
        university.addStudent(studentFive);
        university.addStudent(studentSix);
        // Instantiate Teachers
        FullTimeTeacher fullTimeTeacherOne = new FullTimeTeacher("Javier Zapata",  "T1", 32000.00,9);
        FullTimeTeacher fullTimeTeacherTwo = new FullTimeTeacher( "Fernando Velazques",  "T2", 64000.00, 30);
        FullTimeTeacher fullTimeTeacherThree = new FullTimeTeacher( "Marlon Lopez",  "T3", 40000.00, 15);
        PartTimeTeacher partTimeTeacherOne = new PartTimeTeacher( "Juan David Roble", "T4", 20000.00, 42);
        PartTimeTeacher partTimeTeacherTwo = new PartTimeTeacher( "Cristian Alejandro Rojas", "T5", 24000.00,42);
        PartTimeTeacher partTimeTeacherThree = new PartTimeTeacher( "Sebastian Lopez Mazo", "T6", 40000.00, 50);
        university.addTeacher(fullTimeTeacherOne);
        university.addTeacher(fullTimeTeacherTwo);
        university.addTeacher(fullTimeTeacherThree);
        university.addTeacher(partTimeTeacherOne);
        university.addTeacher(partTimeTeacherTwo);
        university.addTeacher(partTimeTeacherThree);
        // Instantiate Classes
        UniversityClass universityClass = new UniversityClass("C1", "Physics", "T1", fullTimeTeacherOne.getName(), new ArrayList<>() {{
            add(studentOne);
            add(studentTwo);
            add(studentThree);
            add(studentSix);
        }});
        UniversityClass universityClassTwo = new UniversityClass("C2", "History of language", "T2", fullTimeTeacherTwo.getName(), new ArrayList<>() {{
            add(studentOne);
            add(studentFour);
            add(studentFive);
            add(studentSix);
        }});
        UniversityClass universityClassThree = new UniversityClass("C3", "Thermodynamic", "T3", fullTimeTeacherThree.getName(), new ArrayList<>() {{
            add(studentOne);
            add(studentThree);
            add(studentFour);
            add(studentFive);
        }});
        university.addUniversityClass(universityClass);
        university.addUniversityClass(universityClassTwo);
        university.addUniversityClass(universityClassThree);



        // A greeting to the user
        program.startProgram();

        // boolean to define if program is running

        while (true){
            program.showOptions();
            int optionSelected= sc.nextInt();
            switch (optionSelected) {
                case 1 ->
                    // list teachers
                        university.listTeachers();
                case 2 ->
                    // list classes and then a specific class
                        university.listClassesAndSelectOneToDescribe(sc);
                case 3 ->
                    // Create a new student and add him to class
                        university.createStudentAndAddHimToClasses(sc);

                case 4 ->
                    // Create new Class and add students to the class
                        university.createClassAndAddItsStudents(sc);

                case 5 ->
                    // Search classes by student id
                        university.searchStudentClassesByStudentID(sc);

                case 6 -> System.exit(0);
            }

        }
    }
}
