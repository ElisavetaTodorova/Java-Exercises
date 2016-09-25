package p01.models;

import p01.interfaces.NameChangeListener;

import java.util.EventObject;

/**
 * Created by ELISAV on 12.9.2016 г..
 */
public class Handler implements NameChangeListener {

    @Override
    public void handleChangedName(EventObject event) {
        System.out.println("Dispatcher's name changed to " + event.getSource().toString()+".");
    }


}
