// Student-1-Name: Curren Taber
// Student-1-ID: 002325149
// Student-2-Name: Oliver Mathias
// Student-2-ID: 002289410
// Prof: Rene German
// Class: CPSC 350-1
// Date: 5-12-2020
// Assignment: 5

/*
Header file for student class
*/

#ifndef STUDENT_H
#define STUDENT_H

#include<iostream>
#include <fstream>
#include <string>
#include <vector>
#include <cassert>
#include "Person.h"
using namespace std;

class Student : public Person
{
  public:
    Student(); //Constructor
    Student(int sid, int aid, string n, string lev, string maj, double g); //Overloaded Constructor
    Student(Student& s);
    ~Student(); //Destructor

    void printInfo(); //Prints the info of the student
    void setID(int id); //set id
    void setName(string name); //set the name
    void setAdvisorID(int aid); // set advisor
    void setLevel(string level); // set the level
    void setMajor(string major); //set major
    void setGPA(double gpa); //set gpa

    double getGPA(); //get gpa
    int getAdvisorID(); //get advisor

    bool isGPAEqualTo(Student* otherStudent); //gpa equality
    bool isGPALessThan(Student* otherStudent); //gpa less than
    bool isGPAGreaterThan(Student* otherStudent); //gpa greater than

  private:
    int m_advisorID; //Advisor ID
    string m_level; //Level
    string m_major; //Major
    double m_GPA; //GPA

};

#endif
