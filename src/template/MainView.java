package template;

import Model.modules.UniversityClass;
import Model.actors.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainView implements MainViewOptions {
    public MainView(){}

    public void startProgram(){
        System.out.println("Hi welcome to Globant University!");
    }

    public void showOptions(){
        System.out.println(MainViewOptions.OPTION_ONE);
        System.out.println(MainViewOptions.OPTION_TWO);
        System.out.println(MainViewOptions.OPTION_THREE);
        System.out.println(MainViewOptions.OPTION_FOUR);
        System.out.println(MainViewOptions.OPTION_FIVE);
        System.out.println(MainViewOptions.EXIT);
    }

//   public Student showStudentCreation(Scanner sc){
//       List<String> listClassIds = new ArrayList<>();
//
//       System.out.println("Student Creation Interface: ");
//       System.out.println("Type the personal id");
//       sc.nextLine();
//       String personId = sc.nextLine();
//       System.out.println("Type the student full name");
//       String studentFullName = sc.nextLine();
//       System.out.println("Type the student age");
//       int studentAge = sc.nextInt();
//       sc.nextLine();
//       System.out.println("Type the student Id");
//       String studentId = sc.nextLine();
//
//       return new Student(personId, studentFullName, studentAge, studentId, listClassIds);
//   }

    public UniversityClass showClassCreation(Scanner sc){

        System.out.println("Class Creation Interface: ");
        System.out.println("Type the new Class id");
        sc.nextLine();
        String classId = sc.nextLine();
        System.out.println("Type the class name");
        String className = sc.nextLine();


        return new UniversityClass(classId, className, "", "", new ArrayList<>());
    }
}
