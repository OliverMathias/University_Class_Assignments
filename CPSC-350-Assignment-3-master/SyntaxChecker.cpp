// Name: Oliver Mathias
// Student-ID: 002289410
// Prof: Rene German
// Class: CPSC 350-1
// Date: 3-28-2020
// Assignment: Syntax Checker

// implementatino file for main SyntaxChecker class.
// controls the logic for
// -getting path of file
// -checking if file exists
// -checking for errors

#include "SyntaxChecker.h"
#include "GenStack.h"
#include <stdlib.h>
using namespace std;

//syntax constructor
SyntaxChecker::SyntaxChecker()
{
  mFilename = "";
}
//syntax destructor
SyntaxChecker::~SyntaxChecker()
{

}

void SyntaxChecker::set_filename(string filename)
{
  //check if the filename exists
  ifstream ifile;
  ifile.open(filename);
  if(ifile)
    mFilename = filename;
}

//prompts user for target file name
void SyntaxChecker::get_target_filename()
{
  //while the filename does not exist, keep prompting user
  while (mFilename == "")
  {
    cout << "Please Enter Valid File Path: " << endl;
    string filename = "";
    cin >> filename;
    //check if the filename exists
    ifstream ifile;
    ifile.open(filename);
    if(ifile)
      mFilename = filename;
  }
}

//checks if a bracket is open
bool SyntaxChecker::is_open_bracket(char element)
{
  if (element =='{' || element =='(' || element =='[')
      return true;
  else
    return false;
}

//checks if a bracket is open
bool SyntaxChecker::is_closed_bracket(char element)
{
  if (element =='}' || element ==')' || element ==']')
      return true;
  else
    return false;
}

//main action of the program which checks if a file contains syntax errors
void SyntaxChecker::check_for_syntax_errors()
{
  cout << "Checking File: " << mFilename << endl;
  //builds a stack on the stack, ba dum tss
  GenStack<char> stacky(1);
  //opens a file and loops through each line
  ifstream file(mFilename);
  if (file.is_open()) {
      string line;
      int line_number= 1;
      while (getline(file, line)) {
        //checks each character in the line and sees if it is an open bracket or closed bracket
          for (int i=0; i < line.size(); ++i)
            {
            if ((is_closed_bracket(line[i]) || is_open_bracket(line[i])) && line[i-1] != '"')
              {
                //if bracket is open, push to stack
                if (is_open_bracket(line[i]))
                {
                  stacky.push(line[i]);
                }

                //if closed compare to top of stack and see if complement
                if (is_closed_bracket(line[i]))
                {
                  if (line[i] == ']' && stacky.peek() == '[')
                  {
                    stacky.pop();
                  }
                  else if (line[i] == '}' && stacky.peek() == '{')
                  {
                    stacky.pop();
                  }
                  else if (line[i] == ')' && stacky.peek() == '(')
                  {
                    stacky.pop();
                  }
                  //if they are not compliments, print the line and the correct complement
                  else
                  {
                    cout << "Incorrect Bracket on Line: " << line_number << endl;
                    cout <<  "Found: '" << line[i] << "' ";
                    //the case if the last bracket was an opening one with no close
                      if (stacky.peek() == '{')
                        cout << "Please use a '}'" << endl;
                      else if (stacky.peek() == '[')
                        cout << "Please use a ']'" << endl;
                      else if (stacky.peek() == '(')
                        cout << "Please use a ')'" << endl;

                    exit(10);
                  }
                }
              }
            }
            line_number++;
          }
        }
      file.close();
      //if we have reached the end of the file and require another syntax bracket
      if (!stacky.isEmpty())
      {
        if (stacky.peek() == '{')
          cout << "Reached end of file, expected }." << endl;
        else if (stacky.peek() == '[')
          cout << "Reached end of file, expected ]." << endl;
        else if (stacky.peek() == '(')
          cout << "Reached end of file, expected )." << endl;
        exit(10);
      }
  }
