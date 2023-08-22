import campus.people.FullTimeTeacher;
import campus.people.Teacher;

public class Main {
    public static void main(String[] args) {
        Teacher rojas = new FullTimeTeacher("01", "Cristian Rojas", "123", 40000.00, 3);
        rojas.showPersonalData();
    }
}
