import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> names = new LinkedList<>();
        String[] usernames = scanner.nextLine().split("[\\/\\\\()\\s+]");
        for (String username : usernames) {
            if (isValid(username)) {
                names.add(username);
            }

        }
        int maxSum = Integer.MIN_VALUE;
        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = 0; i < names.size() - 1; i++) {
            int sum = 0;
            int firstLenght = names.get(i).length();
            int secondLenght = names.get(i + 1).length();

            sum = firstLenght + secondLenght;
            if (sum > maxSum) {
                maxSum = sum;
                firstIndex = i;
                secondIndex = i + 1;

            }
        }

        System.out.println(names.get(firstIndex));
        System.out.println(names.get(secondIndex));


    }

    static boolean isValid(String username) {
        Pattern pattern = Pattern.compile("\\b[a-zA-Z]\\w{2,24}\\b");
        Matcher matcher = pattern.matcher(username);

        return matcher.find();
    }

}
