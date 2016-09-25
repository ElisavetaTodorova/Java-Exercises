import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringToCheck = "";
        TreeMap<String, TreeMap<String,ArrayList>> logs = new TreeMap<>();
        while (!stringToCheck.equals("end")) {
            String[] line = scanner.nextLine().split(" ");
            stringToCheck=line[0];
            if(!stringToCheck.equals("end")){
                String IPAddress=line[0].substring(3);
                String user=line[2].substring(5);
                if(logs.containsKey(user)){
                    if(logs.get(user).containsKey(IPAddress)){
                        logs.get(user).get(IPAddress).add(1);
                    }else{
                        logs.get(user).put(IPAddress,new ArrayList());
                        logs.get(user).get(IPAddress).add(1);
                    }

                }else {
                    logs.put(user,new TreeMap<>());
                    logs.get(user).put(IPAddress,new ArrayList());
                    logs.get(user).get(IPAddress).add(1);

                }

            }


        }
        for (String s : logs.keySet()) {
            System.out.println(s+": ");
            int size=logs.get(s).keySet().size();
            for (String s1 : logs.get(s).keySet()) {
                if(size>1) {
                    System.out.print(s1 + " => " + logs.get(s).get(s1).size() + ", ");
                }else {
                    System.out.print(s1 + " => " + logs.get(s).get(s1).size() + ".\n");

                }
                size--;
            }
        }

    }
}
