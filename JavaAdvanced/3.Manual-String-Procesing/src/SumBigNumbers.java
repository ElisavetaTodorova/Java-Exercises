import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNumber = scanner.nextLine();
        String secondNumber = scanner.nextLine();
        int firstNumberLength = firstNumber.length();
        int secondNumberLength = secondNumber.length();
        int j = secondNumberLength - 1;
        StringBuilder sb = new StringBuilder();
        int tempSum = 0;
        int sum = 0;
        int firstDigit=0;
        int secondDigit=0;
        for (int i = firstNumberLength - 1; i >= 0 || j >= 0; i--, j--) {

            if(i<0){
                firstDigit=0;

            }else {
            firstDigit=firstNumber.charAt(i)-48;
            }
            if(j<0){
                secondDigit=0;
            }else{
                secondDigit=secondNumber.charAt(j)-48;
            }

            if (tempSum > 0) {
                sum = firstDigit+secondDigit + tempSum;
            } else {
                sum =firstDigit+secondDigit;
            }
            if (sum > 9) {
                sb.insert(0, sum%10);
                tempSum = sum / 10;
            } else {
                sb.insert(0, sum);
                tempSum = 0;
            }
        }
        if(tempSum>0){
            sb.insert(0,tempSum);
        }
        System.out.println(sb);

    }
}
