// Student-1-Name: Curren Taber
// Student-1-ID: 002325149
// Student-2-Name: Oliver Mathias
// Student-2-ID: 002289410
// Prof: Rene German
// Class: CPSC 350-1
// Date: 5-12-2020
// Assignment: 5

/*
List node template class. Contains data, and two pointers for doubly linked list
*/

#ifndef LISTNODE_H
#define LISTNODE_H

#include <iostream>
using namespace std;

//ListNode header

template <class T>
class ListNode
{
  public:
    T m_data; //data in node
    ListNode<T>* m_next; //pointer for next
    ListNode<T>* m_prev; // prev pointer

    ListNode(); //Default constructor
    ListNode(T d); //Overloaded constructor
    ~ListNode(); //Destructor
};

#endif

//-----------------------------

//ListNode implementation

//Default constructor
template <class T>
ListNode<T>:: ListNode()
{
  m_next = NULL;
  m_prev = NULL;
}

//Overloaded constructor
template <class T>
ListNode<T>:: ListNode(T d)
{
  m_data = d;
  m_next = NULL;
  m_prev = NULL;
}

//Destructor
template <class T>
ListNode<T>::~ListNode()
{
  delete m_next;
  delete m_prev;
}
