package ua.com.lavi.usergenerator;

import ua.com.lavi.usergenerator.utils.PasswordGenerator;
import ua.com.lavi.usergenerator.utils.Transliterator;

public class Person{

	private String name;
    private String lastname;
    private String patronomyc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPatronomyc() {
        return patronomyc;
    }

    public void setPatronomyc(String patronomyc) {
        this.patronomyc = patronomyc;
    }

    public String getFullname() {
        return lastname + " " + name + " " + patronomyc;
    }

    public String getUsername() {
        String fullName = getFullname();
        return Transliterator.transliterate(fullName.replace(" ", "_").toLowerCase());
    }

    public String getPassword() {
        return PasswordGenerator.generatePassword();
    }

    @Override
    public String toString() {
      return getFullname();
    }
}

