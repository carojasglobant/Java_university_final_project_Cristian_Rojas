package Model.actors;

public abstract class Teacher{

    public String name;
    protected String teacherId;

    protected Double baseSalary;


    final int workedHoursAsFullTimeTeacher = 42;
    public Teacher(String name,String teacherId, Double baseSalary){
        this.name = name;
        this.teacherId = teacherId;
        this.baseSalary = baseSalary;

    }

    public String getTeacherId() {
        return teacherId;
    }

    public String getName() {
        return name;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public abstract Double calculateSalary();

    public abstract void showPersonalData();

}
