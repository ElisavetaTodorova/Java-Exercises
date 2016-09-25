import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String current = "";
        Stack<Integer> operations = new Stack<>();
        Stack<String> strings = new Stack<>();
        for (int i = 0; i < n; i++) {
            int operation = scanner.nextInt();
            if (operation == 1) {
                String line = scanner.nextLine();
                current += line.substring(1);
                operations.push(1);
                strings.add(line.substring(1));
            } else if (operation == 2) {
                int x = scanner.nextInt();
                operations.add(2);
                strings.add(current.substring(current.length() - x));
                if (current.length() - x == 0) {
                    current = "";
                } else {
                    current = current.substring(0,current.length() - x);
                }

            } else if (operation == 3) {
                int index = scanner.nextInt();
                if(current.length()>0)
                System.out.println(current.charAt(index - 1));
            } else if (operation == 4) {
                int op = 0;
                if (operations.size() > 0) {
                    op = operations.pop();
                }
                if (op == 1) {
                    if (strings.size() > 0) {
                        if (current.length() - strings.peek().length() == 0) {
                            current = "";
                            strings.pop();
                        } else {
                            current = current.substring(0,current.length() - strings.pop().length());
                        }
                    }
                } else if (op == 2 && strings.size() > 0) {
                    current += strings.pop();
                }
            }
        }
    }
}
