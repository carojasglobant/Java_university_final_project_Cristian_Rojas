package controller;

import campus.people.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherController {

    public List<Teacher> teacherList = new ArrayList<Teacher>();
    public TeacherController(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public void listTeacherList(){
        for (Teacher teacher: teacherList){
            teacher.showPersonalData();
        }
    }


}
