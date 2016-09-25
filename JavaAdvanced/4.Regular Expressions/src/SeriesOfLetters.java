import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeriesOfLetters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        Pattern pattern=Pattern.compile("(.)\\1{0,}");
        Matcher matcher=pattern.matcher(text);
        while (matcher.find()){
            System.out.print(matcher.group().charAt(0));
        }


    }
}
