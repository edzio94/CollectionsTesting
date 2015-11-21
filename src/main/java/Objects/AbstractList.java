package Objects;

import Objects.Person;

import java.util.Collection;


/**
 * Created by lukasz on 21.11.15.
 */
public abstract class AbstractList {

    public Collection<Person> list;
    public boolean sortAble;

    public AbstractList(boolean sortAble) {


        this.sortAble = sortAble;
    }
    public String getID()
    {

        String className[] = this.getClass().getName().split("\\.");
        return className[className.length -1];
    }

}
