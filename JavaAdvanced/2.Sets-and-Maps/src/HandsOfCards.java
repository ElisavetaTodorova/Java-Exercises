import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        LinkedHashMap<String, HashSet<String>> hands = new LinkedHashMap<>();
        while (!name.equals("JOKER")) {
            String[] line = scanner.nextLine().split(":");
            name = line[0];
            if (!name.equals("JOKER")) {
                if (!hands.containsKey(name)) {
                    hands.put(name, new HashSet<>());
                }
                String[] cards = line[1].replace(" ", "").split(",");
                for (String card : cards) {
                    hands.get(name).add(card);
                }
            }
        }
        for (String s : hands.keySet()) {
            System.out.printf("%s: %d\n",s,calculateHand(hands.get(s)));
        }


    }
    static int calculateHand(HashSet<String> set){
        int hand=0;
        for (String s : set) {

            int first=s.charAt(0);
            int second=s.charAt(1);
            if(first==49){
                first=10;
                second=s.charAt(2);
            }else if(first<65){
                first=first-48;
            }else{
                switch (first){
                    case 'A':first=14;
                        break;
                    case 'K':first=13;
                        break;
                    case 'Q':first=12;
                        break;
                    case 'J':first=11;
                        break;
                }
            }
            switch (second){
                case 'S':second=4;
                    break;
                case 'H':second=3;
                    break;
                case 'D':second=2;
                    break;
                case 'C':second=1;
                    break;
            }
            hand+=first*second;


        }
        return hand;
    }
}
