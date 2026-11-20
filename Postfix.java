import java.util.*;
class Postfix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression");
        String exp =sc.nextLine();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(Character.isdigit(ch)){
                push(ch - "0")
            }
            else{
                int val1=stack.pop();
                int val2 = stack.pop();
                switch(ch){
            case '+':
                stack.push(val1+val2);
            case '-':
                stack.push(val1-val2);
            case '*':
                stack.push(val1*val2);
            case '/':
                stack.push(val1/val2);
            }
            }
            
        }
        System.out.println("Result::"+stack.pop());
    }
}