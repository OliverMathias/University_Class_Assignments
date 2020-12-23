//Oliver Mathias
//2289410
//CPSC-350-01
//Assignment 1

//imports
#include <iostream>
#include <fstream>
#include <cmath>
#include <string>

//so we don't have to use std:: for everything
using namespace std;

//Takes in: Filename
//Returns: the number of lines in file
int count_lines_in_file(string filename)
{
  int sum = 0;
  string myText;
  ifstream MyReadFile(filename);

  //while loop to increment the count for each line
  while (getline (MyReadFile, myText))
  {
    sum += 1;
  }
  return sum;
}

//Takes in: Filename
//Returns: the number of characters in the whole file
int count_number_of_letters_in_file(string filename)
{
  int sum = 0;
  string myText;
  ifstream MyReadFile(filename);

  //while loop to append the length of each file to a sum that will be returned
  while (getline (MyReadFile, myText))
  {
    sum += myText.length();
  }
  return sum;
}

//Takes in: Filename, the mean line length, number of lines
//Returns: the variance of all lengths in the file
double get_variance(string filename, double mean, int number_of_lines)
{
  double sum_of_squared_differences = 0.0;
  double squared_difference;
  string myText;
  ifstream MyReadFile(filename);

  //while loop through and sum the squared differences
  while (getline (MyReadFile, myText))
  {
    squared_difference = pow((double(myText.length())-mean),2);
    sum_of_squared_differences += squared_difference;
  }
  //return the sum of squared differences / num of lines
  return sum_of_squared_differences/number_of_lines;
}

//Takes in: Filename, a pointer to each count variable
//Returns: the counts for each single and bigram nucleoties
void count_totals_for_all_types(string filename ,int* a_count, int* c_count, int* t_count, int* g_count, int* aa_count, int* ac_count, int* at_count, int* ag_count, int* ca_count, int* cc_count, int* ct_count, int* cg_count, int* ta_count, int* tc_count, int* tt_count, int* tg_count, int* ga_count, int* gc_count, int* gt_count, int* gg_count, int* bigrams_in_file)
{
  string myText;
  string sub_text;
  ifstream MyReadFile(filename);

  while (getline (MyReadFile, myText))
  {
    //loop through the line and increment the counts for single nucleotides
    for (int i=0;i<myText.length(); ++i)
    {

      if (tolower(myText[i]) == 'a') *a_count += 1;
      else if (tolower(myText[i]) == 'c') *c_count += 1;
      else if (tolower(myText[i]) == 't') *t_count += 1;
      else if (tolower(myText[i]) == 'g') *g_count += 1;

    }
    //for the bigam counting loops
    //check if length is even, if so stop at end
    if (myText.length() % 2 == 0)
    {
      //loops through each pair index of string and uses if stmts to count bigrams
      for (int i=1; i < myText.length(); i+=2)
      {

        *bigrams_in_file += 1;

        if (tolower(myText[i-1]) == 'a' && tolower(myText[i]) == 'a') *aa_count += 1;
        else if (tolower(myText[i-1]) == 'a' && tolower(myText[i]) == 'c') *ac_count += 1;
        else if (tolower(myText[i-1]) == 'a' && tolower(myText[i]) == 't') *at_count += 1;
        else if (tolower(myText[i-1]) == 'a' && tolower(myText[i]) == 'g') *ag_count += 1;

        else if (tolower(myText[i-1]) == 'c' && tolower(myText[i]) == 'a') *ca_count += 1;
        else if (tolower(myText[i-1]) == 'c' && tolower(myText[i]) == 'c') *cc_count += 1;
        else if (tolower(myText[i-1]) == 'c' && tolower(myText[i]) == 't') *ct_count += 1;
        else if (tolower(myText[i-1]) == 'c' && tolower(myText[i]) == 'g') *cg_count += 1;

        else if (tolower(myText[i-1]) == 't' && tolower(myText[i]) == 'a') *ta_count += 1;
        else if (tolower(myText[i-1]) == 't' && tolower(myText[i]) == 'c') *tc_count += 1;
        else if (tolower(myText[i-1]) == 't' && tolower(myText[i]) == 't') *tt_count += 1;
        else if (tolower(myText[i-1]) == 't' && tolower(myText[i]) == 'g') *tg_count += 1;

        else if (tolower(myText[i-1]) == 'g' && tolower(myText[i]) == 'a') *ga_count += 1;
        else if (tolower(myText[i-1]) == 'g' && tolower(myText[i]) == 'c') *gc_count += 1;
        else if (tolower(myText[i-1]) == 'g' && tolower(myText[i]) == 't') *gt_count += 1;
        else if (tolower(myText[i-1]) == 'g' && tolower(myText[i]) == 'g') *gg_count += 1;

      }
    }
    //if length is odd, end 1 char before the end of the string b/c that one is not a bigram.
    else
    {
      //loops through each pair index of string and uses if stmts to count bigrams
      for (int i=1; i < myText.length()-1; i+=2)
      {

        *bigrams_in_file += 1;

        if (tolower(myText[i-1]) == 'a' && tolower(myText[i]) == 'a') *aa_count += 1;
        else if (tolower(myText[i-1]) == 'a' && tolower(myText[i]) == 'c') *ac_count += 1;
        else if (tolower(myText[i-1]) == 'a' && tolower(myText[i]) == 't') *at_count += 1;
        else if (tolower(myText[i-1]) == 'a' && tolower(myText[i]) == 'g') *ag_count += 1;

        else if (tolower(myText[i-1]) == 'c' && tolower(myText[i]) == 'a') *ca_count += 1;
        else if (tolower(myText[i-1]) == 'c' && tolower(myText[i]) == 'c') *cc_count += 1;
        else if (tolower(myText[i-1]) == 'c' && tolower(myText[i]) == 't') *ct_count += 1;
        else if (tolower(myText[i-1]) == 'c' && tolower(myText[i]) == 'g') *cg_count += 1;

        else if (tolower(myText[i-1]) == 't' && tolower(myText[i]) == 'a') *ta_count += 1;
        else if (tolower(myText[i-1]) == 't' && tolower(myText[i]) == 'c') *tc_count += 1;
        else if (tolower(myText[i-1]) == 't' && tolower(myText[i]) == 't') *tt_count += 1;
        else if (tolower(myText[i-1]) == 't' && tolower(myText[i]) == 'g') *tg_count += 1;

        else if (tolower(myText[i-1]) == 'g' && tolower(myText[i]) == 'a') *ga_count += 1;
        else if (tolower(myText[i-1]) == 'g' && tolower(myText[i]) == 'c') *gc_count += 1;
        else if (tolower(myText[i-1]) == 'g' && tolower(myText[i]) == 't') *gt_count += 1;
        else if (tolower(myText[i-1]) == 'g' && tolower(myText[i]) == 'g') *gg_count += 1;
      }
    }
  }
}

//generate a random letter based on the ptobabilities of single nucleotides appearing in the OG_file
//Takes in: nucleotide probabilities
//Returns: either A, C, T, G
string return_letter_on_distribution(double a_probability, double c_probability, double t_probability, double g_probability)
{
  double random_number = ((double) rand() / (RAND_MAX));

  if (random_number <= a_probability) return "A";
  else if ((a_probability < random_number) && (random_number < a_probability + c_probability)) return "C";
  else if (a_probability+c_probability < random_number && random_number <= a_probability+c_probability+t_probability) return "T";
  else if ((a_probability+c_probability+t_probability) < random_number) return "G";

}

//Takes in: main function loop count, Standard dev, mean line length
//Returns: the line length to make the new string
int generate_string_length(int count, double stdev, double mean)
{
  double a = ((double) rand() / (RAND_MAX));
  double b = ((double) rand() / (RAND_MAX));

  double c = sqrt(-2 * log(a)) * cos(2*M_PI*b);

  int d = stdev*c + mean;
  if (count % 2 == 0) return ceil(d);
  else return floor(d);
}


//Takes in: Filename from arguments
//Returns: 0 if all goes well, creates olivermathias.out file
int main(int argc, char** argv)
{
  //initializing all variables needed
  bool continue_loop = true;
  string break_letter = "";
  string filename;
  int lines_in_file;
  int letters_in_file;
  int bigrams_in_file;
  double mean_line_length;
  double variance;
  double stdev;

  int a_count;
  int c_count;
  int t_count;
  int g_count;

  double a_probability;
  double c_probability;
  double t_probability;
  double g_probability;

  int aa_count;
  int ac_count;
  int at_count;
  int ag_count;

  int ca_count;
  int cc_count;
  int ct_count;
  int cg_count;

  int ta_count;
  int tc_count;
  int tt_count;
  int tg_count;

  int ga_count;
  int gc_count;
  int gt_count;
  int gg_count;

  if (argc > 1)
  {
    filename = argv[1];
    //main while loop:

    //create file with header
    //write instead of append so it is not repeated every loop
    ofstream myfile;
    myfile.open ("olivermathias.out");

    myfile << "Name: Oliver Mathias"<< endl;
    myfile << "ID: O2289410"<< endl;
    myfile << "Assignment: Assignment 1 DNA Analysis"<< endl;
    myfile << "Class: CPSC-350-01"<< endl;

    myfile << ""<< endl;

    myfile.close();

    while (continue_loop)
    {
        //calling the analysis functions and assigning values to be used in main
        lines_in_file = count_lines_in_file(filename);
        letters_in_file = count_number_of_letters_in_file(filename);
        mean_line_length = (double)letters_in_file/(double)lines_in_file;
        variance = get_variance(filename, mean_line_length, lines_in_file);
        stdev = sqrt(variance);

        if (lines_in_file < 1)
        {
        cout<< "File not Found or is Empty, Check Path and Retry... " << endl;
        break;

        }

        //opening the file to append data for n analysis loops
        ofstream myfile;
        myfile.open ("olivermathias.out", ofstream::out | ofstream::app);

        //basic stats from the file that was analyzed
        myfile << "Name of File Analyzed: " << filename <<endl;
        myfile << "Lines in File: " << lines_in_file<< endl;
        myfile << "Letters in File: " << letters_in_file<< endl;
        myfile << "Mean Length of Lines: " << mean_line_length<< endl;
        myfile << "Length Variance: " << variance<< endl;
        myfile << "Standard Deviation of Length: " << stdev<< endl;

        myfile << ""<< endl;

        count_totals_for_all_types(filename, &a_count, &c_count, &t_count, &g_count, &aa_count, &ac_count, &at_count, &ag_count, &ca_count, &cc_count, &ct_count, &cg_count, &ta_count, &tc_count, &tt_count, &tg_count, &ga_count, &gc_count, &gt_count, &gg_count, &bigrams_in_file);

        //finding probabilities of each nucleotide
        a_probability = (double)a_count/letters_in_file;
        c_probability = (double)c_count/letters_in_file;
        t_probability = (double)t_count/letters_in_file;
        g_probability = (double)g_count/letters_in_file;


        //Next 30 Lines are Writing out Probabilities to the file
        myfile << "Pobabilities of Each Genome Occuring:  "<< endl;

        myfile << "Pob. of A's: " << a_probability<< endl;
        myfile << "Pob. of C's: " << c_probability<< endl;
        myfile << "Pob. of T's: " << t_probability<< endl;
        myfile << "Pob. of G's: " << g_probability<< endl;
        myfile << ""<< endl;

        myfile << "Pobabilities of Each Bigram Occuring:  "<< endl;

        myfile << "Pob. of AA's: " << (double)aa_count/bigrams_in_file<< endl;
        myfile << "Pob. of AC's: " << (double)ac_count/bigrams_in_file<< endl;
        myfile << "Pob. of AT's: " << (double)at_count/bigrams_in_file<< endl;
        myfile << "Pob. of AG's: " << (double)ag_count/bigrams_in_file<< endl;

        myfile << "Pob. of CA's: " << (double)ca_count/bigrams_in_file<< endl;
        myfile << "Pob. of CC's: " << (double)cc_count/bigrams_in_file<< endl;
        myfile << "Pob. of CT's: " << (double)ct_count/bigrams_in_file<< endl;
        myfile << "Pob. of CG's: " << (double)cg_count/bigrams_in_file<< endl;

        myfile << "Pob. of TA's: " << (double)ta_count/bigrams_in_file<< endl;
        myfile << "Pob. of TC's: " << (double)tc_count/bigrams_in_file<< endl;
        myfile << "Pob. of TT's: " << (double)tt_count/bigrams_in_file<< endl;
        myfile << "Pob. of TG's: " << (double)tg_count/bigrams_in_file<< endl;

        myfile << "Pob. of GA's: " << (double)ga_count/bigrams_in_file<< endl;
        myfile << "Pob. of GC's: " << (double)gc_count/bigrams_in_file<< endl;
        myfile << "Pob. of GT's: " << (double)gt_count/bigrams_in_file<< endl;
        myfile << "Pob. of GG's: " << (double)gg_count/bigrams_in_file<< endl;

        myfile << "" << endl;
        myfile << "Random DNA w/ Same Statistics: " << endl;

        for (int i = 0; i < 1000; ++i)
        {
          //generate length, pass in i to round up or down depending
          int d = generate_string_length(i, stdev, mean_line_length);
          string dna_line = "";

          for (int j = 0; j < d; ++j)
          {
            dna_line += return_letter_on_distribution(a_probability, c_probability, t_probability, g_probability);
          }
          myfile << dna_line << endl;
        }

        //append buffer and close file
        myfile << "" << endl;
        myfile.close();

        //end of loop to ask if the user wants to repeat the process with a new file
        cout << "Analysis Completed, Process another File? (y/n): "; // continue line
        cin >> break_letter; // Get user input from the keyboard
        if (break_letter=="y")
        {
          cout << "Please Enter the Full Path or Name of Another File to Analyze: ";
          cin >> filename;
        }
        //single line else, sets the continue var to false
        else continue_loop = false;
      }
    }

    //catch if they didn't include a file name
    else
    {
      cout << "Please Enter a File Name to Analyze Next time. " <<endl;
    }
    return 0;
  }
