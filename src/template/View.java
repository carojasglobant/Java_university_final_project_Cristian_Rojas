package template;

import campus.module.UniversityClass;

import java.util.List;

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

    public void showClassInformation(List<UniversityClass> universityClasses, int classSelected){
        if(classSelected-1>=0 && classSelected <= universityClasses.size()) {
            universityClasses.get(classSelected - 1).describe();
        } else {
            System.out.println("Class not found");
        }
    }
}
