import java.util.Scanner;

public class CountSubstrinOccurences {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine().toLowerCase();
        String searchedWord=scanner.nextLine().toLowerCase();
        int count=0;
        int index=0;
        int startIndex=0;
        while (index!=-1){
            index=text.indexOf(searchedWord,startIndex);
            if(index!=-1){
                count++;
                startIndex=index+1;
            }


        }
        System.out.println(count);
    }
}
