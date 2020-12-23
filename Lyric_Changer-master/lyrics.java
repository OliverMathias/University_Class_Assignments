/*
Oliver Mathias
2289410
mathias@chapman.edu
Stevens CPSC 231
In Class File & Exception Assignment
*/
import java.io.*;

public class lyrics{

/*
*@param wordToReplace
*@param wordReplacing
*@return gives us
*/
  private static void Replace(String wordToReplace, String wordReplacing){
    // setting count variables and try block
    int stringCount = 0;
    try {

   // setting up all input streams, readers, and writers for the files
    InputStream fis = new FileInputStream("plugwalk.txt");
    BufferedReader br = new BufferedReader(new InputStreamReader(fis));
    FileWriter fileWriter = new FileWriter("modified.txt");
    PrintWriter printWriter = new PrintWriter(fileWriter);

    // setting string variables
    String newLine;
    String newLine2;

    // uses a for loop to got through the file, passes each line and swaps lowercase and then
    // goes through a second time and swaps the uppercase pairs
    for (String line = br.readLine(); line != null; line = br.readLine()) {
       newLine = line.replace(wordToReplace.toLowerCase(), wordReplacing.toLowerCase());
       String capwordToReplace  = wordToReplace.substring(0,1).toUpperCase() + wordToReplace.substring(1);
       String capwordReplacing  = wordReplacing.substring(0,1).toUpperCase() + wordReplacing.substring(1);
       newLine2 = newLine.replace(capwordToReplace, capwordReplacing);
       // if after all itterations of the loop, there are no lower or upercase instances of the words, it spits
       // a custom exception of StringNotFoundException
       if (line.contains(wordToReplace.toLowerCase())| line.contains(capwordToReplace)){
         stringCount++;
       }
       // writes to modified.txt
       printWriter.println(newLine2);
    }
    // closes reader and writer and checks if strings are missing.
    br.close();
    printWriter.close();
    if (stringCount == 0){
      throw new StringNotFoundException();
    }
  }

   // various other exceptions
    catch(FileNotFoundException exception){
      System.out.println("The file was not found.");
      }
    catch(IOException exception){
      System.out.println(exception);
      }
    catch(StringNotFoundException exception){
      System.out.println("String you are looking to replace is not present.");
    }
  }
  //main body of the program
  public static void main(String[] args){
    String wordToReplace = args[0];
    String wordReplacing = args[1];
    Replace(wordToReplace, wordReplacing);
  }

}
