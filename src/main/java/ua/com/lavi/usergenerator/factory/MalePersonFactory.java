package ua.com.lavi.usergenerator.factory;

import ua.com.lavi.usergenerator.DataLoader;
import ua.com.lavi.usergenerator.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lavi on 15.03.2015.
 */
public class MalePersonFactory extends PersonFactory {

    private final List<String> names;
    private final List<String> lastnames;
    private final List<String> patronymics;

    public MalePersonFactory() {
        DataLoader loader = new DataLoader();
        lastnames = loader.loadData("malelastnames.xml");
        names = loader.loadData("malenames.xml");
        patronymics = loader.loadData("malepatronymics.xml");
    }

    public Person getPerson() {
        Person person = new Person();
        person.setLastname(randomStringFromList(lastnames));
        person.setName(randomStringFromList(names));
        person.setPatronomyc(randomStringFromList(patronymics));
        return person;
    }

    @Override
    public List<Person> getPerson(int count) {
        List<Person> persons = new ArrayList<Person>(count);
        int start = 0;
        while (start < count) {
            persons.add(getPerson());
            start++;
        }
        return persons;
    }
}
