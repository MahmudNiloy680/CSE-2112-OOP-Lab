import java.util.Scanner;
class Person {
    void role() {
        System.out.println("I am a human being.");
    }
}
class Teacher extends Person {
    @Override
    void role() {
        System.out.println("My Role: I teach students.");
    }
}
class Student extends Person {
    @Override
    void role() {
        System.out.println("My Role: I study for exams.");
    }
}
public class Experiment11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p;
        System.out.println("Choose Identity: 1. Teacher 2. Student");
        int choice = sc.nextInt();
        sc.close();
        if(choice == 1) {
            p = new Teacher();
        } else {
            p = new Student();
        }
        p.role();
    }
}