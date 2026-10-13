import java.util.Scanner;
class Configuration {
    String status;
    int timeout;
    Configuration() {
        System.out.println("[System] Initializing default configuration...");
        this.status = "Active";
        this.timeout = 30;
    }
    void show() {
        System.out.println("Config Status: " + status
                + " | Timeout: " + timeout + "s");
    }
}
public class Experiment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press Enter to load default configuration...");
        sc.nextLine();
        sc.close();
        Configuration config = new Configuration();
        config.show();
    }
}