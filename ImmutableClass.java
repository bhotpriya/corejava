import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//final class
public final class ImmutableClass {
    // private final variable
    private final int value;

    private final List<String> list;
    private final ArrayList<String> newlist;

    // constructor
    public ImmutableClass(int value, List<String> list, ArrayList<String> newlist) {
        this.value = value;
        this.list = Collections.unmodifiableList(list);
        this.newlist = new ArrayList<>(newlist); // deep copy
        ;
    }

    // only getter methods
    public int getValue() {
        return value;
    }


    public List<String> getList() {
        return list;
    }

    public ArrayList<String> getNewlist() {
        return (ArrayList<String>) Collections.unmodifiableList(newlist);
    }
}
