import java.util.Scanner;
public class Experiment20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size (Rows): ");
        int n = sc.nextInt(); sc.close();
        System.out.println("--- Alphabet Pattern ---");
        for(int i = 1; i <= n; i++) {
            char c = 'A';
            for(int j = 1; j <= i; j++) {
                System.out.print(c++ + " ");
            }
            System.out.println();
        }
        System.out.println("--- Diamond Pattern ---");
        for(int i = 1; i <= n; i++) {
            for(int s = 1; s <= n - i; s++)
                System.out.print(" ");
            for(int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i = n - 1; i >= 1; i--) {
            for(int s = 1; s <= n - i; s++)
                System.out.print(" ");
            for(int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}