import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String []line=scanner.nextLine().split(" ");
        int n=Integer.parseInt(line[0]);
        int s=Integer.parseInt(line[1]);
        int x=Integer.parseInt(line[2]);
        Queue<Integer>queue=new ArrayDeque<>();
        for (int i = 0; i <n ; i++) {
                queue.add(scanner.nextInt());
        }
        for (int i = 0; i <s ; i++) {
            queue.poll();
        }
        if (queue.contains(x)){
            System.out.println(true);
        }else if(queue.isEmpty()){
            System.out.println(0);
        }else{
            int minValue=Integer.MAX_VALUE;
            for (Integer num:queue) {
                if(num<minValue){
                    minValue=num;
                }
            }
            System.out.println(minValue);
        }
    }
}
