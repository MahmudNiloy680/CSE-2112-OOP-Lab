import java.util.Scanner;
class Box {
    int width, height;
    Box(int w, int h) {
        this.width = w;
        this.height = h;
    }
    boolean isEqual(Box b) {
        return (this.width == b.width && this.height == b.height);
    }
}
public class Experiment13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Box 1 ---");
        System.out.print("Enter Width and Height: ");
        Box b1 = new Box(sc.nextInt(), sc.nextInt());
        System.out.println("--- Box 2 ---");
        System.out.print("Enter Width and Height: ");
        Box b2 = new Box(sc.nextInt(), sc.nextInt());
        sc.close();
        if(b1.isEqual(b2)) {
            System.out.println("Result: The boxes are identical.");
        } else {
            System.out.println("Result: The boxes are different.");
        }
    }
}