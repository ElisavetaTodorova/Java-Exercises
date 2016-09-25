import java.util.*;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numbers = Arrays.asList(scanner.nextLine().split(" ")).stream().
                map(s -> Integer.parseInt(s)).toArray(Integer[]::new);
        ArrayList<Integer>digits=new ArrayList<>(Arrays.asList(numbers));
        Collections.reverse(digits);
        int devider=scanner.nextInt();
        numbers=digits.stream().filter(n->n%devider!=0).toArray(Integer[]::new);
        Arrays.asList(numbers).forEach(s-> System.out.print(s+" "));
    }
}
