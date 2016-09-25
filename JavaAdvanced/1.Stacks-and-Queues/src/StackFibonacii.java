import java.util.Scanner;
import java.util.Stack;

public class StackFibonacii {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Stack<Long> stack=new Stack<>();
        stack.push(1l);
        stack.push(1l);
        int n=scanner.nextInt()-1;
        while (n>0){
            long poped=stack.pop();
            long peeked=stack.peek();
            stack.add(poped);
            stack.add(poped+peeked);
            n--;
        }
        System.out.println(stack.peek());

    }
}
