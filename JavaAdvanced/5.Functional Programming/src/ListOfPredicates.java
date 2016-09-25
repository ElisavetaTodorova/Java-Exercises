import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.valueOf(scanner.nextLine());
        Integer[] numbers = Arrays.asList(scanner.nextLine().split("\\s+")).stream().
                map(s -> Integer.parseInt(s)).toArray(Integer[]::new);
        ArrayList<Predicate<Integer>> predicates=new ArrayList<>();
        for (Integer number : numbers) {
            predicates.add(s->s%number==0);
        }
        ArrayList<Boolean>conditon=new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            for (Predicate<Integer> predicate : predicates) {
                conditon.add(predicate.test(i));
            }
            if(!conditon.contains(false)){
                System.out.print(i+" ");
            }
            conditon.clear();
        }
    }
}
