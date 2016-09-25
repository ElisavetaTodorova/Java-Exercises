package p03;

import p03.interfaces.Stack;
import p03.models.StackImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Stack stack = new StackImpl();
        String[] input = reader.readLine().split("[, ]+");
        while (!input[0].equals("END")) {

            switch (input[0]) {

                case "Push":
                    for (int i = 1; i < input.length; i++) {
                        stack.push(Integer.parseInt(input[i]));
                    }

                    break;
                case "Pop":
                    try {
                        stack.pop();
                    } catch (NoSuchElementException ex) {
                        System.out.println(ex.getMessage());

                    }

                    break;
            }
            input = reader.readLine().split("\\s+");
        }
        for (int i = 0; i < 2; i++) {

            for (Integer integer : stack) {
                System.out.println(integer);
            }

        }


    }


}
