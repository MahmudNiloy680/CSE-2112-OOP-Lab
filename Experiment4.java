import java.util.Scanner;
class Student {
    String name;
    int rollNo;
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    void display() {
        System.out.println("Student Details Created -> Name: "
                + this.name + " | Roll: " + this.rollNo);
    }
}
public class Experiment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String n = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int r = sc.nextInt();
        sc.close();
        Student s1 = new Student(n, r);
        s1.display();
    }
}