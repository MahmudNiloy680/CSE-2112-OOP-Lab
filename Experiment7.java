import java.util.Scanner;
class MathUtils {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class Experiment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathUtils math = new MathUtils();
        System.out.println("1. Add two numbers");
        System.out.println("2. Add three numbers");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        if(choice == 1) {
            System.out.print("Enter two numbers: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println("Sum: " + math.add(x, y));
        } else {
            System.out.print("Enter three numbers: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            System.out.println("Sum: " + math.add(x, y, z));
        }
        sc.close();
    }
}