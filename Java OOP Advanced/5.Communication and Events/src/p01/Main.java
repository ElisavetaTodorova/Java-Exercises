package p01;

import p01.interfaces.Dispatcher;
import p01.interfaces.NameChangeListener;
import p01.models.DispatcherImpl;
import p01.models.Handler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Dispatcher dispatcher=new DispatcherImpl();
        NameChangeListener listener=new Handler();
        dispatcher.addNameChangeListener(listener);
        String name=null;
        while (!(name=reader.readLine()).equals("End")){
            dispatcher.changeName(name);
        }


    }

}
