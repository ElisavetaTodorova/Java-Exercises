package p01.interfaces;


public interface Dispatcher {

    void addNameChangeListener(NameChangeListener listener);

    void removeNameChangeListener(NameChangeListener listener);

    void fireNameChangeEvent();

    void changeName(String name);

}
