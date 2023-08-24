package controller;

import campus.people.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherController {

    public List<Teacher> teacherList = new ArrayList<Teacher>();

    public TeacherController(){

    }
    public TeacherController(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public void listTeacherList(){
        if(!teacherList.isEmpty()) {
            for (Teacher teacher : teacherList) {
                teacher.showPersonalData();
            }
        } else {
            System.out.println("There are no teachers yet");
        }
    }

    public void addTeacher(Teacher teacher){
        this.teacherList.add(teacher);
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

}
