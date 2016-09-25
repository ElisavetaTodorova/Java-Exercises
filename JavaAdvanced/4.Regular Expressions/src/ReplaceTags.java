import java.util.Scanner;

public class ReplaceTags {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line="";
        StringBuilder text=new StringBuilder(line);
        while (!((line=scanner.nextLine()).equals("end"))){
            text.append(line);
        }
        line=text.substring(0);
        line=line.replace("<a","[URL").replace("</a>","[/URL]");
        System.out.println(line);
    }
}
