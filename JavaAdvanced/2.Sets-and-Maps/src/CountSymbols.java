import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char[] line=scanner.nextLine().toCharArray();
        TreeMap<Character,ArrayList<Integer>> map=new TreeMap<>();
        for (char c : line) {
            if(map.containsKey(c)){
                map.get(c).add(1);
            }else {
                map.put(c, new ArrayList<>());
                map.get(c).add(1);
            }

        }
        for (Character character : map.keySet()) {
            System.out.printf("%c: %d time/s\n",character,map.get(character).size());
        }

    }
}
