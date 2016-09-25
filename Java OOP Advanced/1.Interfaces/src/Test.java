/**
 * Created by ELISAV on 7.9.2016 г..
 */
public class Test<E>{

    public static void main(String[] args) {
        X size=new X("hjdhid");
        System.out.println(size);
    }
}
class X<E>{

    public  E x;

    public X(E x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return x.toString();
    }
}
