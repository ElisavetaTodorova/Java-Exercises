import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[]bannedWords=scanner.nextLine().split(", ");
        String text=scanner.nextLine();
        String hugeString="************************************";
        for (String bannedWord : bannedWords) {
            text=text.replace(bannedWord,hugeString.substring(0,bannedWord.length()));
        }
        System.out.println(text);
    }
}
