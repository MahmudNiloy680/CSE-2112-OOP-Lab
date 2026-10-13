import java.util.Scanner;
class Shape {
    void display() {
        System.out.println("[Shape Class] I am a generic geometric shape.");
    }
}
class Rectangle extends Shape {
    void rectArea(int l, int w) {
        System.out.println("[Rectangle Class] Area: " + (l * w));
    }
}
class Square extends Rectangle {
    void squareArea(int s) {
        System.out.println("[Square Class] Area: " + (s * s));
    }
}
public class Experiment10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square sq = new Square();
        sq.display();
        System.out.print("Enter side of square: ");
        int s = sc.nextInt();
        sq.squareArea(s);
        System.out.print("Enter Length and Width to use Rectangle logic: ");
        int l = sc.nextInt();
        int w = sc.nextInt();
        sq.rectArea(l, w);
        sc.close();
    }
}