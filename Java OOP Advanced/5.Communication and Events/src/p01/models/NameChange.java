package p01.models;

import java.util.EventObject;

/**
 * Created by ELISAV on 12.9.2016 г..
 */
public class NameChange extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public NameChange(Object source) {
        super(source);
    }
}
