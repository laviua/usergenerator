package ua.com.lavi.usergenerator.factory;

import ua.com.lavi.usergenerator.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by lavi on 15.03.2015.
 */
public class RandomPersonFactory extends PersonFactory {
    private MalePersonFactory mpf;
    private FemalePersonFactory fpm;

    @Override
    public Person getPerson() {

        if (new Random().nextBoolean()) {
            if (mpf == null) {
                mpf = new MalePersonFactory();
            }
            return mpf.getPerson();
        }
        else {
            if (fpm == null) {
                fpm = new FemalePersonFactory();
            }
            return fpm.getPerson();
        }
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
