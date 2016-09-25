import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Stack<Integer> list=new Stack<>();
        String[] line=scan.nextLine().split(" ");
        for (int i = 0; i <line.length ; i++) {
            list.add(Integer.parseInt(line[i]));

        }
        while (list.size()!=0){
            System.out.print(list.pop()+" ");
        }

    }
}
