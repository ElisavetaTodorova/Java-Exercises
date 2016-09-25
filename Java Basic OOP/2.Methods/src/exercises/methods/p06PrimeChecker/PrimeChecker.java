package exercises.methods.p06PrimeChecker;

import com.sun.org.apache.bcel.internal.classfile.ClassFormatException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ELISAV on 2.9.2016 г..
 */
public class PrimeChecker {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.valueOf(reader.readLine());
        Number num=null;
        boolean isPrime=true;
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if(n%i==0){
                isPrime=false;
            }
        }
//        if(n<0){
//             num=new Number(-1,false);
//        }else {
//            num=new Number(n,isPrime);
//
//        }
        num=new Number(n,isPrime);
        Number nextPrimeNumber=num.nextPrimeNumber();
        System.out.println(nextPrimeNumber.getValue()+", "+
                            num.getPrime());
        Field[] fields = Number.class.getDeclaredFields();

        List<Field> filedsDeclared = Arrays.stream(fields)
                .filter(f -> f.getName().contains("prime") || f.getName().contains("number"))
                .collect(Collectors.toList());

        List<Constructor<?>> constructors = Arrays.stream(Number.class.getDeclaredConstructors())
                .filter(c -> c.getParameterCount() > 1)
                .collect(Collectors.toList());

        if (filedsDeclared.size() <= 1 || constructors.size() < 1) {
            throw new ClassFormatException();
        }



    }

}
