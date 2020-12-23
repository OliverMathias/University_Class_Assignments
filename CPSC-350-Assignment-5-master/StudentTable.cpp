// Student-1-Name: Curren Taber
// Student-1-ID: 002325149
// Student-2-Name: Oliver Mathias
// Student-2-ID: 002289410
// Prof: Rene German
// Class: CPSC 350-1
// Date: 5-12-2020
// Assignment: 5

/*
Student table class holds all the students and allows us to perform more
complex functions on the group
*/

#include "StudentTable.h"

//constructor
StudentTable::StudentTable()
{
  m_studentTree = new BST<Student>();
}

//destructor
StudentTable::~StudentTable()
{
  delete m_studentTree;
}

//add a student to table
void StudentTable::add(int key, Student value)
{
  m_studentTree->insert(key, value);
}

//check if a student exists int the table
bool StudentTable::find(int key)
{
  if (m_studentTree->search(key))
    return true;
  else
    return false;
}

//get a student pointer from the table
Student* StudentTable::get(int key)
{
  //returns the Student object from a specific node in the table
  return &m_studentTree->getNode(key)->m_value;
}

//remove a stundent from the table
bool StudentTable::remove(int key)
{
  return m_studentTree->deleteNode(key);
}

//print the whole table
void StudentTable::printTable(string direction)
{
  m_studentTree->printTree(m_studentTree->getRoot(), direction);
}

//print a student's info from their IDS
void StudentTable::printStudentInfoFromID(int id)
{
  Student* temp = get(id);
  temp->printInfo();
}

//return an array of IDs of students in table
int* StudentTable::getIDArray()
{
  return m_studentTree->returnKeys();
}

//get the table size
int StudentTable::getTableSize()
{
  return m_studentTree->getSize();
}

//return the student pointer with the highest GPA
Student* StudentTable::getStudentWithHighestGPA()
{
  int* IdArray = getIDArray();
  Student* og = get(IdArray[0]);

  for (int i = 0; i < getTableSize(); i++)
  {
    Student* current = get(IdArray[i]);
    if (current->isGPAGreaterThan(og))
    {
      og = current;
    }
  }
  return og;
}

//return the student pointer with the lowerst gpa
Student* StudentTable::getStudentWithLowestGPA()
{
  int* IdArray = getIDArray();
  Student* og = get(IdArray[0]);

  for (int i = 0; i < getTableSize(); i++)
  {
    Student* current = get(IdArray[i]);
    if (current->isGPALessThan(og))
    {
      og = current;
    }
  }
  return og;
}
