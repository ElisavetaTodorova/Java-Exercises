package p05.genericCount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ELISAV on 8.9.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        List<Double> list=new LinkedList<>();
        int n=Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Double.parseDouble(reader.readLine()));
        }
        double compared=Double.parseDouble(reader.readLine());
        int count=countMethod(list,compared);
        System.out.println(count);

    }

    public static <T extends Comparable<T>> int countMethod(List<T> list,T parameter){
        int count=0;
        for (T t : list) {
            if(t.compareTo(parameter)>0){
                count++;
            }
        }
        return count;
    }

}
