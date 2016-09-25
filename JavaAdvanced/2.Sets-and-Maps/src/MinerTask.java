import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line="";
        LinkedHashMap<String,Integer> resources=new LinkedHashMap<>();

        while (!line.equals("stop")){
            line=scanner.nextLine();
            if(!line.equals("stop")){
                Integer quanity=Integer.parseInt(scanner.nextLine());
                if (resources.containsKey(line)) {
                    int x=resources.get(line);
                    resources.put(line,quanity+x);
                }else {
                    resources.put(line, quanity);
                }

            }
        }
        resources.keySet().forEach(key->System.out.printf("%s -> %d\n",key,resources.get(key)));

    }
}
