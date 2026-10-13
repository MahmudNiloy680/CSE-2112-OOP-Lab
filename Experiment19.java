import java.util.Scanner;
class MyQueue {
    int front = 0, rear = 0, max = 5;
    int[] arr = new int[max];
    void enqueue(int x) {
        if(rear == max) {
            System.out.println("Queue Full!");
        } else {
            arr[rear++] = x;
            System.out.println(x + " enqueued.");
        }
    }
    void dequeue() {
        if(front == rear) {
            System.out.println("Queue Empty!");
        } else {
            System.out.println("Dequeued: " + arr[front++]);
        }
    }
}
public class Experiment19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyQueue q = new MyQueue();
        while(true) {
            System.out.print("\n1. Enqueue 2. Dequeue 3. Exit: ");
            int ch = sc.nextInt();
            if(ch == 1) {
                System.out.print("Value: ");
                q.enqueue(sc.nextInt());
            } else if(ch == 2) {
                q.dequeue();
            } else {
                break;
            }
        } sc.close();
    }
}