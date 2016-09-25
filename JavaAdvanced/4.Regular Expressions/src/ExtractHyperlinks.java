import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractHyperlinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line=scanner.nextLine();
        String regex="<a[^>]+href\\s*=\\s*(?:\"([^\"]*)\"|'([^']*)'|([^\\s>]*))[^>]*>";
        Pattern pattern=Pattern.compile(regex);
        StringBuilder text=new StringBuilder();
        while (!line.equals("END")){
            text.append(line);
            line=scanner.nextLine();
        }
        Matcher matcher=pattern.matcher(text.toString());
        while (matcher.find()){
            if(matcher.group(1)!=null){
                System.out.println(matcher.group(1));
            }else if(matcher.group(2)!=null){
                System.out.println(matcher.group(2));
            }else if(matcher.group(3)!=null){
                System.out.println(matcher.group(3));
            }
        }




    }
}
