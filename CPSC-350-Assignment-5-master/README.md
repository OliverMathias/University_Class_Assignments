# CPSC-350-Assignment-5

## 1. IDENTIFYING INFO
- Course Number and Section: CPSC 350-01
- Assignment 5

Student 1
- Full Name: Curren Taber
- Student ID: 002325149
- Chapman Email: ctaber@chapman.edu

Student 2
- Full Name: Oliver Mathias
- Student ID: 002289410
- Chapman Email: mathias@chapman.edu

## 2. SOURCE FILES
- README.md
- main.cpp
- DoublyLinkedList.h
- BST.h
- Faculty.cpp
- Faculty.h
- FacultyTable.cpp
- FacultyTable.h
- GenStack.h
- TreeNode.h
- ListNode.h
- Makefile
- Person.cpp
- Person.h
- Student.cpp
- Student.h
- StudentTable.cpp
- StudentTable.h
- Table.h
- TableDriver.h
- TableDriver.cpp
- StudentTable
- FacultyTable
- tree.txt


## 3. DESCRIPTION
This assignment is meant to be an exercise in storing and databasing
the students and faculty of Chapman and how they interact with each other.
This database holds information about student's names, IDs, majors, advisors, and GPA.
For the Advisors it holds any advisees, name, department, level, etc.

This allows for us to create, delete and edit advisors and students and their relationships to each other.

- How to Run:
  - `cd` into the directory containing source files
  - Type `make all` into your command line
  - Type `./assignment5.out filename` into your command line
  - Follow the menu prompts

- Important Notes:
  - Student without Advisees Have an Advisor Value Set to -1
  - 4 BONUS methods that allows for editing names and printing the Highest and Lowest GPAs
  - No input file functionality available
  - No rollback functionality available

## 4. REFERENCES
- https://www.eecs.umich.edu/courses/eecs380/HANDOUTS/cppBinaryFileIO-2.html
- https://www.includehelp.com/code-snippets/cpp-program-to-write-and-read-an-object-in-from-a-binary-file.aspx
- https://stackoverflow.com/questions/2046829/write-and-read-object-of-class-into-and-from-binary-file
- https://www.geeksforgeeks.org/readwrite-class-objects-fromto-file-c/
- https://stackoverflow.com/questions/30151952/how-to-store-all-the-data-of-bst-into-an-array-list/30153046
- https://www.tutorialspoint.com/cplusplus/cpp_return_arrays_from_functions.htm
