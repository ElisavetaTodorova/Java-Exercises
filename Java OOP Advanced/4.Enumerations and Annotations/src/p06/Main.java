package p06;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Rank()
@Suit()
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Class<Main> mainClass = Main.class;
        Rank rank = mainClass.getAnnotation(Rank.class);
        Suit suit=mainClass.getAnnotation(Suit.class);
        String type=reader.readLine();
        switch (type){
            case "Rank":
                System.out.printf("Type = %s, Description = %s",rank.type(),rank.description());
                break;
            case "Suit":
                System.out.printf("Type = %s, Description = %s",suit.type(),suit.description());
                break;
        }

    }

}
