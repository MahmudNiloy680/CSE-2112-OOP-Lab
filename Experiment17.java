import java.util.Scanner;
public class Experiment17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int t1 = 0, t2 = 1;
        System.out.print("Sequence: " + t1 + " " + t2);
        for(int i = 2; i < n; i++) {
            int sum = t1 + t2;
            System.out.print(" " + sum);
            t1 = t2;
            t2 = sum;
        } sc.close();
    }
}