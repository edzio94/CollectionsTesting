package Objects;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by lukasz on 21.11.15.
 */
public class TreeSetClass extends AbstractList {
    public final String ID = "Tree set";

    public TreeSetClass(boolean sortAble) {
        super(sortAble);
        list = new TreeSet<>(Comparator.<Person>naturalOrder());
    }


}
