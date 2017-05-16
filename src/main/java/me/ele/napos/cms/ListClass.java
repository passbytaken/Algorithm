package me.ele.napos.cms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakoo on 15/05/2017.
 */
public class ListClass {

    public List coursesToSelect;

    public ListClass() {
        this.coursesToSelect = new ArrayList();
    }


    /**
     * 用于向coursesToSelect中添加备选课程
     */
    public void addCourse() {
        //创建一个课程对象，并调用addCourse()方法，添加备选课程List中
        Course course1 = new Course("1", "Data Structure");
        coursesToSelect.add(course1);
        Course temp = (Course) coursesToSelect.get(0);
        System.out.println("Add Course is " + temp.getId() + ":" + temp.getName());


        Course course2 = new Course("2", "Algorithm");
        coursesToSelect.add(0,course2);
        Course temp2 = (Course) coursesToSelect.get(0);
        System.out.println("Add Course is " + temp2.getId() + ":" + temp2.getName());
    }

    public static void main(String[] args) {
        ListClass listClass = new ListClass();

        listClass.addCourse();
    }
}
