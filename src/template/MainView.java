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
