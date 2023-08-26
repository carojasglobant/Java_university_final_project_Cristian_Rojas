package Model.actors;

public class PartTimeTeacher extends Teacher{
    final int hoursWorkedPerWeek;

    public PartTimeTeacher(String name, String teacherId, Double baseSalary, int hoursWorkedPerWeek) {
        super(name,teacherId, baseSalary);
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }

    @Override
    public Double calculateSalary() {
        return this.getBaseSalary() * hoursWorkedPerWeek;
    }

    @Override
    public void showPersonalData() {
        System.out.println("This is: "+ this.getName() );
        System.out.println("A Part time teacher");
        System.out.println("Teacher ID: "+this.getTeacherId());
        System.out.println("And this is the base Salary: "+ this.getBaseSalary());
        System.out.println("Then he makes: "+ this.calculateSalary()+"\n");
    }
}
