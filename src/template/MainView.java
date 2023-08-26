package template;

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
}