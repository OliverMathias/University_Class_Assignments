// Student-1-Name: Curren Taber
// Student-1-ID: 002325149
// Student-2-Name: Oliver Mathias
// Student-2-ID: 002289410
// Prof: Rene German
// Class: CPSC 350-1
// Date: 5-12-2020
// Assignment: 5

/*
Class defining the faculty, with all the attirbutes of a person and the ones specific to professors
*/

#include "Faculty.h"

//constructor
Faculty::Faculty()
{
  m_ID = -1;
  m_name = "none";
  m_level = "none";
  m_department = "none";
  m_adviseeIDs = new DoublyLinkedList<int>();
}

//Overloaded
Faculty::Faculty(int fid, string n, string lev, string dep)
{
  m_ID = fid;
  m_name = n;
  m_level = lev;
  m_department = dep;
  m_adviseeIDs = new DoublyLinkedList<int>();
}

//Destructor
Faculty::~Faculty()
{

}

//add an advisee
void Faculty::addAdvisee(int aid)
{
  m_adviseeIDs->insertFront(aid);
}

//remove advisee
int Faculty::removeAdvisee(int aid)
{
  int target_pos = m_adviseeIDs->search(aid);
  m_adviseeIDs->removeAtPos(target_pos);
}

//print all of a faculty member's info
void Faculty::printInfo()
{
  cout << "-------------------------------" << endl;
  cout << "Type: Faculty" << endl;
  cout << "ID: " << m_ID << endl;
  cout << "Name: " << m_name << endl;
  cout << "Level: " << m_level << endl;
  cout << "Department: " << m_department << endl;
  cout << "Advisee List: " << endl;
  m_adviseeIDs->printList();
  cout << "-------------------------------" << endl;
}

//set the faculty's ID
void Faculty::setID(int id)
{
  m_ID = id;
}

//set their name
void Faculty::setName(string name)
{
  m_name = name;
}

//set their teaching level
void Faculty::setLevel(string level)
{
  m_level = level;
}

//set their department
void Faculty::setDepartment(string department)
{
  m_department = department;
}

//return the array of advisees
int* Faculty::returnAdviseeArray()
{
  int numAdvisees = m_adviseeIDs->getSize();
  adviseeArray = new int [numAdvisees];
  for (int i = 0; i<numAdvisees; i++)
  {
    int tempID = m_adviseeIDs->returnObjectAtIndex(i);
    adviseeArray[i] = tempID;
  }
  return adviseeArray;
}

//get the number of advisees
int Faculty::getNumAdvisees()
{
  return m_adviseeIDs->getSize();
}

//check if an advisee exists
bool Faculty::checkIfAdviseeExists(int id)
{
  int* adviseeArray = returnAdviseeArray();
  for (int i = 0; i < getNumAdvisees(); i++)
  {
    if (id == adviseeArray[i])
    {
      return true;
    }
  }
  return false;
}
