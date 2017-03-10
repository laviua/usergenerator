Fake User generator [![Build Status](https://travis-ci.org/laviua/usergenerator.svg?branch=master)](https://travis-ci.org/laviua/usergenerator)
=============

Russian name generator
This library contains text files with popular names, lastnames and patronymic of russian men and women.
For populating databases or other mock objects.
        
####Example of usage:

    val femaleUserFactory: FemaleUserFactory = FemaleUserFactory() // will returns only female names, lastnames
    femaleUserFactory.getUser() // will returns only the one female user
    femaleUserFactory.getUsers(10) // will returns 150 female users;
 
