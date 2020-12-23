// Student-1-Name: Curren Taber
// Student-1-ID: 002325149
// Student-2-Name: Oliver Mathias
// Student-2-ID: 002289410
// Prof: Rene German
// Class: CPSC 350-1
// Date: 5-12-2020
// Assignment: 5

/*
This class contains the template BST class that holds the students anf aculty for the
StudentTable and FacultyTable classes
*/

#ifndef BST_H
#define BST_H

#include "TreeNode.h"
// #include <stdio.h>

//BST Header

template <class T>
class BST
{
  public:
    BST<T>(); //Default Constructor
    ~BST<T>(); //Destructor
    //virtual ~BST() for template class

    //Core functions
    void insert(int key, T value); //Inserts a node
    bool search(int key); //Returns true if the node is in the tree
    bool deleteNode(int key); //Deletes a node using a key

    //Helper functions
    bool isEmpty(); //Returns true if no nodes in the tree
    TreeNode<T>* getMin(); //Returns a pointer to a node with minimum key
    TreeNode<T>* getMax(); //Returns a pointer to a node with maximum key
    TreeNode<T>* getSuccessor(TreeNode<T>* d); //Returns a pointer to the successor of a node
    TreeNode<T>* getRoot(); //Returns a pointer to the root of the tree
    TreeNode<T>* getNode(int key); //Returns a pointer to a node given a key
    void printTree(TreeNode<T>* node, string direction); //Prints the tree either ascending or descending order
    void addKeysToArray(TreeNode<T>* node); //Adds the tree keys to the array to return
    // void serializeTree(TreeNode<T>* node, FILE* fp);
    void serialize(TreeNode<T>* node, ofstream& o); //serialize
    void deserialize(ifstream& i); //deserialize
    int* returnKeys(); //returns all the keys in a bst
    int getSize(); //gets size of bst

  private:
    TreeNode<T>* m_root; //Root node
    int m_size; //the size of tree
    int m_arrayCount; //size of the array
    int* m_keyArray; //the array of keys

};

#endif

//-----------------------------

//BST implementation

//Default constructor
template <class T>
BST<T>::BST()
{
  m_root = NULL;
  m_size = 0;
  m_arrayCount = 0;
}

//Destructor
template <class T>
BST<T>::~BST()
{
  while (!this->isEmpty())
  {
    this->deleteNode(this->getMax()->m_key);
  }
}

//Inserts a node
template <class T>
void BST<T>::insert(int key, T value)
{
  //Makes sure the node key isn't already in use
  if (!this->search(key))
  {
    //create our new node to store data
    TreeNode<T>* node = new TreeNode<T>(key, value);
    cout << "-INSERTING-" << endl;

    //this means we have an empty tree
    if (m_root == NULL)
    {
          cout << "+root made" << endl;
          m_root = node; //make the new node the root
    }

    else
    {
      //tree is not empty so we have to find the insertion spot
      TreeNode<T>* curr = m_root;
      TreeNode<T>* parent;

      while(true)
      {
        //find the insertion point
        parent = curr;

        //this means we go left
        if (key < curr->m_key)
        {
          curr = curr->m_left;
          //this means we've found the insertion point
          if(curr == NULL)
          {
            cout << "+left child made" << endl;
            parent->m_left = node;
            break;
          }
        }

        else
        {
          //go right
          curr = curr->m_right;

          if(curr == NULL)
          {
            cout <<"+right child made" << endl;
            parent->m_right = node;
            break;
          }
        }
      }
    }
    m_size++;
  }
  else
  {
    cout << "Cannot add a key that already exists in the tree" << endl;
  }
}

//Returns true if the node is in the tree
template <class T>
bool BST<T>::search(int key)
{
  if (isEmpty())
  {
    return false;
  }
  else
  {
    //tree is not empty
    TreeNode<T>* current = m_root;

    //looking for the key with an iterator
    while(current->m_key != key)
    {
      //we go left
      if (key < current->m_key)
      {
        current = current->m_left;
      }
      else
      {
        current = current->m_right;
      }
      if(current == NULL)
      {
        return false;
      }
    }
    return true;
  }
}

//Deletes a node using a key
template <class T>
bool BST<T>::deleteNode(int key)
{
  if(isEmpty())
  {
    return false;
  }
  else if(!search(key))
  {
    return false;
  }

  else // tree is not empty and the node's in there
  {
    TreeNode<T>* current = m_root;
    TreeNode<T>* parent = m_root;
    bool isLeft = true;

    //code to find node
    //and update pointers
    while(current->m_key != key)
    {
      parent = current;

      if (key < current->m_key)
      {
        isLeft = true;
        current = current->m_left;
      }

      else
      {
        isLeft = false;
        current = current->m_right;
      }

      if(current == NULL)
      {
        return false;
      }
     }

     //if we've made it here we found the node, set it to current, and set it's
     //parent to parent. Will proceed to delete

     //check if no children
     //if it's the only node i.e. the root, set all pointers to null
     if(current->m_left == NULL && current->m_right == NULL)
     {
       //Root node
       if (current == m_root)
       {
         m_root = NULL;
       }
       //External left child
       else if (isLeft)
       {
         parent->m_left = NULL;
       }
       //External right child
       else
       {
         parent->m_right = NULL;
       }
     }

     //d2
     //Current has one left child
     else if (current->m_right == NULL)
     {
       //Deleting the root
       if (current == m_root)
       {
         m_root = current->m_left;
       }
       //Deleting a left node
       else if(isLeft)
       {
         parent->m_left = current->m_left;
       }
       //Deleting a right node
       else
       {
         parent->m_right = current->m_left;
       }
     }

     //d1
     //Current has one right child
     else if (current->m_left == NULL)
     {
       //Deleting the root
       if(current == m_root)
       {
         m_root = current->m_right;
       }
       //Deleting a left node
       else if (isLeft)
       {
         parent->m_left = current->m_right;
       }
       //Deleting a right node
       else
       {
         parent->m_right = current->m_right;
       }
     }

     //the node has 2 kids
     else
     {
       //gets the node pointer to the node that will
       //take the deleted node's place
       TreeNode<T>* successor = getSuccessor(current);

       //if the node we want to replace is the root
       //just set the root equal to the successor
       if (current == m_root)
       {
         m_root = successor;
       }

       //if the node to remove is left of its parent, set
       //the parent's left pointer equal to the successor
       else if (isLeft)
       {
         parent->m_left = successor;
       }

       //if the node to remove is right of its parent, set
       //the parent's right pointer equal to the successor
       else
       {
         parent->m_right = successor;
       }

       successor->m_left = current->m_left;

       //
       current->m_left = NULL;
       current->m_right = NULL;
       delete current;
     }
     m_size--;
     return true;
   }
}

//Returns true if no nodes in the tree
template <class T>
bool BST<T>::isEmpty()
{
  return (m_root == NULL);
}

//Returns a pointer to a node with minimum key
template <class T>
TreeNode<T>* BST<T>::getMin()
{
  //start at the root
  TreeNode<T>* curr = m_root;

  //this means tree is empty;
  if (m_root == NULL)
  {
    return NULL;
  }

  while (curr->m_left != NULL)
  {
    curr = curr->m_left;
  }

  return curr; // returns tree node of max key
}

//Returns a pointer to a node with maximum key
template <class T>
TreeNode<T>* BST<T>::getMax()
{
  //start at the root
  TreeNode<T>* curr = m_root;

  //this means tree is empty;
  if (m_root == NULL)
  {
    return NULL;
  }

  while (curr->m_right != NULL)
  {
    curr = curr->m_right;
  }

  return curr; // returns tree node of max key
}

//Returns a pointer to the successor of a node
template <class T>
TreeNode<T>* BST<T>::getSuccessor(TreeNode<T>* d)
{
  //successor parent
  TreeNode<T>* sp = d;
  TreeNode<T>* successor = d;

  //go right once to make sure the null value reached later
  //is larger than key to change.
  TreeNode<T>* current = d->m_right;

  //after this loop, all the pointers
  //are in the right place for successor
  while(current != NULL)
  {
    sp = successor;
    successor = current;
    //go left all the way to make sure the current
    //value is the smallest number larger than the one we want to replace.
    current = current->m_left;
  }

  if(successor != d->m_right)
  {
    sp->m_left = successor->m_right;
    successor->m_right = d->m_right;
  }

  return successor;

}

//Returns a pointer to the root of the tree
template <class T>
TreeNode<T>* BST<T>::getRoot()
{
  return m_root;
}

//Returns a pointer to the root of the tree
template <class T>
TreeNode<T>* BST<T>::getNode(int key)
{
  if (isEmpty())
  {
    return NULL;
  }
  else
  {
    //tree is not empty
    TreeNode<T>* current = m_root;

    //looking for the key with an iterator
    while(current->m_key != key)
    {
      //we go left
      if (key < current->m_key)
      {
        current = current->m_left;
      }
      else
      {
        current = current->m_right;
      }
      if(current == NULL)
      {
        return current;
      }
    }
    return current;
  }
}

//Prints the tree either ascending or descending order
template <class T>
void BST<T>::printTree(TreeNode<T>* node, string direction)
{
  //should be node->m_key==NULL;?
  if (node==NULL)
  {
    return;
  }

  if (direction == "ascending")
  {
    printTree(node->m_left, "ascending");
    cout << node->m_key << endl;
    printTree(node->m_right, "ascending");
  }
  else if (direction == "descending")
  {
    printTree(node->m_right, "descending");
    cout << node->m_key << endl;
    printTree(node->m_left, "descending");
  }
  else
  {
    cout << "Invalid print direction" << endl;
  }
}

//Returns keys?
template <class T>
void BST<T>::addKeysToArray(TreeNode<T>* node)
{
  if (node == NULL)
  {
    return;
  }

  addKeysToArray(node->m_left);
  m_keyArray[m_arrayCount] = node->m_key;
  m_arrayCount++;
  addKeysToArray(node->m_right);
}

template <class T>
int* BST<T>::returnKeys()
{
  cout << "Let's return some keys." << endl;
  cout << "Size: " << m_size << endl;

  //Array of keys to return
  m_keyArray = new int[m_size];
  m_arrayCount = 0;

  addKeysToArray(m_root);

  return m_keyArray;
}


// template <class T>
// void BST<T>::serializeTree(TreeNode<T>* node, FILE* fp)
// {
//     //make a fundtion to searialize each data type, i.e. print out attibutes.
//     // If current node is NULL, store marker
//     if (node == NULL)
//     {
//       //fprintf(fp, "%d ", MARKER);
//         return;
//     }
//
//     // Else, store current node and recur for its children
//     fprintf(fp, "%d.%d\n", node->m_key, node->m_value);
//     serializeTree(node->m_left, fp);
//     serializeTree(node->m_right, fp);
// }

template <class T>
void BST<T>::serialize(TreeNode<T>* node, ofstream& o)
{
  if (node == NULL)
  {
    return;
  }
  serialize(node->m_left, o);
  o.write((char*)&node->m_key, sizeof(node->m_key));
  o.write((char*)&node->m_value, sizeof(node->m_value));
  serialize(node->m_right, o);
}

template <class T>
void BST<T>::deserialize(ifstream& i)
{
  // i.read((char*)m_root, sizeof(m_root));
  while (!i.eof())
  {
    TreeNode<T>* node = new TreeNode<T>();
    i.read((char*)&node->m_key, sizeof(node->m_key));
    i.read((char*)&node->m_value, sizeof(node->m_value));
    cout << "Got a node: " << endl;
    node->m_value.printInfo();
    if (node->m_key != -1)
    {
      insert(node->m_key, node->m_value);
    }
  }
}

template <class T>
int BST<T>::getSize()
{
  return m_size;
}
