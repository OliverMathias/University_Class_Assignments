// Name: Oliver Mathias
// Student-ID: 002289410
// Prof: Rene German
// Class: CPSC 350-1
// Date: 3-28-2020
// Assignment: Syntax Checker

// Header file for the main class of SyntaxChecker

#include <fstream>
#include <string>
#include <iostream>
using namespace std;

class SyntaxChecker
{
  public:
    //constructor
    SyntaxChecker();
    //destructor
    ~SyntaxChecker();

    //prompts user for path
    void get_target_filename();
    //checks file for errors
    void check_for_syntax_errors();
    //bool to check if bracket is open
    bool is_open_bracket(char element);
    //bool to check if bracket is closed
    bool is_closed_bracket(char element);
    //set target filename
    void set_filename(string filename);

  private:
    string mFilename;
};
