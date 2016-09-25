package exercises.methods.p07ImmutableList;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ELISAV on 2.9.2016 г..
 */
public class ImmutableList {

   private List<Integer> list;

    public ImmutableList() {
        this.list = new LinkedList<>();
    }
    public ImmutableList setList(){
        return new ImmutableList();
    }
}
