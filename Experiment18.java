import java.util.Scanner;
class MyStack {
    int top = -1;
    int max = 5;
    int[] arr = new int[max];
    void push(int x) {
        if(top == max - 1) {
            System.out.println("Stack Overflow! Cannot push.");
        } else {
            arr[++top] = x;
            System.out.println(x + " pushed to stack.");
        }
    }
    void pop() {
        if(top == -1) {
            System.out.println("Stack Underflow! Stack is empty.");
        } else {
            System.out.println("Popped element: " + arr[top--]);
        }
    }
}

public class Experiment18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack s = new MyStack();
        while(true) {
            System.out.print("\n1. Push 2. Pop 3. Exit: ");
            int ch = sc.nextInt();
            if(ch == 1) {
                System.out.print("Enter value: ");
                s.push(sc.nextInt());
            } else if(ch == 2) {
                s.pop();
            } else {
                break;
            }
        } sc.close();
    }
}