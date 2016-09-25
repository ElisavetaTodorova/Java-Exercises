import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] line = scanner.nextLine().toCharArray();
        int curlyBracket = 0;
        int roundBrcket = 0;
        int squareBracket = 0;
        Stack<Character> brackets = new Stack<>();

        for (char ch : line) {
            brackets.add(ch);
            if (ch == '{') {
                curlyBracket++;
            } else if (ch == '}') {
                if (brackets.size() > 0) {
                    char poped = brackets.pop();
                    if (brackets.size() > 0) {
                        if (brackets.peek() == '{') {
                            brackets.pop();
                        } else {
                            System.out.println("NO");
                            return;
                        }

                    }
                }
                curlyBracket--;
            } else if (ch == '[') {
                squareBracket++;
            } else if (ch == ']') {
                if (brackets.size() > 0) {
                    char poped = brackets.pop();
                    if (brackets.size() > 0) {
                        if (brackets.peek() == '[') {
                            brackets.pop();
                        } else {
                            System.out.println("NO");
                            return;
                        }

                    }
                }
                squareBracket--;
            } else if (ch == '(') {
                roundBrcket++;
            } else if (ch == ')') {
                if (brackets.size() > 0) {
                    char poped = brackets.pop();
                    if (brackets.size() > 0) {
                        if (brackets.peek() == '(') {
                            brackets.pop();
                        } else {
                            System.out.println("NO");
                            return;
                        }

                    }
                }
                roundBrcket--;
            }

        }
        if (curlyBracket == 0 && roundBrcket == 0 && squareBracket == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
