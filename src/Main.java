import campus.people.FullTimeTeacher;
import campus.people.Teacher;
import controller.Enrollment;
import controller.TeacherController;
import template.View;

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

        // A greeting to the user
        program.startProgram();

        // boolean to define if program is running
        boolean isProgramOn=true;
        while (isProgramOn){
            program.showOptions();
            int mainOption= sc.nextInt();
            switch (mainOption){
                case 1:
                    teacherController.listTeacherList();
                    break;
                case 2:
                    enrollment.showClasses();
                    break;
                case 6:
                    isProgramOn=false;
                    System.exit(0);
                    break;
            }

        }
    }
}
