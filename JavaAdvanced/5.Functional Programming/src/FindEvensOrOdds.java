import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = Arrays.asList(scanner.nextLine().split(" ")).stream().
                map(s -> Integer.parseInt(s)).toArray(Integer[]::new);
        String type = scanner.next();

        Predicate<Integer> even = n -> n % 2 == 0;
        Predicate<Integer> odd = n -> n % 2 != 0;
        for (int i = numbers[0]; i <= numbers[1]; i++) {
            if (type.equals("even") && even.test(i)) {
                System.out.print(i + " ");

            } else if (type.equals("odd") && odd.test(i)) {
                System.out.print(i + " ");
            }


        }
    }
}
