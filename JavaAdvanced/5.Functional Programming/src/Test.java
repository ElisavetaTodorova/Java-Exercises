import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        if ((number & 1) == 0) {
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
