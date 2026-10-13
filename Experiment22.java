import java.io.*;
import java.util.Scanner;
public class Experiment22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter text to save to file: ");
            String input = sc.nextLine(); sc.close();
            FileWriter fw = new FileWriter("my_data.txt");
            fw.write(input);
            fw.close();
            System.out.println("Data successfully saved to 'my_data.txt'.");
            System.out.println("\n--- Reading from File ---");
            File file = new File("my_data.txt");
            Scanner fileSc = new Scanner(file);
            while(fileSc.hasNextLine()) {
                System.out.println(fileSc.nextLine());
            }
            fileSc.close();
        } catch(IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}