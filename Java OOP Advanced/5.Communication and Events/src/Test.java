import java.util.LinkedList;
import java.util.List;

/**
 * Created by ELISAV on 12.9.2016 г..
 */
public class Test {

    public static void main(String[] args) {
        String str1=new String("aaa");
        List<String> strings=new LinkedList<>();
        strings.add(str1);
        String str2=new String("aaa");
        System.out.println(strings.contains(str2));
    }

}
