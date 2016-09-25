import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = "abc";
        Pattern pattern = Pattern.compile("\\+359( |-)+2\\1\\d{3}\\1\\d{4}");

        while (!line.equals("end")) {
            line=scanner.nextLine();
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                System.out.println(matcher.group());

            }
        }
    }
}
