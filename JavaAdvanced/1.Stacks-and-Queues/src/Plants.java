import java.util.LinkedList;
import java.util.Scanner;

public class Plants {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        LinkedList<Integer>plants=new LinkedList<>();
        for (int i = 0; i <n ; i++) {
            plants.add(scanner.nextInt());
        }
        LinkedList<Integer>indexes=new LinkedList<>();
        int size=plants.size();
        int counter=0;
        while (true) {
            int currentCounter = 0;
            for (int i = 0; i < size - 1; i++) {

                if (plants.get(i) < plants.get(i + 1)) {
                    indexes.add(i + 1);
                    currentCounter++;
                }


            }
            if (currentCounter > 0) {
                counter++;
            } else {
                break;
            }
            for (Integer index:indexes) {
                plants.remove(index);
                plants.add(index,-1);
            }
            int size2=plants.size();
            for (int i = 0; i <size2 ; i++) {
                if(plants.get(i)==-1){
                    plants.remove(i);
                }
            }
            size=plants.size();
            indexes.clear();

        }


    }
}
