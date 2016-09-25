import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFnction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Integer[]numbers= Arrays.asList(scanner.nextLine().split(" ")).stream().
                map(s->Integer.parseInt(s)).toArray(Integer[]::new);
        Function<Integer[],Integer> minElement=number-> Collections.min(Arrays.asList(number));
        System.out.println(minElement.apply(numbers));



    }
}
