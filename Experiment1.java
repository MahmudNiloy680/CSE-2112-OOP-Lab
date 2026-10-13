import java.util.Scanner;
public class Experiment1 {
    String message;
    void setMessage(String m) {
        message = m;
    }
    void displayMessage() {
        System.out.println("Output from Object: " + message);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Experiment1 obj = new Experiment1();
        System.out.print("Enter a custom message for the object: ");
        String userInput = sc.nextLine();
        sc.close();
        obj.setMessage(userInput);
        obj.displayMessage();
    }
}