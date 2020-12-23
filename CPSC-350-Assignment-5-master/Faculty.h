// Student-1-Name: Curren Taber
// Student-1-ID: 002325149
// Student-2-Name: Oliver Mathias
// Student-2-ID: 002289410
// Prof: Rene German
// Class: CPSC 350-1
// Date: 5-12-2020
// Assignment: 5

/*
Header file for the faculty class
*/

#ifndef FACULTY_H
#define FACULTY_H

#include<iostream>
#include "Person.h"
#include "DoublyLinkedList.h"
using namespace std;

class Faculty : public Person
{
  public:
    Faculty(); //Constructor
    Faculty(int fid, string n, string lev, string dep); //Overloaded constructor
    ~Faculty(); //Destructor

    void addAdvisee(int aid); // add an advisee to faculty member
    int removeAdvisee(int aid); //remove an advisee
    void printInfo(); //print faculty info
    void setID(int id); //set their id
    void setName(string name); //set their name
    void setLevel(string level); //set their teaching level
    void setDepartment(string department); //set their department
    int* returnAdviseeArray(); //return their advisee array of keys
    int getNumAdvisees(); //get the number of advisees in array
    bool checkIfAdviseeExists(int id); //check if an advisee exists

  private:
    string m_level; //level var
    string m_department; //dep var
    DoublyLinkedList<int>* m_adviseeIDs; //advisee array
    int* adviseeArray; //advisee id


};

#endif
