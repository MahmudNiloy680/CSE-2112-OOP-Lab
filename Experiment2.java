import java.util.Scanner;
public class Experiment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do you want to calculate the average for? ");
        int n = sc.nextInt();
        double sum = 0;
        System.out.println("Please enter " + n + " numbers:");
        for(int i = 1; i <= n; i++) {
            System.out.print("Number " + i + ": ");
            double num = sc.nextDouble();
            sum += num;
        }
        sc.close();
        double average = sum / n;
        System.out.println("-----------------------------");
        System.out.println("The calculated Average is: " + average);
    }
}