import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = "";
        HashMap<String, String> phoneBook = new HashMap<>();
        while (!line.equals("stop")) {
                String[] currentLine=scanner.nextLine().split("-");
            line=currentLine[0];
            if(!line.equals("stop")&& !line.equals("search")){
                phoneBook.put(currentLine[0],currentLine[1]);
            }
            if(line.equals("search")){
                while (!line.equals("stop")){
                    line=scanner.nextLine();
                    if(phoneBook.containsKey(line)){
                        System.out.printf("%s -> %s\n",line,phoneBook.get(line));
                    }else if(!line.equals("stop")){
                        System.out.printf("Contact %s does not exist\n",line);
                    }
                }
            }

        }

    }
}
