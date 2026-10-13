import java.util.Scanner;
public class Experiment21 {
    int factorial(int n) {
        int f = 1;
        for(int i = 1; i <= n; i++)
            f *= i;
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Experiment21 obj = new Experiment21();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt(); sc.close();
        int factN = obj.factorial(n);
        int factR = obj.factorial(r);
        int factNmR = obj.factorial(n - r);
        int p = factN / factNmR;
        int c = p / factR;
        System.out.println("Permutation (nPr): " + p);
        System.out.println("Combination (nCr): " + c);
    }
}