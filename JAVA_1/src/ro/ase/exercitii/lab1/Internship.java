package ro.ase.exercitii.lab1;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Internship {
    private String name;
    private double minGrade;
    private Student[] students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMinGrade() {
        return minGrade;
    }

    public void setMinGrade(double minGrade) {
        this.minGrade = minGrade;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Internship(String name, double minGrade, Student[] students) {
        this.name = name;
        this.minGrade = minGrade;
        this.students = students;
    }

    Student chooseCandidateRandomly(){
        if (students.length > 0){
            Random rand = new Random();
            int i =rand.nextInt(0, students.length);
            return students[i];
        }
        return null;
    }

    void chooseCandidatesForInterview(){
        for (int i = 0; i< students.length; i++){
            if(students[i].getGrade()>=minGrade){
                System.out.println("Candidate " + students[i].getName() + " got a phone interview at " + name);
            }
        }
    }

}
