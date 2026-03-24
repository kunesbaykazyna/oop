package lab2.task5.model;

public class Student extends Person {
    private String faculty;

    public Student(String name, int age,String faculty) {
        super(name, age);
        this.faculty = faculty;
    }

    @Override
    public String getOccupation() {
        return "Student (faculty: " + faculty + ")";
    }
}