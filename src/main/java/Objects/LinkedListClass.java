package Objects;

import java.util.LinkedList;

/**
 * Created by lukasz on 21.11.15.
 */
public class LinkedListClass extends AbstractList {


    public LinkedListClass(boolean sortAble){
        super(sortAble);
        list= new LinkedList<>();
    }
}
