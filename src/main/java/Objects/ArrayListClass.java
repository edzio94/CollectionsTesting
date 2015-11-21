package Objects;

import java.util.ArrayList;

/**
 * Created by lukasz on 21.11.15.
 */
public class ArrayListClass extends AbstractList {

    public final String ID = "Array List";


    public ArrayListClass(boolean sortAble) {
        super( sortAble);
        this.list = new ArrayList<>();
    }


}
