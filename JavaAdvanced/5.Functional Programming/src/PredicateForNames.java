import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nameLength = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split(" ");
        Predicate<String> length = s -> s.length() <= nameLength;
        for (String name : names) {
            if(length.test(name)){
                System.out.println(name);
            }
        }
    }
}
