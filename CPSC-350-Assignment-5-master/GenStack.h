// Student-1-Name: Curren Taber
// Student-1-ID: 002325149
// Student-2-Name: Oliver Mathias
// Student-2-ID: 002289410
// Prof: Rene German
// Class: CPSC 350-1
// Date: 5-12-2020
// Assignment: 5

/*
genstack template class that allows us to build student and faculty based stakcs for later
on when trying to do rollback
*/

#ifndef GENSTACK_H
#define GENSTACK_H

#include <iostream>
using namespace std;

//GenStack header

template <class T>
class GenStack
{
  public:
    GenStack(); //default constructor
    GenStack(int maxSize); //overloaded constructor
    ~GenStack(); //destructor

    //core functions
    void push(T data); //insert
    T pop(); //remove

    //helper functions
    bool isFull(); //check if stack is full
    bool isEmpty(); //check if it is empty
    T peek(); //peek at the top element


    int m_maxSize; //max size of myStack
    int m_top; //variable to keep track of
    T* m_array; //size declared at runntime
};

#endif

//-----------------------------

//GenStack implementation

//default constructor
template <class T>
GenStack<T>::GenStack()
{
  m_array = new T[128];
  m_maxSize = 128;
  m_top = -1;
}

//overloaded constructor
template <class T>
GenStack<T>::GenStack(int maxSize)
{
  m_array = new T[maxSize];
  m_maxSize = maxSize;
  m_top = -1;
}

//destructor
template <class T>
GenStack<T>::~GenStack()
{
  delete m_array;
}

//check if stack is full
template <class T>
bool GenStack<T>::isFull()
{
  return (m_top == m_maxSize - 1);
}

//check if stack is empty
template <class T>
bool GenStack<T>::isEmpty()
{
  return (m_top == -1);
}

//push onto the stack
template <class T>
void GenStack<T>::push(T data)
{
  if (!this->isFull())
  {
    m_array[++m_top] = data;
  }
  //Shift older data back
  else
  {
    for (int i = 0; i < m_maxSize - 1; ++i)
    {
      m_array[i] = m_array[i + 1];
    }
    m_array[m_top] = data;
  }
}

//pop off the last member of the stack
template <class T>
T GenStack<T>::pop()
{
  cout << "pop entered" << endl;
  if (!this->isEmpty())
  {
    cout << "0.5" << endl;
    return m_array[m_top--]; //post decrement returns, then decrements top
    //doesn't actually remove the value
    cout << "1" << endl;
  }
  cout << "2" << endl;
}

//peek at the last member of the stack
template <class T>
T GenStack<T>::peek()
{
  //Check if isEmpty before proceeding to remove
  return m_array[m_top];
}
