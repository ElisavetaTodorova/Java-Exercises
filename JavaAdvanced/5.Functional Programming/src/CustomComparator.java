import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;
public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = Arrays.asList(scanner.nextLine().split("\\s+")).stream().
                map(s -> Integer.parseInt(s)).toArray(Integer[]::new);
        Arrays.asList(numbers).stream().sorted((x, y) -> compare(x, y)).forEach(s -> System.out.print(s + " "));

    }


    public static int compare(int x, int y) {
        if ((x & 1) == (y & 1)) {
            // Both numbers are odd or both numbers are even
            if ((x & 1) == 0) {
                // Both numbers are even: compare as usual
                return Integer.compare(x, y);
            } else {
                // Both numbers are odd: compare in reverse
                return Integer.compare(x, y);
            }
        }
        // One is odd, the other one is even
        if ((x & 1) == 0) {
            return -1;
        }
        return 1;
    }
}
