
import java.util.*;

class LinearQueue {
    int[] queue;
    int front, rear, size;

    LinearQueue(int size) {
        this.size = size;
        front = -1;
        rear = -1;
        queue = new int[size];
    }

    // ENQUEUE
    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue is Full!");
        } else {
            if (front == -1) {
                front = 0;
            }

            queue[++rear] = value;
            System.out.println(value + " entered the queue.");
        }
    }

    // DEQUEUE
    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.println(queue[front] + " dequeued from the queue.");
            front++;

            if (front > rear) {
                front = -1;
                rear = -1;
            }
        }
    }

    // PEEK
    void peek() {
        if (front == -1) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.println("Front element: " + queue[front]);
        }
    }

    // DISPLAY
    void display() {
        if (front == -1) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.println("Queue elements:");

            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the queue: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Invalid queue size!");
            sc.close();
            return;
        }

        LinearQueue s = new LinearQueue(size);

        while (true) {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value: ");
                    int value = sc.nextInt();
                    s.enqueue(value);
                    break;

                case 2:
                    s.dequeue();
                    break;

                case 3:
                    s.peek();
                    break;

                case 4:
                    s.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
