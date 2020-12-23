// Student-1-Name: Curren Taber
// Student-1-ID: 002325149
// Student-2-Name: Oliver Mathias
// Student-2-ID: 002289410
// Prof: Rene German
// Class: CPSC 350-1
// Date: 5-12-2020
// Assignment: 5

/*
this is the main class that contains pretty much all higher level functionality
it is the principle interaction point between the menu and both table's actions
*/

#include "TableDriver.h"
#include <iostream>

using namespace std;

//constructor
TableDriver::TableDriver()
{
  sTable = new StudentTable();
  fTable = new FacultyTable();
  sTableHistory = new GenStack<StudentTable>();
  fTableHistory = new GenStack<FacultyTable>();
}

//destructor
TableDriver::~TableDriver()
{
  delete sTable;
  delete fTable;
  delete sTableHistory;
  delete fTableHistory;
}

//prints cool message
void TableDriver::printWelcome()
{
  cout << endl << endl << endl << endl << endl;
  cout << "\t    _____________" << endl;
  cout << "\t   | \\    |    / |" << endl;
  cout << "\t   |   \\  |  /   |" << endl;
  cout << "\t   |_____\\|/_____|" << endl;
  cout << "\t   |     /|\\     |" << endl;
  cout << "\t   |   /  |  \\   |" << endl;
  cout << "\t   |_/____|____\\_|" << endl;
  cout << endl;
  cout << "    -------------------------------    " << endl;
  cout << "    Welcome to the Chapman Database    " << endl;
  cout << "    -------------------------------    " << endl;
  cout << endl;

  cout << "      Press [ENTER] to continue." << endl;
}

//prints page 1 of options
void TableDriver::printPage1()
{
  cout << "-------------------------------" << endl;
  cout << endl << "\tMENU:" << endl;
  cout << "\t[1] Print all students" << endl;
  cout << "\t[2] Print all faculty" << endl;
  cout << "\t[3] Print single student" << endl;
  cout << "\t[4] Print single faculty member" << endl << endl;
  cout << "\tPage 1   (N for next, P for prev)" << endl;
  cout << endl;
}

//prints page 2 of options
void TableDriver::printPage2()
{
  cout << "-------------------------------" << endl;
  cout << endl << "\tMENU:" << endl;
  cout << "\t[5] Print advisor of student" << endl;
  cout << "\t[6] Print all advisees of faculty member" << endl;
  cout << "\t[7] Add student" << endl;
  cout << "\t[8] Delete student" << endl << endl;
  cout << "\tPage 2   (N for next, P for prev)" << endl;
  cout << endl;
}

//prints page 3 of options
void TableDriver::printPage3()
{
  cout << "-------------------------------" << endl;
  cout << endl << "\tMENU:" << endl;
  cout << "\t[9]  Add faculty member" << endl;
  cout << "\t[10] Delete faculty member" << endl;
  cout << "\t[11] Edit advisor of student" << endl;
  cout << "\t[12] Remove an advisee of faculty member" << endl << endl;
  cout << "\tPage 3   (N for next, P for prev)" << endl;
  cout << endl;
}

//prints page 4 of options
void TableDriver::printPage4()
{
  cout << "-------------------------------" << endl;
  cout << endl << "\tMENU:" << endl;
  cout << "\t[13] Rollback" << endl;
  cout << "\t[14] Change Student Name" << endl;
  cout << "\t[15] Change Faculty Name" << endl;
  cout << "\t[16] Print Student With Highest GPA" << endl;
  cout << "\t[17] Print Student With Lowest GPA" << endl;
  cout << "\t[Q] Exit" << endl;
  cout << endl << endl;
  cout << "\tPage 4    (N for next, P for prev)" << endl;
  cout << endl;
}

//re-prints thhe options for each page
int TableDriver::cyclePage(int p, char action)
{
  if (p == 1 && action == 'P')
  {
    return 4;
  }
  else if (p == 4 && action == 'N')
  {
    return 1;
  }
  else if (action == 'P')
  {
    return p - 1;
  }
  else if (action == 'N')
  {
    return p + 1;
  }
}

//starts the simulation and takes in user menu choices
void TableDriver::start()
{
  string input = "";
  int currPage = 1;

  printWelcome();
  cin.ignore();
  cout << endl << endl << endl << endl << endl << endl;

  while (toupper(input[0]) != 'Q')
  {
    if (currPage == 1)
    {
      printPage1();
    }
    else if (currPage == 2)
    {
      printPage2();
    }
    else if (currPage == 3)
    {
      printPage3();
    }
    else if (currPage == 4)
    {
      printPage4();
    }

    cin >> input;

    if (toupper(input[0]) == 'N' || toupper(input[0]) == 'P')
    {
      currPage = cyclePage(currPage, toupper(input[0]));
    }


    //Print all students
    if (input == "1")
    {
      if (sTable->getTableSize() < 1)
      {
        cout << "-------------------------------" << endl;
        cout << "No students in the database." << endl;
      }
      else
      {
        cout << "-------------------------------" << endl;
        for (int i = 0; i < sTable->getTableSize(); ++i)
        {
          sTable->get(*(sTable->getIDArray() + i))->printInfo();
        }
        cout << "SCROLL UP FOR INFO^^^" << endl;
      }
    }

    //Print all faculty
    else if (input == "2")
    {
      if (fTable->getTableSize() < 1)
      {
        cout << "-------------------------------" << endl;
        cout << "No faculty in the database." << endl;
      }
      else
      {
        cout << "-------------------------------" << endl;
        for (int i = 0; i < fTable->getTableSize(); ++i)
        {
          fTable->get(*(fTable->getIDArray() + i))->printInfo();
        }
        cout << "SCROLL UP FOR INFO^^^" << endl;
      }
    }

    //Print a single student
    else if (input == "3")
    {
      int id = -1;
      cout << "What is your Student's ID?:" << endl;
      cin >> id;

      if (sTable->find(id))
      {
        cout << "-------------------------------" << endl;
        sTable->get(id)->printInfo();
        cout << "SCROLL UP FOR INFO^^^" << endl;
      }
      else
      {
        cout << "-------------------------------" << endl;
        cout << "Student doesn't exist." << endl;
      }
    }

    //Print a single faculty member
    else if (input == "4")
    {
      int id = -1;
      cout << "What is your Faculty Member's ID?:" << endl;
      cin >> id;

      if (fTable->find(id))
      {
        cout << "-------------------------------" << endl;
        fTable->get(id)->printInfo();
        cout << "SCROLL UP FOR INFO^^^" << endl;
      }
      else
      {
        cout << "-------------------------------" << endl;
        cout << "Faculty Member doesn't exist." << endl;
      }
    }

    //Print a student's faculty advisor
    else if (input == "5")
    {
      int id = -1;
      cout << "What is your Student's ID?:" << endl;
      cin >> id;
      //error checking already included in helper function!!
      printStudentsAdvisor(id);

    }

    //Print all of a faculty member's advisees
    else if (input == "6")
    {
      int id = -1;
      cout << "What is your Faculty Advisor's ID?:" << endl;
      cin >> id;
      if (fTable->find(id))
      {
        int* tempArray = fTable->getFacultyAdviseeArray(id);
        for (int i = 0; i<fTable->getFacultyNumAdvisees(id); i++)
        {
          cout << "-------------------------------" << endl;
          cout << "Advisee: " << i+1 << endl;
          sTable->get(tempArray[i])->printInfo();
        }
      }
      else
      {
        cout << "-------------------------------" << endl;
        cout << "Faculty Member not found!" << endl;
      }

    }

    //Add a new student
    else if (input == "7")
    {
      addStudent();
      //rollback commented out b/c we couldn't get it working in time.
      //addToFacultyHistory();
      //addToStudentHistory();
    }
    //Delete a student
    else if (input == "8")
    {
      int id = -1;
      cout << "What is the Student's ID to Delete?:" << endl;
      cin >> id;
      deleteStudentFromTableAndClean(id);
      //rollback commented out b/c we couldn't get it working in time.
      // addToFacultyHistory();
      // addToStudentHistory();
    }

    //Add a new faculty member
    else if (input == "9")
    {
      addFaculty();
      //rollback commented out b/c we couldn't get it working in time.
      // addToFacultyHistory();
      // addToStudentHistory();
    }

    //Delete a faculty member
    else if (input == "10")
    {
      int id = -1;
      cout << "What is the Faculty's ID to Delete?:" << endl;
      cin >> id;
      deleteFacultyFromTableAndClean(id);
      // rollback commented out b/c we couldn't get it working in time.
      // addToFacultyHistory();
      // addToStudentHistory();
    }
    //Change a student's advisor
    else if (input == "11")
    {
      int sid = -1;
      cout << "What is the Student's ID?:" << endl;
      cin >> sid;
      int aid = -1;
      cout << "What is the Advisor's ID?:" << endl;
      cin >> aid;
      changeStudentsAdvisor(sid, aid);
      //rollback commented out b/c we couldn't get it working in time.
      // addToFacultyHistory();
      // addToStudentHistory();
    }
    //Remove an advisee from a faculty member
    else if (input == "12")
    {
      int fid = -1;
      cout << "What is the Faculty Member's ID?:" << endl;
      cin >> fid;
      int sid = -1;
      cout << "What is the Advisee's ID to Remove?:" << endl;
      cin >> sid;
      removeFacultyAdvisee(fid, sid);
      //rollback commented out b/c we couldn't get it working in time.
      // addToFacultyHistory();
      // addToStudentHistory();
    }

    //Rollback
    else if (input == "13")
    {
      cout << "no way" << endl;
      // sTempTable = sTableHistory->pop();
      // fTempTable = fTableHistory->pop();
      // cout << "half way" << endl;
      //sTable = &sTempTable1;
      // sTempTable1 = sTempTable2;
      // sTempTable2 = sTempTable3;
      // sTempTable3 = sTempTable4;
      // sTempTable4 = sTempTable5;
      // sTempTable5 = sTempTableEmpty;

      //fTable = &fTempTable1;
      // fTempTable1 = fTempTable2;
      // fTempTable2 = fTempTable3;
      // fTempTable3 = fTempTable4;
      // fTempTable4 = fTempTable5;
      // fTempTable5 = fTempTableEmpty;
    }

    else if (input == "14")
    {
      //student change name
      cout << "Changing Student's Name" << endl;
      int sid = -1;
      cout << "What is the Student's ID?:" << endl;
      cin >> sid;
      string nn = "";
      cout << "What is the Student's New Name?:" << endl;
      cin >> nn;
      changeStudentName(sid, nn);
    }

    else if (input == "15")
    {
      //faculty change name
      cout << "Changing Faculty Member's Name" << endl;
      int sid = -1;
      cout << "What is the Faculty Member's ID?:" << endl;
      cin >> sid;
      string nn = "";
      cout << "What is the Faculty Member's New Name?:" << endl;
      cin >> nn;
      changeFacultyName(sid, nn);
    }

    else if (input == "16")
    {
      //print student with highest GPA
      cout << "Student with Highest GPA is..." << endl;
      printStudentWithHighestGPA();
    }

    else if (input == "17")
    {
      //print student with lowest GPA
      cout << "Student with Lowest GPA is..." << endl;
      printStudentWithLowestGPA();
    }

    //Exit
    else if (toupper(input[0]) == 'Q')
    {
      cout << "Goodbye!" << endl;
    }
    else if (toupper(input[0]) == 'N')
    {
      cout << "Next page toggled." << endl << endl;
    }
    else if (toupper(input[0]) == 'P')
    {
      cout << "Previous page toggled." << endl << endl;
    }

    else
    {
      cout << "Invalid input. Try again." << endl;
    }
  }
}

//print all the students in ascending ID order
void TableDriver::printStudentAscending()
{
  sTable->printTable("ascending");
}

//print all students in descending order
void TableDriver::printStudentDescending()
{
  sTable->printTable("descending");
}

//print all faculty in ascending order
void TableDriver::printFacultyAscending()
{
  fTable->printTable("ascending");
}

//print all faculty in ascending order
void TableDriver::printFacultyDescending()
{
  fTable->printTable("descending");
}

//add a student to the table
void TableDriver::addStudent()
{
  string name = "";
  int id = -1;
  int advisorID = -1;
  string level = "";
  string major = "";
  double gpa = -1.0;

  cout << "What is your Student's Name?: " << endl;
  cin >> name;
  cout << "What is your Student's ID?: " << endl;
  cin >> id;
  if (sTable->find(id))
  {
    cout << "Student Already Exists!" << endl;
    return;
  }
  cout << "What is your Student's Advisor's ID?: " << endl;
  cin >> advisorID;
  if (fTable->find(advisorID)==false)
  {
    cout << "Faculty Member Not Found." << endl;
    cout << "Please add them Below." << endl;
    cout << " " << endl;
    addFaculty(advisorID, id);
  }
  cout << "What is your Student's Grade Level?: " << endl;
  cin >> level;
  cout << "What is your Student's Major?: " << endl;
  cin >> major;
  cout << "What is your Student's GPA?: " << endl;
  cin >> gpa;

  //int sid, int aid, string n, string lev, string maj, double g
  Student* tempStudent = new Student(id,advisorID,name,level,major,gpa);

  sTable->add(id, *tempStudent);
}

//overload add a student if we already know the advisor ID and student ID
void TableDriver::addStudent(int studentID, int facultyID)
{
  string name = "";
  string level = "";
  string major = "";
  double gpa = -1.0;

  cout << "Adding Student with ID: "<< studentID << " With Advisor: " << facultyID << endl;
  cout << "What is your Student's Name?: " << endl;
  cin >> name;
  cout << "What is your Student's Grade Level?: " << endl;
  cin >> level;
  cout << "What is your Student's Major?: " << endl;
  cin >> major;
  cout << "What is your Student's GPA?: " << endl;
  cin >> gpa;

  //int sid, int aid, string n, string lev, string maj, double g
  Student* tempStudent = new Student(studentID,facultyID,name,level,major,gpa);

  sTable->add(studentID, *tempStudent);
  cout << "Returning to Add Faculty: " << facultyID << endl;
}

//add faculty to the table
void TableDriver::addFaculty()
{
  string name = "";
  int id = 0;
  int numberOfAdvisees = 0;
  string level = "";
  string department = "";

  int adviseeID = 0;

  cout << "What is your Faculty Member's Name?: " << endl;
  cin >> name;
  cout << "What is your Faculty Member's ID?: " << endl;
  cin >> id;
  if (fTable->find(id))
  {
    cout << "Faculty Member Already Exists!" << endl;
    return;
  }
  cout << "What is your Faculty Member's Teaching Level?: " << endl;
  cin >> level;
  cout << "What is your Faculty Member's Department?: " << endl;
  cin >> department;

  Faculty* tempFaculty = new Faculty(id,name,level,department);

  cout << "How many Advisee's Does This Faculty Member Have?: " << endl;
  cin >> numberOfAdvisees;
  for (int i=0; i < numberOfAdvisees; i++)
  {
    cout << "Enter Advisee " << i+1 <<"'s ID: " << endl;
    cin >> adviseeID;

    //if the student doesnt exist force them to make that student.
    if (sTable->find(adviseeID)==false)
    {
      cout << "Student Advisee Does not Exist!" << endl;
      cout << "Please add them Below." << endl;
      cout << " " << endl;
      addStudent(adviseeID, id);
      tempFaculty->addAdvisee(adviseeID);
    }

    else
    {

      //if there was another faculty id there, go to that guy and change remove student from advisee list.
      int oldAdvisorID = sTable->get(adviseeID)->getAdvisorID();
      if (fTable->find(oldAdvisorID))
      {
        Faculty* oldAdvisor = fTable->get(oldAdvisorID);
        oldAdvisor->removeAdvisee(adviseeID);
      }
      //if exist, change student's advisor to new faculty
      if (tempFaculty->checkIfAdviseeExists(adviseeID) == false)
      {
        tempFaculty->addAdvisee(adviseeID);
      }
      else
      {
        cout << "Student is already an Advisee of this Faculty Member!" << endl;
      }
    }
  //end of for loop
    }
  cout << "over add" << endl;
  fTable->add(id, *tempFaculty);
  cout << "added" << endl;
}

//overload add faculty if we already know their ID and one advisee ID
void TableDriver::addFaculty(int facultyID, int studentID)
{
  string name = "";
  string level = "";
  string department = "";
  int numberOfAdvisees = 0;
  int adviseeID = 0;

  cout << "Adding Faculty with ID: "<< facultyID << " With Advisee: " << studentID << endl;
  cout << "What is your Faculty Member's Name?: " << endl;
  cin >> name;
  cout << "What is your Faculty Member's Teaching Level?: " << endl;
  cin >> level;
  cout << "What is your Faculty Member's Department?: " << endl;
  cin >> department;

  Faculty* tempFaculty = new Faculty(facultyID,name,level,department);
  tempFaculty->addAdvisee(studentID);

  cout << "How many Other Advisee's Does This Faculty Member Have?: " << endl;
  cin >> numberOfAdvisees;
  for (int i=0; i < numberOfAdvisees; i++)
  {
    cout << "Enter Advisee " << i+1 <<"'s ID: " << endl;
    cin >> adviseeID;
    if (tempFaculty->checkIfAdviseeExists(adviseeID) == false)
    {
      addStudent(adviseeID, facultyID);
      tempFaculty->addAdvisee(adviseeID);
    }
    else
    {
      cout << "Student is already an Advisee of this Faculty Member!" << endl;
    }
  }

  fTable->add(facultyID, *tempFaculty);

  cout << "Returning to Add Student: " << studentID << endl;
}

//print a student's info from their ID
void TableDriver::printStudentInfoFromID(int id)
{
  if (sTable->find(id))
  {
    sTable->printStudentInfoFromID(id);
  }
  else
  {
    cout << "This Student Doesn't Exist." << endl;
  }
}

//print some faculty info from an ID
void TableDriver::printFacultyInfoFromID(int id)
{
  if (fTable->find(id))
  {
    fTable->printFacultyInfoFromID(id);
  }
  else
  {
    cout << "This Faculty Doesn't Exist." << endl;
  }
}

//delete stident
void TableDriver::deleteStudentFromID(int id)
{
  if (sTable->find(id))
  {
    sTable->remove(id);
    cout << "Student with ID: " << id << " Removed." << endl;
  }
  else
  {
    cout << "Student not found, Cannot be deleted!" << endl;
  }

}
//delete Faculty
void TableDriver::deleteFacultyFromID(int id)
{
  if (fTable->find(id))
  {
    fTable->remove(id);
    cout << "Faculty with ID: " << id << " Removed." << endl;
  }
  else
  {
    cout << "Faculty Member not found, Cannot be deleted!" << endl;
  }

}

//change student's advisor given new ids
void TableDriver::changeStudentsAdvisor(int id, int aid)
{
  if (sTable->find(id))
  {
    Student* temp = sTable->get(id);
    temp->setAdvisorID(aid);
    cout << "Student with ID: " << id << " Advisor Changed To: " << aid << endl;
  }
  else
  {
    cout << "Student not found, Cannot be deleted!" << endl;
  }

}
//remove a faculty member's advisee given the both of their ids
void TableDriver::removeFacultyAdvisee(int fid, int sid)
{
  if (fTable->find(fid))
  {
    Faculty* temp = fTable->get(fid);
    temp->removeAdvisee(sid);
    cout << "Student Advisee with ID: " << sid << " Removed From Advisor: " << fid << endl;
  }
  else
  {
    cout << "Faculty Member not found, Cannot be deleted!" << endl;
  }
}

//given student id print info of their advisor
void TableDriver::printStudentsAdvisor(int sid)
{
  if (sTable->find(sid))
  {
    Student* temp = sTable->get(sid);
    int aid = temp->getAdvisorID();
    if (fTable->find(aid))
    {
      fTable->printFacultyInfoFromID(aid);
    }
    else
    {
      cout << "Faculty Member not found!" << endl;
    }
  }

  else
  {
    cout << "Student not found!" << endl;
  }
}

//attempted saving current student table to history
void TableDriver::addToStudentHistory()
{
  //sTempTable = *sTable;
  //sTempTable5 = NULL;
  // sTempTable5 = sTempTable4;
  // sTempTable4 = sTempTable3;
  // sTempTable3 = sTempTable2;
  // sTempTable2 = sTempTable1;
  // sTempTable1 = *sTable;
  // cout << "saved Students" << endl;
  //sTableHistory->push(*sTable);
}

//attempted saving current faculty table to history
void TableDriver::addToFacultyHistory()
{
  //fTempTable = *fTable;
  // fTempTable5 = fTempTable4;
  // fTempTable4 = fTempTable3;
  // fTempTable3 = fTempTable2;
  // fTempTable2 = fTempTable1;
  fTempTable1 = *fTable;
  cout << "saved fac" << endl;
  //fTableHistory->push(*fTable);
}

//delete student from table and clean any newly broken references
void TableDriver::deleteStudentFromTableAndClean(int id)
{
  if (sTable->find(id))
  {
    //get the id of their advisor, then remove them from their advisor's lists
    Student* tempStudent = sTable->get(id);
    int advisorID = tempStudent->getAdvisorID();
    cout << "1" << endl;
    if (advisorID != -1)
    {
      cout << "2" << endl;
      Faculty* tempFaculty = fTable->get(advisorID);
      tempFaculty->removeAdvisee(id);
      cout << "3" << endl;
    }
    //if student exists, delete them from table
    sTable->remove(id);
    cout << "4" << endl;
  }
  else
  {
    cout << "Student Not Found." << endl;
  }
}

//del;ete faculty from table and clean any newly broken references
void TableDriver::deleteFacultyFromTableAndClean(int id)
{
  //get the list of advisees
  Faculty* tempFaculty = fTable->get(id);
  int* adviseesList = tempFaculty->returnAdviseeArray();
  int numAdvisees = tempFaculty->getNumAdvisees();
  //delete faculty
  deleteFacultyFromID(id);
  //remove advisor from each student ID in that
  for (int i = 0; i < numAdvisees; i++)
  {
      Student* tempStudent = sTable->get(adviseesList[i]);
      tempStudent->setAdvisorID(-1);
  }
}

//BONUS: Change a student's name
void TableDriver::changeStudentName(int id, string nn)
{
  if (sTable->find(id))
  {
    Student* temp = sTable->get(id);
    temp->setName(nn);
    cout << "Student with ID: " << id << " Name Changed To: " << nn << endl;
  }
  else
  {
    cout << "Student not found, Cannot be Renamed!" << endl;
  }
}

//change a faculty's name
void TableDriver::changeFacultyName(int id, string nn)
{
  if (fTable->find(id))
  {
    Faculty* temp = fTable->get(id);
    temp->setName(nn);
    cout << "Faculty with ID: " << id << " Name Changed To: " << nn << endl;
  }
  else
  {
    cout << "Faculty not found, Cannot be Renamed!" << endl;
  }
}

//print student with highest GPA
void TableDriver::printStudentWithHighestGPA()
{
  if (sTable->getTableSize() == 0)
  {
    cout << "Table Empty!" << endl;
  }

  else
  {
    Student* temp = sTable->getStudentWithHighestGPA();
    temp->printInfo();
  }

}

//print student with lowest GPA
void TableDriver::printStudentWithLowestGPA()
{
  if (sTable->getTableSize() == 0)
  {
    cout << "Table Empty!" << endl;
  }

  else
  {
    Student* temp = sTable->getStudentWithLowestGPA();
    temp->printInfo();
  }
}
