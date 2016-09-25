package p01.models;


import p01.interfaces.Dispatcher;
import p01.interfaces.NameChangeListener;

import java.util.EventObject;
import java.util.LinkedList;
import java.util.List;

public class DispatcherImpl implements Dispatcher {

    private String name;
    private List<NameChangeListener> listeners;
    private EventObject event;

    public DispatcherImpl() {
        this.listeners = new LinkedList<>();
    }

    @Override
    public void addNameChangeListener(NameChangeListener listener) {
        this.listeners.add(listener);
    }

    @Override
    public void removeNameChangeListener(NameChangeListener listener) {
        if(this.listeners.contains(listener)){
            this.listeners.remove(listener);
        }
    }

    public void changeName(String name) {
        this.name = name;
        this.event = new NameChange(name);
        this.fireNameChangeEvent();
    }

    @Override
    public void fireNameChangeEvent() {
        for (NameChangeListener listener : listeners) {
            listener.handleChangedName(this.event);
        }
    }
}
