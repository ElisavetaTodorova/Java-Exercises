import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        String[] line = scan.nextLine().split(" ");
        String[] line2 = scan.nextLine().split(" ");
        int n=Integer.parseInt(line[0]);
        int s=Integer.parseInt(line[1]);
        int x=Integer.parseInt(line[2]);
        for (int i = 0; i <line2.length ; i++) {
            stack.add(Integer.parseInt(line2[i]));
        }
        int minElement=Integer.MAX_VALUE;
        for (int i = 0; i < s; i++) {
            stack.pop();
        }

        LinkedList<Integer>list=new LinkedList<>();
        if (stack.contains(x)){
            System.out.println(true);
        }else if(stack.isEmpty()){
            System.out.println(0);
        }else{
            for (int i = 0; i <stack.size() ; i++) {
                list.add(stack.pop());
            }
            for (int i = 0; i <list.size() ; i++) {
                if (list.get(i)<minElement){
                    minElement=list.get(i);
                }

            }
            System.out.println(minElement);
        }

    }
}
