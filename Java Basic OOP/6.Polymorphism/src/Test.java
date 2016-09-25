/**
 * Created by ELISAV on 6.9.2016 г..
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(fmt(500.0));
    }

    public static String fmt(double d) {
        if (d == (long) d)
            return String.format("%d", (long) d);
        else
            return String.format("%s", d);
    }
}
