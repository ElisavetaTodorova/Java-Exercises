package p03.genericSwapMethdString;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        LinkedList<GenericBox> boxList =new LinkedList<>();
        int n=Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            GenericBox box=new GenericBox(Integer.parseInt(reader.readLine()));
            boxList.add(box);
        }
        Integer[] indexes= Arrays.asList(reader.readLine().split("\\s+"))
                .stream().map(s->Integer.parseInt(s))
                .toArray(Integer[]::new);

        swap(boxList,indexes[0],indexes[1]);

        for (GenericBox genericBox : boxList) {
            System.out.println(genericBox.toString());
        }


    }

    public static <T> void swap(LinkedList<T> list,int firstIndex,int secondIndex){

        T firstValue=list.get(firstIndex);
        T secondValue=list.get(secondIndex);
        list.remove(firstIndex);
        list.add(firstIndex,secondValue);
        list.remove(secondIndex);
        list.add(secondIndex,firstValue);


    }

}
