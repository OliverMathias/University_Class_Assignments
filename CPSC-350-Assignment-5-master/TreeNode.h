// Student-1-Name: Curren Taber
// Student-1-ID: 002325149
// Student-2-Name: Oliver Mathias
// Student-2-ID: 002289410
// Prof: Rene German
// Class: CPSC 350-1
// Date: 5-12-2020
// Assignment: 5

/*
template tree node class, allows for storing any data and has two pointers
*/


#ifndef TREENODE_H
#define TREENODE_H

#include<iostream>
#include<fstream>
using namespace std;

//Header for TreeNode

template <class T>
class TreeNode
{
  public:
    TreeNode(); //Default Constructor
    TreeNode(int key, T v); //Overloaded Constructor
    ~TreeNode(); //Destructor

    int m_key; //Key
    T m_value; //Value
    TreeNode<T>* m_left; //Left child
    TreeNode<T>* m_right; //Right child

};

#endif

//TreeNode Implementation

//Default Constructor
template <class T>
TreeNode<T>::TreeNode()
{
  m_key = 0;
  m_left = NULL;
  m_right = NULL;
}

//Overloaded Constructor
template <class T>
TreeNode<T>::TreeNode(int k, T v)
{
  m_key = k;
  m_value = v;
  m_left = NULL;
  m_right = NULL;
}

//Destructor
template <class T>
TreeNode<T>::~TreeNode()
{
  delete m_left;
  delete m_right;
}
