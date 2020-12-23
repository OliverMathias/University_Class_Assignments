// Name: Oliver Mathias
// Student-ID: 002289410
// Prof: Rene German
// Class: CPSC 350-1
// Date: 3-28-2020
// Assignment: Syntax Checker

// This is the main function of the program.
//It prompts the user for the target files path as input
//Then scans the file, and prints out the error if any delimeter is missing.
//if no error is caught, the code will not break and will print out the all clear message.

#include "SyntaxChecker.h"
#include <iostream>
using namespace std;

int main(int argc, char** argv)
{

  //create a new delim object
  SyntaxChecker* checker = new SyntaxChecker();
  //set filename from command line
  checker->set_filename(argv[1]);
  //propt user for file name/path
  checker->get_target_filename();
  //check the file for delim errors
  checker->check_for_syntax_errors();
  //if this line is reached, no errors exist
  cout << "File Contains No Syntax. Errors." << endl;
  //clean up
  delete checker;

  return 0;
}
