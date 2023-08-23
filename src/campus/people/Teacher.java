package campus.people;

import java.util.ArrayList;
import java.util.List;

public abstract class Teacher extends Person{
    protected String teacherId;

    protected Double baseSalary;

    public List<String> classIds = new ArrayList<String>();

    final int workedHoursAsFullTimeTeacher = 42;
    public Teacher(String idPersona, String name, int age,String teacherId, Double baseSalary){
        super(idPersona,name, age);
        this.teacherId = teacherId;
        this.baseSalary = baseSalary;
    }

    public abstract Double calculateSalary();

    public abstract void showPersonalData();
}
