import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Function;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = Arrays.asList(scanner.nextLine().split("\\s+")).stream().
                map(s -> Integer.parseInt(s)).toArray(Integer[]::new);
        Function<ArrayList<Integer>,Integer> findMinElement=num-> num.indexOf(Collections.min(num));

        System.out.println(findMinElement.apply(new ArrayList<Integer>(Arrays.asList(numbers))));

    }
}

