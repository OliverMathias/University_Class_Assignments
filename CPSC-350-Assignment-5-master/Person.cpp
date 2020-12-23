// Student-1-Name: Curren Taber
// Student-1-ID: 002325149
// Student-2-Name: Oliver Mathias
// Student-2-ID: 002289410
// Prof: Rene German
// Class: CPSC 350-1
// Date: 5-12-2020
// Assignment: 5

/*
implementation of the person class, just abstracted so we can inherit it in both human types
in the assignment
*/

#include "Person.h"

//allows us to get person name
string Person::getName()
{
  return m_name;
}

//allows us to get their ID
int Person::getID()
{
  return m_ID;
}
