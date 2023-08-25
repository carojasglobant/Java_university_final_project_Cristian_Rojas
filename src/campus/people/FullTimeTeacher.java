package campus.people;

import java.util.List;

public class FullTimeTeacher extends Teacher{

    public int experienceYears;
    public FullTimeTeacher(String idPersona, String name, int age, String teacherId, Double baseSalary, List<String> classIds, int experienceYears) {
        super(idPersona, name, age,teacherId, baseSalary, classIds);
        this.experienceYears= experienceYears;
    }

    @Override
    public Double calculateSalary() {
        return this.baseSalary* (double) experienceYears * this.workedHoursAsFullTimeTeacher * 1.1;
    }

    @Override
    public void showPersonalData() {
        System.out.println("This is: "+ this.name );
        System.out.println("A Full time teacher");
        System.out.println("This is his identification: "+this.idPersona);
        System.out.println("And this is his base Salary: "+ this.baseSalary);
        System.out.println("He makes: "+ this.calculateSalary());
    }
}
