import java.util.Scanner;
public class Experiment14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number or String: ");
        String original = sc.next();
        sc.close();
        String reverse = "";
        for(int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if(original.equalsIgnoreCase(reverse)) {
            System.out.println("Status: It is a Palindrome.");
        } else {
            System.out.println("Status: It is NOT a Palindrome.");
        }
    }
}