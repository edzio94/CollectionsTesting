package Objects;

import java.util.HashSet;

/**
 * Created by lukasz on 21.11.15.
 */
public class HashSetClass extends AbstractList {
    public final String ID = "Hash Set" ;


    public HashSetClass(boolean sortAble) {
        super( sortAble);
        list  = new HashSet<>();
    }




}
