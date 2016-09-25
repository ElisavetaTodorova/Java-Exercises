import java.util.Scanner;

public class MultiplyBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNumber = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int firstNumberLength = firstNumber.length();
        StringBuilder sb = new StringBuilder();
        int tempSum = 0;
        int sum = 0;
        int otherSum=0;
        for (int i = 0; i < firstNumberLength; i++) {

            sum = (firstNumber.charAt(i) - 48) * secondNumber;

            if (sum > 9) {
                otherSum=sum/10+tempSum;
                if(otherSum>9){
                    sb.append(otherSum/10);
                }else {
                    sb.append(otherSum);
                }
                tempSum = sum % 10;
            } else {
                if(tempSum>0){
                    otherSum=sum+tempSum;
                    if(otherSum>9){
                        sb.append(otherSum/10);
                        tempSum=sum%10;
                    }else {
                        sb.append(otherSum);
                    }
                }else {
                    sb.append(sum);
                    tempSum = 0;
                }
            }
        }
        if (tempSum > 0) {
            sb.append(tempSum);
        }
        System.out.println(sb);

    }
}
