package Collections;

import Objects.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukasz on 16.11.15.
 */
public class CollectionsList {
   public List<AbstractList> list;


    public CollectionsList()
    {
        list = new ArrayList<>();
        list.add(new ArrayListClass(true));
        list.add(new HashSetClass(false));
        list.add(new LinkedHashSetClass(false));
        list.add(new LinkedListClass(true));
        list.add(new TreeSetClass(false));
    }
}
