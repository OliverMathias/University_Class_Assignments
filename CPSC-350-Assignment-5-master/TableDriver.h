// Student-1-Name: Curren Taber
// Student-1-ID: 002325149
// Student-2-Name: Oliver Mathias
// Student-2-ID: 002289410
// Prof: Rene German
// Class: CPSC 350-1
// Date: 5-12-2020
// Assignment: 5

/*
header for table driver class
*/


#ifndef TABLEDRIVER_H
#define TABLEDRIVER_H

#include "StudentTable.h"
#include "FacultyTable.h"
#include "GenStack.h"

class TableDriver
{
  public:

    //constructor and destructor
    TableDriver();
    ~TableDriver();

    // print pages
    void printWelcome();
    void printPage1();
    void printPage2();
    void printPage3();
    void printPage4();
    //change pages
    int cyclePage(int p, char action);

    //start full simulation
    void start();

    //print students and faculty ascending and descending
    void printStudentAscending();
    void printStudentDescending();
    void printFacultyAscending();
    void printFacultyDescending();

    //add faculty and students
    void addStudent();
    void addFaculty();

    //add student faculty overload
    void addStudent(int studentID, int facultyID);
    void addFaculty(int facultytID, int studentID);

    //print student and faculty from ID
    void printStudentInfoFromID(int id);
    void printFacultyInfoFromID(int id);

    //delete student and faculty from id
    void deleteStudentFromID(int id);
    void deleteFacultyFromID(int id);

    //delete student faculty and clean newly broken references
    void deleteStudentFromTableAndClean(int id);
    void deleteFacultyFromTableAndClean(int id);

    //change advisor
    void changeStudentsAdvisor(int sid, int aid);
    void removeFacultyAdvisee(int fid, int sid);

    //print student advisor
    void printStudentsAdvisor(int sid);

    //add to student or faculty history
    void addToStudentHistory();
    void addToFacultyHistory();

    //change student and faculty names
    void changeStudentName(int id, string nn);
    void changeFacultyName(int id, string nn);

    //print highest and lowest gpa
    void printStudentWithHighestGPA();
    void printStudentWithLowestGPA();

  private:
    //student table pointer
    StudentTable* sTable;
    FacultyTable* fTable;

    //genstack
    GenStack<StudentTable>* sTableHistory;
    GenStack<FacultyTable>* fTableHistory;

    //perminent tables for failed rollback attempt
    StudentTable sTempTable1;
    FacultyTable fTempTable1;
    StudentTable sTempTable2;
    FacultyTable fTempTable2;
    StudentTable sTempTable3;
    FacultyTable fTempTable3;
    StudentTable sTempTable4;
    FacultyTable fTempTable4;
    StudentTable sTempTable5;
    FacultyTable fTempTable5;

    //temp tables for faculty and student
    StudentTable sTempTableEmpty;
    FacultyTable fTempTableEmpty;

};

#endif
