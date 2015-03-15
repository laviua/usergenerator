Usergenerator
=============

Generator of the russian names
This library contains XML files with popular names, lastnames and patronymic of russian men and women.
For filling databases or other mock objects.

Just add jar into your pom.xml (maven) and you can create Person object

    <dependency>
        <groupId>ua.com.lavi</groupId>
        <artifactId>usergenerator</artifactId>
        <version>1.0.0</version>
    </dependency>
        
For example:
    PersonFactory pf = new RandomPersonFactory();
    Person person = pf.getPerson(); // will return only one person
    List<Person> persons = pf.getPerson(150) // will return 150 persons;
