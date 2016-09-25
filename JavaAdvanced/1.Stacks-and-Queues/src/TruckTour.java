import java.util.ArrayDeque;
import java.util.Scanner;

public class TruckTour {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.valueOf(scanner.nextLine());
        ArrayDeque<Station>stations=new ArrayDeque<>();
        for (int i = 0; i <n ; i++) {
            Station current=new Station();
            String[]line=scanner.nextLine().split(" ");
            current.gas=Integer.parseInt(line[0]);
            current.distanceToNext=Integer.parseInt(line[1]);
            stations.add(current);
        }
        int gas=0;
        int index=0;
        boolean founs=false;
        while (true){
            Station currentStation=stations.pollFirst();
            Station firstStation=currentStation;
            gas+=currentStation.gas;
            stations.addLast(currentStation);
            int indexAddUp=1;
            while (gas>=currentStation.distanceToNext){
                gas-=currentStation.distanceToNext;
                currentStation=stations.pollFirst();
                stations.addLast(currentStation);
                gas+=currentStation.gas;
                indexAddUp++;
                if(currentStation==firstStation){
                    founs=true;
                    break;
                }
            }
            if(founs){
                break;
            }

            index+=indexAddUp;
            gas=0;
        }
        System.out.println(index);
    }

}
class  Station{
    Integer gas;
    Integer distanceToNext;
}