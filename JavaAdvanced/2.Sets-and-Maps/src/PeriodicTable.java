import sun.font.FontRunIterator;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int linesCount=Integer.valueOf(scanner.nextLine());
        TreeMap<String,Integer> set=new TreeMap();
        for (int i = 0; i <linesCount ; i++) {
            String[]elements=scanner.nextLine().split(" ");
            for (String element : elements) {
                set.put(element,0);
            }
        }

        set.keySet().forEach(s->System.out.print(s+" "));
    }
}
