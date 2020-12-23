// Student-1-Name: Curren Taber
// Student-1-ID: 002325149
// Student-2-Name: Oliver Mathias
// Student-2-ID: 002289410
// Prof: Rene German
// Class: CPSC 350-1
// Date: 5-12-2020
// Assignment: 5

/*
Student class CPP, allows for creation of student types that can hold advisors, have names , grades, majors, etc 
*/

#include "Student.h"

//Constructor
Student::Student()
{
  m_ID = -1;
  m_advisorID = -1;
  m_name = "none";
  m_level = "none";
  m_major = "none";
  m_GPA = 0.0;
}

//Overloaded Constructor
Student::Student(int sid, int aid, string n, string lev, string maj, double g)
{
  m_ID = sid;
  m_advisorID = aid;
  m_name = n;
  m_level = lev;
  m_major = maj;
  m_GPA = g;
}

//copy constructor
Student::Student(Student& s)
{
  this->m_ID = s.m_ID;
  this->m_advisorID = s.m_advisorID;
  this->m_name = s.m_name;
  this->m_level = s.m_level;
  this->m_major = s.m_major;
  this->m_GPA = s.m_GPA;
}

//Destructor
Student::~Student() { }

//Prints the info of the student
void Student::printInfo()
{
  cout << "-------------------------------" << endl;
  cout << "Student ID: " << this->m_ID << endl;
  cout << "Advisor ID: " << this->m_advisorID << endl;
  cout << "Name: " << this->m_name << endl;
  cout << "Level: " << this->m_level << endl;
  cout << "Major: " << this->m_major << endl;
  cout << "GPA: " << this->m_GPA << endl;
  cout << "-------------------------------" << endl;
}

//Sets the ID
void Student::setID(int id)
{
  m_ID = id;
}

//Sets the name
void Student::setName(string name)
{
  m_name = name;
}

//Sets the advisor ID
void Student::setAdvisorID(int aid)
{
  m_advisorID = aid;
}

//Sets the level
void Student::setLevel(string level)
{
  m_level = level;
}

//Sets the level
void Student::setMajor(string major)
{
  m_major = major;
}

//Sets the level
void Student::setGPA(double gpa)
{
  m_GPA = gpa;
}

//Sets the level
double Student::getGPA()
{
  return m_GPA;
}

//get aid
int Student::getAdvisorID()
{
  return m_advisorID;
}

//check if gpa is equal to
bool Student::isGPAEqualTo(Student* otherStudent)
{
  return (m_GPA == otherStudent->getGPA());
}

//check if GPA is less than
bool Student::isGPALessThan(Student* otherStudent)
{
  return (m_GPA < otherStudent->getGPA());
}

//check if gpa is greater than
bool Student::isGPAGreaterThan(Student* otherStudent)
{
  return (m_GPA > otherStudent->getGPA());
}
