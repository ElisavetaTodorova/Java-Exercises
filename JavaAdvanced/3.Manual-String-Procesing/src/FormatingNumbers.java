import java.util.Locale;
import java.util.Scanner;

public class FormatingNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner input=new Scanner(System.in);
        int a = input.nextInt();
        double b=input.nextDouble();
        double c=input.nextDouble();
        StringBuilder x=new StringBuilder(Integer.toBinaryString(a));
        for (int i = x.length(); i <10 ; i++) {
            x.insert(0,'0');
        }
        x.setLength(10);

        System.out.printf("%-10s|%-10s|%10.2f|%-10.3f|",Integer.toHexString(a).toUpperCase(),x,b,c);
    }
}
