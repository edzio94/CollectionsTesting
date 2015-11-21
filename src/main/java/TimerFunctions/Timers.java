package TimerFunctions;

import Datas.DataHandler;
import Objects.Person;
import Parser.CSVParserClass;

import java.util.*;


/**
 * Created by lukasz on 16.11.15.
 */
public class Timers {
    public long addToCollection(Collection<Person> obj  /*AbstractList obj*/, DataHandler data, CSVParserClass parserClass) {
        long start = System.nanoTime();
        for (String record : data.records)
        {
            String [] person = parserClass.getFields(record);
            obj.add(new Person(person));
        }
        long end = System.nanoTime();
        return ((end - start) / 1000000);
    }

    public long goThroughCollection(Collection<Person> obj)
    {
        long start = System.nanoTime();
        for (Person p : obj);
        long end = System.nanoTime();
        return ((end - start) / 1000000);
    }

    public long clearCollection(Collection<Person> obj)
    {
        long start = System.nanoTime();
        obj.clear();
        long end = System.nanoTime();
        return ((end - start) / 1000000);
    }

    public long sortCollection (Collection<Person> obj){
        long start = System.nanoTime();
        Collections.sort((List<Person>)obj, Person.Comparators.NAME_AND_LAST_NAME);

        long end = System.nanoTime();
        return ((end - start) / 1000000);
    }
}
