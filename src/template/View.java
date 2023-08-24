package template;

import campus.module.UniversityClass;
import campus.people.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View implements ViewOptions{
    public View(){}

    public void startProgram(){
        System.out.println("Hi welcome to Globant University!");
    }

    public void showOptions(){
        System.out.println(ViewOptions.OPTION_ONE);
        System.out.println(ViewOptions.OPTION_TWO);
        System.out.println(ViewOptions.OPTION_THREE);
        System.out.println(ViewOptions.OPTION_FOUR);
        System.out.println(ViewOptions.OPTION_FIVE);
        System.out.println(ViewOptions.EXIT);
    }

    public void showOptionWhenClaasCanBeSelected(){
        System.out.println("Type a class number to see its information");
    }

   public Student showStudentCreation(Scanner sc){
       List<String> listClassIds = new ArrayList<String>();

       System.out.println("Student Creation Interface: ");
       System.out.println("Type the student id");
       sc.nextLine();
       String personId = sc.nextLine();
       System.out.println("Type the student full name");
       String studentFullName = sc.nextLine();
       System.out.println("Type the student age");
       int studentAge = sc.nextInt();
       sc.nextLine();
       System.out.println("Type the student Id");
       String studentId = sc.nextLine();

       return new Student(personId, studentFullName, studentAge, studentId, listClassIds);
   }
}
