package studentinformationsystem;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private String studentId;
    private String name;
    private Set<String> registeredCourses; // Set to avoid duplicate course entries

    // Constructor
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.registeredCourses = new HashSet<>();
    }

    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRegisteredCourses(Set<String> registeredCourses) {
        this.registeredCourses = registeredCourses;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name + ", Registered Courses: " + registeredCourses;
    }
}
