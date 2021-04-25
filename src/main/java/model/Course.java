package model;

import model.enums.CourseName;

import java.util.ArrayList;
import java.util.List;
// Objects
public class Course {
    private CourseName name;
    private int lessonsCount;
    private List <Student> students =new ArrayList<>();

   // Constructors
    public Course(CourseName name, int lessonsCount) {
        this.name = name;
        this.lessonsCount = lessonsCount;
    }

    // Getters
    public CourseName getName() {
        return name;
    }

    public int getLessonsCount() {
        return lessonsCount;
    }

    public List<Student> getStudents() {
        return students;
    }

    // Custom method
    public void addStudent(Student student) {
        students.add(student);
    }
}
