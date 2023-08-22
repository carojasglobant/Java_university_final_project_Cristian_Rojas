package campus.people;

public abstract class Teacher extends Person{
    protected String teacherId;

    protected Double baseSalary;

    final int workedHoursAsFullTimeTeacher = 42;
    public Teacher(String idPersona, String name, String teacherId, Double baseSalary){
        super(idPersona,name);
        this.teacherId = teacherId;
        this.baseSalary = baseSalary;
    }

    public abstract Double calculateSalary();

    public abstract void showPersonalData();
}
