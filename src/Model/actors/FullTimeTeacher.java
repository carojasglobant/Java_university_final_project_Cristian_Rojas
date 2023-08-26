package Model.actors;

import java.util.List;

public class FullTimeTeacher extends Teacher{

    public int experienceYears;
    public FullTimeTeacher(String name, String teacherId, Double baseSalary, int experienceYears) {
        super(name,teacherId, baseSalary);
        this.experienceYears= experienceYears;
    }

    @Override
    public Double calculateSalary() {
        return this.getBaseSalary()* (double) experienceYears * this.workedHoursAsFullTimeTeacher * 1.1;
    }

    @Override
    public void showPersonalData() {
        System.out.println("This is: "+ this.getName() );
        System.out.println("A Full time teacher");
        System.out.println("Teacher ID: "+this.getTeacherId());
        System.out.println("And this is his base Salary: "+ this.getBaseSalary());
        System.out.println("He makes: "+ this.calculateSalary()+"\n");
    }
}
