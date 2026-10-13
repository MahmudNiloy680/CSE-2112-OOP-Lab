import java.util.Scanner;
public class Experiment15 {
    void area(double r) {
        System.out.println("Area of Circle: " + (3.1416 * r * r));
    }
    void area(int l, int w) {
        System.out.println("Area of Rectangle: " + (l * w));
    }
    void area(double b, double h) {
        System.out.println("Area of Triangle: " + (0.5 * b * h));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Experiment15 obj = new Experiment15();
        System.out.println("1. Circle\n2. Rectangle\n3. Triangle");
        System.out.print("Choose Shape: ");
        int ch = sc.nextInt();
        if(ch == 1) {
            System.out.print("Enter Radius: ");
            obj.area(sc.nextDouble());
        } else if(ch == 2) {
            System.out.print("Enter Length and Width: ");
            obj.area(sc.nextInt(), sc.nextInt());
        } else if(ch == 3) {
            System.out.print("Enter Base and Height: ");
            obj.area(sc.nextDouble(), sc.nextDouble());
        } else {
            System.out.println("Invalid Choice");
        } sc.close();
    }
}