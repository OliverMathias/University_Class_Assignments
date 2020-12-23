// Student-1-Name: Curren Taber
// Student-1-ID: 002325149
// Student-2-Name: Oliver Mathias
// Student-2-ID: 002289410
// Prof: Rene German
// Class: CPSC 350-1
// Date: 5-12-2020
// Assignment: 5

/*
virtual template table class that lets both student and Faculty
tables inherit the same methods and overlapping vars
*/


#ifndef TABLE_H
#define TABLE_H

#include "BST.h"

template<class T>
class Table
{
  public:
    Table() {};//Constructor
    virtual ~Table() {}; //Destructor

    virtual void add(int key, T value) = 0; //virt. add
    virtual bool find(int key) = 0; //virt. find
    virtual T* get(int key) = 0; //virt. get
    virtual bool remove(int key) = 0; //virt. remove
    virtual void printTable(string direction) = 0; //virt. print table
    virtual int* getIDArray() = 0; //virt. get ID array
    virtual int getTableSize() = 0; //virt get table size

};
#endif
