class CircularQueue {
    int[] circularqueue;
    int front, rear, size;

    CircularQueue(int size) {
        this.size = size;
        front = -1;
        rear = -1;
        circularqueue = new int[size];
    }

    // ENQUEUE
    void enqueue(int value) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full.");
        } 
        else {
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            circularqueue[rear] = value;

            System.out.println(value + " Added to queue.");
        }
    }

    // DEQUEUE
    void dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty.");
        } 
        else {
            System.out.println(circularqueue[front] + " Element dequeued.");

            if (front == rear) {
                front = -1;
                rear = -1;
            } 
            else {
                front = (front + 1) % size;
            }
        }
    }

    // PEEK
    void peek() {
        if (front == -1) {
            System.out.println("Queue is empty.");
        } 
        else {
            System.out.println("Element: " + circularqueue[front]);
        }
    }

    // DISPLAY
    void display() {
        if (front == -1) {
            System.out.println("Queue is empty.");
        } 
        else {
            System.out.println("Queue elements:");

            int i = front;

            while (true) {
                System.out.print(circularqueue[i] + " ");

                if (i == rear) {
                    break;
                }

                i = (i + 1) % size;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularQueue CQ = new CircularQueue(5);

        CQ.enqueue(3);
        CQ.enqueue(4);
        CQ.enqueue(5);
        CQ.enqueue(6);

        CQ.display();

        CQ.dequeue();

        CQ.peek();

        CQ.display();
    }
}
