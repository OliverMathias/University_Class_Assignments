/*
*
*
*/

import java.util.HashMap;
import java.util.Scanner;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.ArrayList;

public class DatabaseMaster {

private int x;

public static void main(String[] args){
//sets while loop value and creates hashmap
boolean keepGoing = true;
HashMap<Integer,AbstractAffiliate> dataBase = new HashMap<Integer, AbstractAffiliate>();
// creates a bunch of different kind of affiliates
AbstractAffiliate greg = new Assistant("greg",50,"33 maple st",8001234,1990,1123,"Finance", 50000,2,3);
AbstractAffiliate nart = new Associate("nart",20,"23 april st",8389482,2018,3153,"Music", 25000,8,24);
AbstractAffiliate oscar = new Full("oscar",44,"Panther Village apt 25",9112342,2005,2200,"Anthropology", 30000,3,15);
AbstractAffiliate marco = new FullTime("marco",35,"under jim doti's car",4444445,2013,2455,"Head of Departments and Such", "Dorsmouth Hall" ,42000);
AbstractAffiliate lukas = new PartTime("lukas",28,"the top of lastinger, parking spot 555",6565656,2015,2860,"Assistant to the Regional Manager","corn hall", 30000);
AbstractAffiliate shkort = new Undergrad("shkort",20,"glass hall room 211",1234556,2017,1123,"Business","Anthropology", "Junior",22000,25);
AbstractAffiliate lissp = new Graduate("lissp",26,"somewhere not too shabby in irvine",01237564,2018,1123,"Dance","Music", "1st year Grad Student",2, "nart simpson");

// adds the affiliates to the database
dataBase.put(0,greg);
dataBase.put(1,nart);
dataBase.put(2,oscar);
dataBase.put(3,marco);
dataBase.put(4,lukas);
dataBase.put(5,shkort);
dataBase.put(6,lissp);

// prints out a welcome message and begins the do while loop
System.out.println();
System.out.println("Hey There! \nWelcome to the Chapman Database, my name is Clippy. \nWhat can I help you with?");
do{
// offers the user choices of what to do
System.out.println();
System.out.println("1) Create an Affiliate Record \n2) Print all Affiliate Info Given the Entry Number \n3) List all Affiliates in Order of Seniority \n4) Delete a Record Given the Entry Number \n5) Exit");
// creates a scanner to read in the input from the user
Scanner kb = new Scanner(System.in);  // Reading from System.in
System.out.println();
System.out.println("Enter a number: ");
int choice = kb.nextInt();
System.out.println();
// if they choose to create an assistant it prompts them to fill in all the required info and then
// adds that affiliate to the hashmap
if (choice == 1){
  System.out.println("What kind of Affiliate entry do you want to Create?");
  System.out.println("1) Assistant \n2) Associate \n3) Full Professor \n4) Full Time Staff \n5) Part Time Staff \n6) Graduate Student \n7) Undergraduate Student");
  System.out.println();
  System.out.println("Enter a number: ");
  int subchoice1 = kb.nextInt();
  System.out.println();

  if (subchoice1 == 1){
    System.out.println("name:");
    String name = kb.next();
    System.out.println();
    System.out.println("age:");
    int age = kb.nextInt();
    //this next line cleans up the excess
    kb.nextLine();
    System.out.println();
    System.out.println("address:");
    String address;
    address = kb.nextLine();
    System.out.println();
    System.out.println("phone number:");
    Long phoneNumber = kb.nextLong();
    System.out.println();
    System.out.println("year they came to Chapman:");
    int yearTheyCameToChapman = kb.nextInt();
    System.out.println();

    //stuff for assistant

    System.out.println("faculty id:");
    int facultyId = kb.nextInt();
    System.out.println();
    System.out.println("department:");
    String department = kb.next();
    System.out.println();
    System.out.println("yearly salary:");
    int yearlySalary = kb.nextInt();
    System.out.println();
    System.out.println("number of papers:");
    int numberOfPapers = kb.nextInt();
    System.out.println();
    System.out.println("years until tenure:");
    int yearsUntilTenure = kb.nextInt();
    System.out.println();
    System.out.println("Ok! Your new entry has been added to the database.\nIt now holds the following entries (in no order).");
    System.out.println();
    AbstractAffiliate newEntry = new Assistant(name,age,address,phoneNumber,yearTheyCameToChapman, facultyId, department, yearlySalary, numberOfPapers, yearsUntilTenure);
    dataBase.put(dataBase.size(),newEntry);

    for (int x=0; x < dataBase.size(); x++){
      System.out.println(dataBase.get(x).print());
      System.out.println();
    }

  }
  // if they choose to create an Associate it prompts them to fill in all the required info and then
  // adds that affiliate to the hashmap
  if (subchoice1 == 2){
    System.out.println("name:");
    String name = kb.next();
    System.out.println();
    System.out.println("age:");
    int age = kb.nextInt();
    //this next line cleans up the excess
    kb.nextLine();
    System.out.println();
    System.out.println("address:");
    String address;
    address = kb.nextLine();
    System.out.println();
    System.out.println("phone number:");
    Long phoneNumber = kb.nextLong();
    System.out.println();
    System.out.println("year they came to Chapman:");
    int yearTheyCameToChapman = kb.nextInt();
    System.out.println();

    //stuff for Associate
    System.out.println("faculty id:");
    int facultyId = kb.nextInt();
    System.out.println();
    System.out.println("department:");
    String department = kb.next();
    System.out.println();
    System.out.println("yearly salary:");
    int yearlySalary = kb.nextInt();
    System.out.println();
    System.out.println("number of papers:");
    int numberOfPapers = kb.nextInt();
    System.out.println();
    System.out.println("years since tenure:");
    int yearsSinceTenure = kb.nextInt();
    System.out.println();
    System.out.println("Ok! Your new entry has been added to the database.\nIt now holds the following (in no order).");
    System.out.println();
    AbstractAffiliate newEntry = new Associate(name,age,address,phoneNumber,yearTheyCameToChapman, facultyId, department, yearlySalary, numberOfPapers, yearsSinceTenure);
    dataBase.put(dataBase.size(),newEntry);

    for (int x=0; x < dataBase.size(); x++){
      System.out.println(dataBase.get(x).print());
      System.out.println();
    }

  }
  // if they choose to create a Fulltime Professor it prompts them to fill in all the required info and then
  // adds that affiliate to the hashmap
  if (subchoice1 == 3){
    System.out.println("name:");
    String name = kb.next();
    System.out.println();
    System.out.println("age:");
    int age = kb.nextInt();
    //this next line cleans up the excess
    kb.nextLine();
    System.out.println();
    System.out.println("address:");
    String address;
    address = kb.nextLine();
    System.out.println();
    System.out.println("phone number:");
    Long phoneNumber = kb.nextLong();
    System.out.println();
    System.out.println("year they came to Chapman:");
    int yearTheyCameToChapman = kb.nextInt();
    System.out.println();

    //stuff for full Professor
    System.out.println("faculty id:");
    int facultyId = kb.nextInt();
    System.out.println();
    System.out.println("department:");
    String department = kb.next();
    System.out.println();
    System.out.println("yearly salary:");
    int yearlySalary = kb.nextInt();
    System.out.println();
    System.out.println("number of papers:");
    int numberOfPapers = kb.nextInt();
    System.out.println();
    System.out.println("years til retirement:");
    int yearsTilRetirement = kb.nextInt();
    System.out.println();
    System.out.println("Ok! Your new entry has been added to the database.\nIt now holds the following entries (in no order).");
    System.out.println();
    AbstractAffiliate newEntry = new Full(name,age,address,phoneNumber,yearTheyCameToChapman, facultyId, department, yearlySalary, numberOfPapers, yearsTilRetirement);
    dataBase.put(dataBase.size(),newEntry);

    for (int x=0; x < dataBase.size(); x++){
      System.out.println(dataBase.get(x).print());
      System.out.println();
    }

  }
  // if they choose to create a Full time staff it prompts them to fill in all the required info and then
  // adds that affiliate to the hashmap
  if (subchoice1 == 4){
    System.out.println("name:");
    String name = kb.next();
    System.out.println();
    System.out.println("age:");
    int age = kb.nextInt();
    //this next line cleans up the excess
    kb.nextLine();
    System.out.println();
    System.out.println("address:");
    String address;
    address = kb.nextLine();
    System.out.println();
    System.out.println("phone number:");
    Long phoneNumber = kb.nextLong();
    System.out.println();
    System.out.println("year they came to Chapman:");
    int yearTheyCameToChapman = kb.nextInt();
    System.out.println();

    //stuff for full time
    System.out.println("staff id:");
    int staffId = kb.nextInt();
    System.out.println();
    System.out.println("title:");
    String title = kb.next();
    System.out.println();
    System.out.println("building:");
    String building = kb.next();
    System.out.println();
    System.out.println("yearly salary:");
    int yearlySalary = kb.nextInt();
    System.out.println();
    System.out.println("Ok! Your new entry has been added to the database.\nIt now holds the following entries. (in no order).");
    System.out.println();
    AbstractAffiliate newEntry = new FullTime(name,age,address,phoneNumber,yearTheyCameToChapman, staffId, title, building, yearlySalary);
    dataBase.put(dataBase.size(),newEntry);

    for (int x=0; x < dataBase.size(); x++){
      System.out.println(dataBase.get(x).print());
      System.out.println();
    }

  }
  // if they choose to create a part time staff it prompts them to fill in all the required info and then
  // adds that affiliate to the hashmap
  if (subchoice1 == 5){
    System.out.println("name:");
    String name = kb.next();
    System.out.println();
    System.out.println("age:");
    int age = kb.nextInt();
    //this next line cleans up the excess
    kb.nextLine();
    System.out.println();
    System.out.println("address:");
    String address;
    address = kb.nextLine();
    System.out.println();
    System.out.println("phone number:");
    Long phoneNumber = kb.nextLong();
    System.out.println();
    System.out.println("year they came to Chapman:");
    int yearTheyCameToChapman = kb.nextInt();
    System.out.println();

    //stuff for part time
    System.out.println("staff id:");
    int staffId = kb.nextInt();
    System.out.println();
    System.out.println("title:");
    String title = kb.next();
    System.out.println();
    System.out.println("building:");
    String building = kb.next();
    System.out.println();
    System.out.println("hourly salary:");
    int hourlySalary = kb.nextInt();
    System.out.println();
    System.out.println("Ok! Your new entry has been added to the database.\nIt now holds the following entries. (in no order).");
    System.out.println();
    AbstractAffiliate newEntry = new PartTime(name,age,address,phoneNumber,yearTheyCameToChapman, staffId, title, building, hourlySalary);
    dataBase.put(dataBase.size(),newEntry);

    for (int x=0; x < dataBase.size(); x++){
      System.out.println(dataBase.get(x).print());
      System.out.println();
    }

  }
  // if they choose to create a Graduate student it prompts them to fill in all the required info and then
  // adds that affiliate to the hashmap
  if (subchoice1 == 6){
    System.out.println("name:");
    String name = kb.next();
    System.out.println();
    System.out.println("age:");
    int age = kb.nextInt();
    //this next line cleans up the excess
    kb.nextLine();
    System.out.println();
    System.out.println("address:");
    String address;
    address = kb.nextLine();
    System.out.println();
    System.out.println("phone number:");
    Long phoneNumber = kb.nextLong();
    System.out.println();
    System.out.println("year they came to Chapman:");
    int yearTheyCameToChapman = kb.nextInt();
    System.out.println();

    //stuff for grad student
    System.out.println("student id:");
    int studentId = kb.nextInt();
    System.out.println();
    System.out.println("major:");
    String major = kb.next();
    System.out.println();
    System.out.println("minor:");
    String minor = kb.next();
    System.out.println();
    System.out.println("class standing:");
    String classStanding = kb.next();
    System.out.println();
    System.out.println("number of papers published:");
    int numberOfPapersPublished = kb.nextInt();
    System.out.println();
    System.out.println("thesis advisor:");
    String thesisAdvisor = kb.next();
    System.out.println();
    System.out.println("Ok! Your new entry has been added to the database.\nIt now holds the following entries (in no order).");
    System.out.println();
    AbstractAffiliate newEntry = new Graduate(name,age,address,phoneNumber,yearTheyCameToChapman, studentId, major, minor, classStanding, numberOfPapersPublished, thesisAdvisor);
    dataBase.put(dataBase.size(),newEntry);

    for (int x=0; x < dataBase.size(); x++){
      System.out.println(dataBase.get(x).print());
      System.out.println();
    }

  }
  // if they choose to create an Undergraduate student it prompts them to fill in all the required info and then
  // adds that affiliate to the hashmap
  if (subchoice1 == 7){
    System.out.println("name:");
    String name = kb.next();
    System.out.println();
    System.out.println("age:");
    int age = kb.nextInt();
    //this next line cleans up the excess
    kb.nextLine();
    System.out.println();
    System.out.println("address:");
    String address;
    address = kb.nextLine();
    System.out.println();
    System.out.println("phone number:");
    Long phoneNumber = kb.nextLong();
    System.out.println();
    System.out.println("year they came to Chapman:");
    int yearTheyCameToChapman = kb.nextInt();
    System.out.println();

    //stuff for grad student
    System.out.println("student id:");
    int studentId = kb.nextInt();
    System.out.println();
    System.out.println("major:");
    String major = kb.next();
    System.out.println();
    System.out.println("minor:");
    String minor = kb.next();
    System.out.println();
    System.out.println("class standing:");
    String classStanding = kb.next();
    System.out.println();
    System.out.println("scholarship ammount:");
    int scholarshipAmmount = kb.nextInt();
    System.out.println();
    System.out.println("number of courses taken:");
    int numCoursesTaken = kb.nextInt();
    System.out.println();
    System.out.println("Ok! Your new entry has been added to the database.\nIt now holds the following entries. (in no order).");
    System.out.println();
    AbstractAffiliate newEntry = new Undergrad(name,age,address,phoneNumber,yearTheyCameToChapman, studentId, major, minor, classStanding, scholarshipAmmount, numCoursesTaken);
    dataBase.put(dataBase.size(),newEntry);

    for (int x=0; x < dataBase.size(); x++){
      System.out.println(dataBase.get(x).print());
      System.out.println();
    }

  }
}
// if they choose to pull data on an affiliate it prompts them for the key in the hashmap
// and then prints the info about that affiliate
if (choice == 2){
  System.out.println("Please enter the id number of the affiliate you want to pull data on.");
  System.out.println("HINT: if you haven't added any affiliates in this session yet, \nyour choices are 0 through 6.");
  System.out.println();
  System.out.println("Enter a number:");
  int affiliateKey = kb.nextInt();
  System.out.println();
  System.out.println(dataBase.get(affiliateKey).print());
}
// if they choose to sort all affiliates by Seniority it takes in all entries in the hashmap
// adds them to an arraylist and then uses the collection.sort, using the compareTo method to sort
// the arraylist and then prints it
if(choice == 3){
  System.out.println("All affiliates are listed from lowest Seniority to highest \nseniority from top to bottom.");
  System.out.println();
  ArrayList<AbstractAffiliate> list = new ArrayList<>();
  for (int x=0; x < dataBase.size(); x++){
    list.add(dataBase.get(x));
  }
  Collections.sort(list);
  for (int x=0; x < dataBase.size(); x++){
    System.out.println(list.get(x).print());
    System.out.println();
  }
}
// this prompts for the affiliate number they want to remove and then it uses .remove() to remove it from the hashmap
if(choice == 4){
  System.out.println("Please enter the id number of the affiliate you want to eliminate from the database.");
  System.out.println("HINT: if you haven't added any affiliates in this session yet, \nyour choices are 0 through 6.");
  System.out.println();
  System.out.println("Enter a number:");
  int affiliateKey = kb.nextInt();
  System.out.println();
  dataBase.remove(affiliateKey);
  System.out.println("Affiliate " + affiliateKey + " removed. The database now reads as follows." );
// prints the new database
  for (int x=0; x < dataBase.size(); x++){
    try {
    System.out.println(dataBase.get(x).print());
    System.out.println();
  }
  // nullpointerexception for if something goes wrong with the forloop
  catch(NullPointerException e) {
    System.out.println("well, something went wrong.");
    System.out.println("I'm pretty sure it's the size of the database \n creating a for loop error once someone is removed.");
  }

  }
}
// changes the keepGoing variable and exits the do while loop, quitting the program
if(choice == 5){
  System.out.println("Exiting Database Now");
  keepGoing = false;
}

// the end of the do-while loop
} while (keepGoing == true);

}
}
