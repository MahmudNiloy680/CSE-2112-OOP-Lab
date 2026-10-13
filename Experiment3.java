import java.util.Scanner;
public class Experiment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student's marks (0-100): ");
        int marks = sc.nextInt();
        sc.close();
        char grade;
        if(marks < 0 || marks > 100) {
            System.out.println("Invalid input! Marks must be between 0 and 100.");
            return;
        }
        if(marks >= 90) {
            grade = 'A';
        } else if(marks >= 80) {
            grade = 'B';
        } else if(marks >= 70) {
            grade = 'C';
        } else if(marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("The Grade Achieved: " + grade);
    }
}