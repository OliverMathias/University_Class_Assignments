// Student-1-Name: Curren Taber
// Student-1-ID: 002325149
// Student-2-Name: Oliver Mathias
// Student-2-ID: 002289410
// Prof: Rene German
// Class: CPSC 350-1
// Date: 5-12-2020
// Assignment: 5

/*
Header class for the person cpp
*/

#ifndef PERSON_H
#define PERSON_H

#include <iostream>
using namespace std;

class Person
{
  public:
    Person() {}; //Constructor
    virtual ~Person() {}; //Destructor

    virtual void printInfo() = 0; // force print info function laer
    string getName(); //get name function
    int getID(); //get id function

  protected:
    string m_name; //name var
    int m_ID; //id var
};

#endif
