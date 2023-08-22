package campus.people;

public class PartTimeTeacher extends Teacher{
    private int hoursWorkedPerWeek;

    public PartTimeTeacher(String idPersona, String name, String teacherId, Double baseSalary, int hoursWorkedPerWeek) {
        super(idPersona, name, teacherId, baseSalary);
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }

    @Override
    public Double calculateSalary() {
        return this.baseSalary * hoursWorkedPerWeek;
    }

    @Override
    public void showPersonalData() {
        System.out.println("This is: "+ this.name );
        System.out.println("A Part time teacher");
        System.out.println("This is his identification: "+this.idPersona);
        System.out.println("And this is his base Salary: "+ this.baseSalary);
        System.out.println("Then he makes: "+ this.calculateSalary());
    }
}
