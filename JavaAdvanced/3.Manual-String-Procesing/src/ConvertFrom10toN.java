import java.math.BigInteger;
import java.util.Scanner;

public class ConvertFrom10toN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BigInteger base=scanner.nextBigInteger();
        BigInteger number=scanner.nextBigInteger();
        System.out.println(convert(base,number));

    }
    static  StringBuilder convert(BigInteger base,BigInteger number){
        StringBuilder result=new StringBuilder();
        BigInteger zero=BigInteger.ZERO;
        while (!number.equals(zero)){
            BigInteger rest=number.mod(base);
            result.insert(0,rest);
            number=number.divide(base);
        }

        return result;
    }
}
