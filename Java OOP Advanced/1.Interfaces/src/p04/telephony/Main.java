package p04.telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by ELISAV on 7.9.2016 г..
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String [] phoneNumbers=reader.readLine().split("\\s+");
        String[] urls=reader.readLine().split("\\s+");
        SmartPhone smartPhone=new SmartPhone(Arrays.asList(phoneNumbers),Arrays.asList(urls));
        System.out.printf("%s",smartPhone.call());
        System.out.printf("%s",smartPhone.search());
    }

}
