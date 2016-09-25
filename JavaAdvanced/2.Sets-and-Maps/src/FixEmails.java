import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name="";
        String email;
        while (!name.equals("stop")){
            name=scanner.nextLine();
            if(!name.equals("stop")){
                email=scanner.nextLine();
                if(!(email.substring(email.length()-2).equals("uk"))
                        &&!(email.substring(email.length()-2).equals("us"))){
                    System.out.printf("%s -> %s\n",name,email);

                }
            }

        }
    }
}
