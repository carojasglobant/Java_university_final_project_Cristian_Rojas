import campus.module.UniversityClass;
import campus.people.FullTimeTeacher;
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

        UniversityClass universityClass = new UniversityClass("01", "Matematicas", "01", new ArrayList<String>() {{add("01");add("02");add("03");}});
        UniversityClass universityClassTwo = new UniversityClass("02", "Español", "02",new ArrayList<String>() {{add("01");add("02");add("03");}});
        UniversityClass universityClassThree = new UniversityClass("03", "Ciencias", "03", new ArrayList<String>() {{add("01");add("04");}});
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
                    enrollment.showClasses();
                    if(!enrollment.getClassList().isEmpty()) {
                        program.showOptionWhenClaasCanBeSelected();
                        int optionClassToShow = sc.nextInt();
                        program.showClassInformation(enrollment.getClassList(), optionClassToShow);
                    }
                    break;
                case 3:
                    // Create a new student

                    // Add the new student to a class

                    break;
                case 4:
                    // Create a new class and add an existing teacher, students and relevant data

                    break;
                case 5:
                    // Search classes by student id

                    break;
                case 6:
                    isProgramOn=false;
                    System.exit(0);
                    break;
            }

        }
    }
}
