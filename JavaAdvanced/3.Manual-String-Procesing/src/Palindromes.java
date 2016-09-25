import java.text.Collator;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;

public class Palindromes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[]words=scanner.nextLine().split("[,.?!\\s]+");
        Collator colator=Collator.getInstance(Locale.ENGLISH);
        colator.setStrength(Collator.PRIMARY);
        Set<String> set=new TreeSet<>(colator);
        for (String word : words) {
            if(isPalindrom(word)){
                set.add(word);
            }
        }
        System.out.println(set);
    }
    static boolean isPalindrom(String word){
        int size=word.length()/2;
        int firsSize=size;
        int secondSize=size;
        if(word.length()==2){
            firsSize=0;
            secondSize=1;
        }else if(word.length()%2==0){
            --firsSize;
        }
        while (firsSize>=0&&secondSize<word.length()){
            if(word.charAt(firsSize--)!=word.charAt(secondSize++)){
                return  false;
            }
        }
        return true;
    }
}

