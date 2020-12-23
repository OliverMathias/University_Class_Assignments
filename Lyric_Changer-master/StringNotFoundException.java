/*
Oliver Mathias
2289410
mathias@chapman.edu
Stevens CPSC 231
In Class File & Exception Assignment
*/

class StringNotFoundException extends Exception
{
      // Parameterless Constructor
      public StringNotFoundException() {}

      // Constructor that accepts a message
      public StringNotFoundException(String message)
      {
         super(message);
      }
 }
