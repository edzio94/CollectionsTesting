package Objects;

import java.util.LinkedHashSet;

/**
 * Created by lukasz on 21.11.15.
 */
public class LinkedHashSetClass extends AbstractList {

    public LinkedHashSetClass(boolean sortAble){
        super(sortAble);
        list = new LinkedHashSet<>();
    };


}
