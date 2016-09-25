import java.util.Scanner;

public class UnicodeCharecters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char[]inpit=scanner.nextLine().toCharArray();
        for (char c : inpit) {
            System.out.print( "\\u" + Integer.toHexString(c | 0x10000).substring(1) );
        }
    }
}
