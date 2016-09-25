import java.util.Scanner;

public class SentenceExtractor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String searchedWord=scanner.nextLine();
        String text=scanner.nextLine();
        text=text.replace(".",".<>").replace("?","?<>").replace("!","!<>");
        String []sentences=text.split("<>");
        for (String sentence : sentences) {
            if(sentence.contains("!")||sentence.contains(".")||sentence.contains("?")){
                if(sentence.toLowerCase().contains(searchedWord.toLowerCase()+".")||
                        sentence.toLowerCase().contains(searchedWord.toLowerCase()+"!")||
                        sentence.toLowerCase().contains(searchedWord.toLowerCase()+"?")||
                        sentence.toLowerCase().contains(" "+searchedWord.toLowerCase()+" ")||
                        sentence.toUpperCase().contains(searchedWord.toLowerCase()+" "))
                System.out.println(sentence);
            }
        }
    }
}
