import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(scanner.nextLine());
        for (int i = sb.length(); i <20; i++) {
            sb.append("*");
        }
        sb.setLength(20);
        System.out.println(sb);
    }
}
