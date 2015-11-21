package Objects;

import Parser.CSVIndexes;

import java.util.Comparator;
/**
 * Created by lukasz on 16.11.15.
 */
public class Person implements Comparable<Person>{
    public Integer ID;
    public String firstName;
    public String surName;
    public String email;
    public String Country;

    public Person(String [] person)
    {

        for (String q : person)
        this.ID = Integer.parseInt(person[CSVIndexes.ID]);
        this.firstName = person[CSVIndexes.NAME];
        this.surName = person[CSVIndexes.SURNAME];
        this.email = person[CSVIndexes.EMAIL];
        this.Country = person[CSVIndexes.COUNTRY];
    }
    @Override
    public int hashCode()
    {

        return ((this.ID != 0) ? ID.hashCode() : 0);
    }

    @Override
    public boolean equals(Object o) {

        Person p = (Person) o;
        return (this.ID.equals(p.ID));

    }


    @Override
    public int compareTo(Person o) {
        return Comparators.ID.compare(this,o);
    }

    public static class Comparators {
        public static final Comparator<Person> ID = (Person p1, Person p2) -> p1.ID.compareTo(p2.ID);
        public static final Comparator<Person> NAME = (Person p1, Person p2) ->p1.firstName.compareTo(p2.firstName);
        public static final Comparator<Person> LAST_NAME = (Person p1, Person p2) ->p1.surName.compareTo(p2.surName);
        public static final Comparator<Person> NAME_AND_LAST_NAME = (Person p1, Person p2) -> NAME.thenComparing(
                LAST_NAME).compare(p1,p2);


    }
}
