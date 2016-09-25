import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class ApliedAritmetcs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = Arrays.asList(scanner.nextLine().split(" ")).stream().
                map(s -> Integer.parseInt(s)).toArray(Integer[]::new);
        String type = scanner.nextLine();
        Function<Integer[], Integer[]> add = nums -> Arrays.asList(nums).stream().map(n -> n + 1).toArray(Integer[]::new);
        Function<Integer[], Integer[]> multiply = nums -> Arrays.asList(nums).stream().map(n -> n * 2).toArray(Integer[]::new);
        Function<Integer[], Integer[]> subtract = nums -> Arrays.asList(nums).stream().map(n -> n - 1).toArray(Integer[]::new);
        Consumer<Integer> print=n-> System.out.print(n+" ");
        //"add" -> add 1; "multiply" -> multiply by 2; "subtract" -> subtract 1; "print"
        while (!type.equals("end")) {
            switch (type) {
                case "add":
                    numbers = add.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtract.apply(numbers);
                    break;
                case "print":
                    Arrays.asList(numbers).forEach(n -> print.accept(n));
                    break;
                default:
                    return;

            }
            type=scanner.nextLine();
        }

    }
}
