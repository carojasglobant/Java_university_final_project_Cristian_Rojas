package campus.people;

import java.util.ArrayList;
import java.util.List;

public abstract class Teacher extends Person{
    protected String teacherId;

    protected Double baseSalary;

    public List<String> classIds = new ArrayList<>();

    final int workedHoursAsFullTimeTeacher = 42;
    public Teacher(String idPersona, String name, int age,String teacherId, Double baseSalary, List<String> classIds){
        super(idPersona,name, age);
        this.teacherId = teacherId;
        this.baseSalary = baseSalary;
        this.classIds = classIds;
    }

    public abstract Double calculateSalary();

    public abstract void showPersonalData();

    public String getTeacherId() {
        return teacherId;
    }

    public List<String> getClassIds(){
        return this.classIds;
    }

    public void addClassToTeacher(String classId){
        this.classIds.add(classId);
    }



}
