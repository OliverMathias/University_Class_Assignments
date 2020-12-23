// Student-1-Name: Curren Taber
// Student-1-ID: 002325149
// Student-2-Name: Oliver Mathias
// Student-2-ID: 002289410
// Prof: Rene German
// Class: CPSC 350-1
// Date: 5-12-2020
// Assignment: 5

/*
header for the student class
*/

#ifndef STUDENTTABLE_H
#define STUDENTTABLE_H

#include "Table.h"
#include "Student.h"

class StudentTable : public Table<Student>
{
  public:
    StudentTable(); //constructor
    ~StudentTable();// destructor

    void add(int key, Student value); //add student
    bool find(int key); //check if student is there
    Student* get(int key); //get student pointer
    bool remove(int key); //remove student
    void printTable(string direction); //print table in a direction
    void printStudentInfoFromID(int id); //print student from ID
    int* getIDArray(); //get id array
    int getTableSize(); //get table size

    Student* getStudentWithHighestGPA(); //student with highest gpa
    Student* getStudentWithLowestGPA(); //student with lowest GPA


  private:
    BST<Student>* m_studentTree; //student tree member var
};

#endif
