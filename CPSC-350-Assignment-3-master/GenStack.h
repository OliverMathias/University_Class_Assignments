// Name: Oliver Mathias
// Student-ID: 002289410
// Prof: Rene German
// Class: CPSC 350-1
// Date: 3-28-2020
// Assignment: Syntax Checker

// This file contains code for the 'stack' and
// has been modified into a template class for use with any datatype.

#include <iostream>
#include <stdexcept>
using namespace std;

template <class T>
class GenStack
{
  public:
    GenStack(); //default constructor
    GenStack(int maxSize);//overload constructor if we want to pass in a size
    ~GenStack(); //destructor

    //functions
    void push(T data); //push a Tacter onto the stack
    T pop(); //just returns the top element, and remove it.
    void print();

    //helper functions
    bool isFull(); //check if its full
    bool isEmpty(); //check if its empty
    T peek(); //returns value of top element

    //makes the stack bigger if we
    //try to add one more element than the current size
    void copy_and_extend();

    //variables
    int mSize; //max size of my stack
    int top; //variable to keep track of index reprisenting the top of our stack

    T *myArray; // declaring a pointer that will be initialized to a place in memory at run time.
                  //from this we can find any element bc arrays are contiguous

};

template <class T>
//default constructor
GenStack<T>:: GenStack()
{
  //init array to heap b/c we allocate this memory dynamically
  myArray = new T[128];
  mSize = 128;
  top = -1;

}

template <class T>
//overload constructor
GenStack<T>:: GenStack(int maxSize)
{
  //init array to heap b/c we allocate this memory dynamically
  myArray = new T[maxSize];
  mSize = maxSize;
  top = -1;

}

template <class T>
// deletes it (cleans up after we're done.)
GenStack<T>::~GenStack()
{
  delete myArray;
}

template <class T>
//prints all the elements in the stack
void GenStack<T>::print()
{
  cout << "" << endl;
  cout << "From Bottom to Top" << endl;
  // prints from bottom to top
  for (int i=0; i< mSize-1; i++)
  {
    cout << myArray[i] << endl;
    top--;
  }
  cout << "" << endl;
}

template <class T>
//extends the stack to hold one more element that it already does.
void GenStack<T>::copy_and_extend()
{
  T temp_array[mSize + 1];

  for (int i=0; i< mSize; i++)
  {
    temp_array[i] = myArray[i];
  }

  *myArray = *temp_array;
  mSize++;
}

template <class T>
//pushes an element onto the stack
void GenStack<T>::push(T data)
{
  //check if full before inserting
  //increment the index where we're at, or the "top" and settng it equal to the data
  if (!isFull()) myArray[++top] = data;
  else
  {
    //expand the size of the array by 1, the top element now beind empty
    copy_and_extend();
    myArray[++top] = data;
  }
}

template <class T>
//pops an element off of the stack
T GenStack<T>::pop()
{
  //check if emmpty before proceeding

  //return myArray value of the current top, then decrement it after returning to set a new top
  if (!isEmpty()) return myArray[top--];
  //throw an exception when empty and trying to pop
  else throw invalid_argument( "Stack is Empty" );
}

template <class T>
//allows you to peek the top of the stack
T GenStack<T>::peek()
{
  //just returns it but doesn't change the top value or "remove it"
  if (!isEmpty()) return myArray[top];
}

template <class T>
//checks if stack is full
bool GenStack<T>::isFull()
{
  return (top==mSize-1);
}

template <class T>
//checks if stack is empty
bool GenStack<T>::isEmpty()
{
  return (top == -1);
}
