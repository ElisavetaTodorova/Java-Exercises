import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class CalculateSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        ArrayDeque<Long> opashka = new ArrayDeque<>();
        opashka.addFirst(n);
        for (int i = 0; i < 50; i++) {
          long current=opashka.removeFirst();
            System.out.print(current+" ");
            opashka.addLast(current+1);
            opashka.add(2*current+1);
            opashka.add(current+2);

        }

    }
}
