import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFulName {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line="";
        StringBuilder text=new StringBuilder();
        while (!(line=scanner.nextLine()).equals("end")){
            text.append(line);
            text.append(System.getProperty("line.separator"));

        }
        Pattern pattern=Pattern.compile("\\b([A-Z][a-z]+ [A-Z][a-z]+)\\b");
        Matcher matcher=pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
