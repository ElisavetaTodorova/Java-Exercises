import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[]names=scanner.nextLine().split(" ");
        Consumer<String> printer=name-> System.out.println(name);
        Arrays.asList(names).forEach(s->printer.accept(s));
    }
}
