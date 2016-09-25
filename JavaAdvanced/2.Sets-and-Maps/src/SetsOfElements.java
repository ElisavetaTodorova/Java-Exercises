import java.util.HashSet;
import java.util.Scanner;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[]line=scanner.nextLine().split(" ");
        int n=Integer.valueOf(line[0]);
        int m=Integer.valueOf(line[1]);
        HashSet<Integer>firstSet=new HashSet<>();
        HashSet<Integer>secondSet=new HashSet<>();
        for (int i = 0; i < n; i++) {
            firstSet.add(Integer.valueOf(scanner.nextLine()));

        }
        for (int i = 0; i <m ; i++) {
            secondSet.add(Integer.valueOf(scanner.nextLine()));
        }
        firstSet.retainAll(secondSet);
        firstSet.forEach(s->System.out.print(s+" "));
    }
}
