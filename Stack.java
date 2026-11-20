import java.util.*;
class Stack{
    int[] stack;
    int top;
    Stack(int size){
        top = -1;
        stack = new int[size];
    }
    void push(int value){
        if(top == stack.length -1){
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
            System.out.println(value+"Pushed into Stack");
        }
    }
    void pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
        } else {
            top--;
            System.out.print("Element popped out.");
        }
    }
    void peek(){
        if(top == -1){
            System.out.println("Stack is empty");
        } else {
            System.out.println(stack[top]);
        }
    }
    void display(){
        if(top == -1){
            System.out.println("Stack is empty");
        } else {
            for(int i = top; i >= 0; i--){
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = sc.nextInt();
        Stack s = new Stack(size);
        do{
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the value to push: ");
                    int value = sc.nextInt();
                    s.push(value);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        } while(true);
    }
}