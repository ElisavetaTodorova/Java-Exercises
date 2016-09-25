package p01;


import p01.interfaces.ListyIterator;
import p01.models.ListyIteratorImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ListyIterator listyIterator = null;

        String input = reader.readLine();
        while (!input.equals("END")) {
            String[]params=input.split("\\s+");
            switch (params[0]) {
                case "Create":
                    String[] arrray=null;
                    if(params.length>1) {
                         arrray = input.substring(7).split("\\s+");
                    }else {
                        arrray = new String[0];
                    }
                    listyIterator=new ListyIteratorImpl(Arrays.asList(arrray));
                    break;
                case "Print":
                    try {
                        System.out.println(listyIterator.print());
                    }catch (IllegalArgumentException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "PrintAll":
                    System.out.println(listyIterator.printAll());
            }
            input = reader.readLine();

        }
    }

}
