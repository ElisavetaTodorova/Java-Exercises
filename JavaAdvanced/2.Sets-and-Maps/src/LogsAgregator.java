import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class LogsAgregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Long> users = new TreeMap<>();
        Map<String, TreeMap<String,TreeSet>> ipAddress = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String ip = input[0];
            String user = input[1];
            Long duration = Long.parseLong(input[2]);
            if (!ipAddress.containsKey(user)) {
                ipAddress.put(user, new TreeMap<>());
                users.put(user, 0l);
                ipAddress.get(user).put(user,new TreeSet());
            }
            if(ipAddress.get(user).containsKey(user)){
                ipAddress.get(user).get(user).add(ip);
            }

            users.put(user, users.get(user) + duration);

        }

        for (String key: ipAddress.keySet()) {
            System.out.print(key + ": " + users.get(key)+" [");
            int z=ipAddress.get(key).get(key).size();

            for (Object ip :ipAddress.get(key).get(key)) {
                --z;
                if(z>0){
                    System.out.print(ip+", ");

                }else {
                    System.out.println(ip+"]");

                }

            }

        }
    }
}
