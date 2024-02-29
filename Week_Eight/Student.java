package Week_Eight;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private int gradeLevel;
    private ArrayList<Integer> testGrades;
    private ArrayList<Integer> quizGrades;
    private boolean graduateStatus;

    // Constructor
    public Student(String name, int age, int gradeLevel) {
        this.name = name;
        this.age = age;
        this.gradeLevel = gradeLevel;
        this.testGrades = new ArrayList<>();
        this.quizGrades = new ArrayList<>();
        this.graduateStatus = false;
    }

    // Add test grade
    public void addTestGrade(int grade) {
        if(-1>grade && grade>100)
        {
            System.out.println("you can only have a grade between 0 & 100");
            return; 
        }
        
        if(testGrades.size()==4)
        {
            System.out.println("Already have 4 test grades");
            return;
        }

        testGrades.add(grade);
    }

    // Add quiz grade
    public void addQuizGrade(int grade) {
        if(-1>grade && grade>100)
        {
            System.out.println("you can only have a grade between 0 & 100");
            return; 
        }

        if(quizGrades.size()==10)
        {
            System.out.println("Already have 10 quiz grades");
            return;
        }

        quizGrades.add(grade);
    }

    // Calculate average test grade
    public double calculateTestAverage() {
        double sum = 0;
        for (int grade : testGrades) {
            sum += grade;
        }
        return sum / testGrades.size();
    }

    // Calculate average quiz grade
    public double calculateQuizAverage() {
        double sum = 0;
        for (int grade : quizGrades) {
            sum += grade;
        }
        return sum / quizGrades.size();
    }

    // Move to next grade level
    public void moveToNextGrade() {
        if (gradeLevel < 12) {
            gradeLevel++;
            if (gradeLevel == 12) {
                graduateStatus = true;
            }
            System.out.println(name + " has moved to grade " + gradeLevel);
        } else {
            System.out.println(name + " has already graduated!");
        }
    }

    // Getter for graduate status
    public boolean isGraduate() {
        return graduateStatus;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Example usage
        Student student1 = new Student("John", 17, 11);
        student1.addTestGrade(85);
        student1.addTestGrade(78);
  
        student1.addQuizGrade(75);
        student1.addQuizGrade(80);

        System.out.println("Test Average: " + student1.calculateTestAverage());
        System.out.println("Quiz Average: " + student1.calculateQuizAverage());

        student1.moveToNextGrade();
        System.out.println("Graduate Status: " + student1.isGraduate());
    }
}
