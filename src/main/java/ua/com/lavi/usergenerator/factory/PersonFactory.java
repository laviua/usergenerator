package ua.com.lavi.usergenerator.factory;

import ua.com.lavi.usergenerator.Person;

import java.util.List;
import java.util.Random;

/**
 * Created by lavi on 15.03.2015.
 */
public abstract class PersonFactory {

    public abstract Person getPerson();

    public abstract List<Person> getPerson(int count);

    String randomStringFromList(List<String> list) {
        int rnd = new Random().nextInt(list.size());
        return list.get(rnd);
    }
}
