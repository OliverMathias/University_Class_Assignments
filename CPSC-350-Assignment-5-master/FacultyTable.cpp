// Student-1-Name: Curren Taber
// Student-1-ID: 002325149
// Student-2-Name: Oliver Mathias
// Student-2-ID: 002289410
// Prof: Rene German
// Class: CPSC 350-1
// Date: 5-12-2020
// Assignment: 5

/*
CThe cpp for the faculty table class which stores all faculty and allows us to perform more
complex functions on the group
*/

#include "FacultyTable.h"

//constructor
FacultyTable::FacultyTable()
{
  m_facultyTree = new BST<Faculty>();
}

//Destructor
FacultyTable::~FacultyTable()
{

}

//add faculty member to table
void FacultyTable::add(int key, Faculty value)
{
  m_facultyTree->insert(key, value);
}

//make sure a faculty member is in the table
bool FacultyTable::find(int key)
{
  if (m_facultyTree->search(key))
    return true;
  else
    return false;
}

//get the pointer of a Faculty member
Faculty* FacultyTable::get(int key)
{
  //returns the faculty object from a specific node in the table
  return &m_facultyTree->getNode(key)->m_value;
}

//remove a faculty member
bool FacultyTable::remove(int key)
{
  return m_facultyTree->deleteNode(key);
}

//print the whole table
void FacultyTable::printTable(string direction)
{
  m_facultyTree->printTree(m_facultyTree->getRoot(), direction);
}

//print the faculty info from their id
void FacultyTable::printFacultyInfoFromID(int id)
{
  Faculty* temp = get(id);
  temp->printInfo();
}

//return the array of faculty IDs in table
int* FacultyTable::getIDArray()
{
  return m_facultyTree->returnKeys();
}

//get the size of the table
int FacultyTable::getTableSize()
{
  return m_facultyTree->getSize();
}

//get the array of a faculty's advisees
int* FacultyTable::getFacultyAdviseeArray(int id)
{
  Faculty* temp = get(id);
  return temp->returnAdviseeArray();
}

//get the number of advisees a faculty member has
int FacultyTable::getFacultyNumAdvisees(int id)
{
  Faculty* temp = get(id);
  return temp->getNumAdvisees();
}
