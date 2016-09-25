import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String input=reader.readLine();
        StringBuilder sb=new StringBuilder();
        for (int i = input.length()-1; i >=0 ; i--) {
            sb.append(input.charAt(i));
        }
        System.out.println(sb);
    }
}
