package template;

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
}
