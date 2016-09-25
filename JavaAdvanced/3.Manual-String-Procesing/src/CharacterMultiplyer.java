import java.util.Scanner;

public class CharacterMultiplyer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] line=scanner.nextLine().split(" ");
        String first=line[0];
        String second=line[1];
        int max=Math.max(first.length(),second.length());

        long sum=0;
        for (int i = 0; i <max ; i++) {
            if(i<first.length()&&i<second.length()){
                sum+=first.charAt(i)*second.charAt(i);
            }else if(i<first.length()) {

                sum+=first.charAt(i);
            }else{
                sum+=second.charAt(i);
            }

        }
        System.out.println(sum);

    }
}
