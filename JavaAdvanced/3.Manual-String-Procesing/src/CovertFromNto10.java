import java.math.BigInteger;
import java.util.Scanner;

public class CovertFromNto10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BigInteger base=scanner.nextBigInteger();
        BigInteger number=scanner.nextBigInteger();
        System.out.println(fromNto10(base,number.toString()));

    }
    static  BigInteger fromNto10(BigInteger base,String number){
        BigInteger result=BigInteger.ZERO;
        for (int i = 0; i < number.length(); i++) {
              String x=(number.charAt(i)-'0')+"";
             result=result.multiply(base).add(new BigInteger(x));

        }
        return result;

    }
}
