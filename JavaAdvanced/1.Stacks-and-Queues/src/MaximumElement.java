import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {

            int operation = scanner.nextInt();
            if (operation == 1) {
                int number = scanner.nextInt();
                stack.add(number);
                if (number > maxElement) {
                    maxElement = number;
                    maxStack.add(maxElement);
                }
            } else if (operation == 2) {
                int poppedElement = stack.pop();
                    if (poppedElement == maxElement) {
                        maxStack.pop();
                        if (maxStack.size() > 0) {
                            maxElement = maxStack.peek();
                        } else {
                            maxElement = Integer.MIN_VALUE;
                        }
                    }

            } else if (operation == 3) {


                System.out.println(maxElement);
            }
        }
    }
}

