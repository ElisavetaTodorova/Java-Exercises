import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MagicExcheanbleWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[]input=scanner.nextLine().split(" ");
        String firstWord=input[0];
        String secondWord=input[1];
        Map<Character,Character> map=new HashMap<>();
        if (firstWord.length() != secondWord.length()) {
            System.out.println("false");
            return;
        }
        boolean condition=true;
        for (int i = 0; i < firstWord.length(); i++) {

            if(map.containsKey(firstWord.charAt(i))){
                if(map.get(firstWord.charAt(i))!=secondWord.charAt(i)){
                    condition=false;
                }
            }else{
                map.put(firstWord.charAt(i),secondWord.charAt(i));
            }
        }
        System.out.println(condition);
    }
}
