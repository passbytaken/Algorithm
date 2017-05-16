package me.ele.napos.cms;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jakoo on 15/05/2017.
 */
public class Student {
    private String id;
    private String student_name;

    private Set courses;

    public Student(String id, String student_name) {
        this.id = id;
        this.student_name = student_name;

        this.courses = new HashSet();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public Set getCourses() {
        return courses;
    }

    public void setCourses(Set courses) {
        this.courses = courses;
    }
}
