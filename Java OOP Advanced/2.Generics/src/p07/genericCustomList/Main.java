package p07.genericCustomList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        CustomList list=new CustomListImpl<>(String.class);
        String input=null;
        while (!(input=reader.readLine()).equals("END")){

            String [] params=input.split("\\s+");

            executeCommand(list,params);
        }
    }

    private static void executeCommand(CustomList list, String[] params) {

        String command=params[0];
        switch (command){

            case "Add":
                String input=params[1];
                list.add(input);
                break;
            case "Max":
                System.out.println(list.getMax());
                break;
            case "Min":
                System.out.println(list.getMin());
                break;
            case "Greater":
                System.out.println(list.countGreaterThat(params[1]));
                break;
            case "Swap":
                int firstIndex=Integer.parseInt(params[1]);
                int secondIndex=Integer.parseInt(params[2]);
                list.swap(firstIndex,secondIndex);
                break;
            case "Contains":
                System.out.println(list.contains(params[1]));
                break;
            case "Print":
                int length=list.length();
                for (int i = 0; i < length; i++) {
                    System.out.println(list.get(i));
                }
                break;

        }
    }

}
