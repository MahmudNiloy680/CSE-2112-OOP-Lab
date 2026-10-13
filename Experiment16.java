import java.util.Scanner;
public class Experiment16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Weight (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter Height (m): ");
        double height = sc.nextDouble();
        sc.close();
        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f\n", bmi);
    }
}