// Student-1-Name: Curren Taber
// Student-1-ID: 002325149
// Student-2-Name: Oliver Mathias
// Student-2-ID: 002289410
// Prof: Rene German
// Class: CPSC 350-1
// Date: 5-12-2020
// Assignment: 5

/*
Faculty table header file
*/


#ifndef FACULTYTABLE_H
#define FACULTYTABLE_H

#include "Table.h"
#include "Faculty.h"

class FacultyTable : public Table<Faculty>
{
  public:
    FacultyTable(); //constructor
    ~FacultyTable(); //Destructor

    void add(int key, Faculty value); // add faculty member
    bool find(int key); //check if id exists in faculty
    Faculty* get(int key); //return faculty from ID
    bool remove(int key); //remove faculty with id
    void printTable(string direction); //print table in a direction
    void printFacultyInfoFromID(int id); //print info from id
    int* getIDArray(); //get array of ids
    int getTableSize(); //get the table size
    int* getFacultyAdviseeArray(int id); //get the array of adviseese from certain member
    int getFacultyNumAdvisees(int id); //get faculty number of advisees

  private:
    BST<Faculty>* m_facultyTree; //bst var that holds faculty
};

#endif
