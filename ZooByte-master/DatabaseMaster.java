/*
* this is the main class which creates the functionality of the program
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
HashMap<Integer,AbstractAnimal> dataBase = new HashMap<Integer, AbstractAnimal>();
// creates a bunch of different kind of Animals

//String name, int age, String habitat, String animalClass, int weight, int avgLifespan, int gestationPeriod, String nocturnal, int furLength, int numberOfOffspring, int percentageOfFat, String topSpeed

AbstractAnimal greg = new Manatee("greg",50,"florida swamps","sirenia",1990,50,12,"https://www.youtube.com/watch?v=DlJy7HQMgSI",false,0,3, 23, 15);
AbstractAnimal nart = new Fire_Belly_Newt("nart",3,"ploynesian jungle","amphibian",1,4,"https://www.youtube.com/watch?v=WpM1m0ycd-I", 250, 1, true, "bugs", 5, true);
AbstractAnimal oscar = new Bear("oscar",4,"black forest","mammal",1200,35,200,"https://www.youtube.com/watch?v=PJXOkal6roA",false, 6,3,9,80);
AbstractAnimal marco = new Puffin("marco",7,"iceland","aves",2,20,"https://www.youtube.com/watch?v=zoHD2GxcBMw","white", "black & white", false, 4000, true, "underground" );
AbstractAnimal lukas = new Perigrine_Falcon("lucas",5,"south america","aves",2,13,"https://www.youtube.com/watch?v=r7lglchYNew","brown & speckled", "black & white", false, 15000, 240, 2);
AbstractAnimal lissp = new Galapagos_Iguana("lissp",1,"galapagos", "reptile", 10,60,"https://www.youtube.com/watch?v=tO_9zm9tsCs", 3,3,true, "seaweed", 98, true);

// adds the Animals to the database
dataBase.put(0,greg);
dataBase.put(1,nart);
dataBase.put(2,oscar);
dataBase.put(3,marco);
dataBase.put(4,lukas);
dataBase.put(6,lissp);

// prints out a welcome message and begins the do while loop
System.out.println();
System.out.println("Hey There! \nWelcome to the ZooByte Zoo, my name is Clippy. \nWhat can I help you with?");
do{
// offers the user choices of what to do
System.out.println();
System.out.println("1) Create an Animal Record \n2) Print all Animal Info Given the Entry Number \n3) List all Animals in Order of Age \n4) Delete a Record Given the Entry Number \n5) Exit");
// creates a scanner to read in the input from the user
Scanner kb = new Scanner(System.in);  // Reading from System.in
System.out.println();
System.out.println("Enter a number: ");
int choice = kb.nextInt();
System.out.println();
// if they choose to create an Manatee it prompts them to fill in all the required info and then
// adds that Animal to the hashmap
if (choice == 1){
  System.out.println("What kind of Animal entry do you want to Create?");
  System.out.println("1) Manatee \n2) Capybara \n3) Bear \n4) Puffin \n5) Perigrine Falcon \n6) Galapagos_Iguana \n7) Chinese Fire Belly Newt");
  System.out.println();
  System.out.println("Enter a number: ");
  int subchoice1 = kb.nextInt();
  System.out.println();

  if (subchoice1 == 1){
    System.out.println("name:");
    String name = kb.next();
    System.out.println();
    System.out.println("age (years):");
    int age = kb.nextInt();
    //this next line cleans up the excess
    kb.nextLine();
    System.out.println();
    System.out.println("habitat:");
    String habitat;
    habitat = kb.nextLine();
    System.out.println();
    System.out.println("animal class:");
    String animalClass = kb.next();
    System.out.println();
    System.out.println("weight (lbs):");
    int weight = kb.nextInt();
    System.out.println();

    //stuff for Manatee

    System.out.println("gestation period (months):");
    int gestationPeriod = kb.nextInt();
    System.out.println();
    System.out.println("nocturnal (true or false):");
    boolean nocturnal = kb.nextBoolean();
    System.out.println();
    System.out.println("fur length (inches):");
    int furLength = kb.nextInt();
    System.out.println();
    System.out.println("number of offspring:");
    int numberOfOffspring = kb.nextInt();
    System.out.println();
    System.out.println("average lifespan (years):");
    int avgLifespan = kb.nextInt();
    System.out.println();
    System.out.println("percentage of fat:");
    int percentageOfFat = kb.nextInt();
    System.out.println();
    System.out.println("link to video");
    String linkToVideo = kb.next();
    System.out.println();
    System.out.println("top speed (mph):");
    int topSpeed = kb.nextInt();
    System.out.println();
    System.out.println("Ok! Your new entry has been added to the database.\nIt now holds the following entries (in no order).");
    System.out.println();
    AbstractAnimal newEntry = new Manatee(name,age,habitat, animalClass, weight,avgLifespan, gestationPeriod,linkToVideo, nocturnal, furLength, numberOfOffspring, percentageOfFat, topSpeed);
    dataBase.put(dataBase.size(),newEntry);

    for (int x=0; x < dataBase.size(); x++){
      System.out.println(dataBase.get(x).print());
      System.out.println();
    }

  }
  // if they choose to create an Capybara it prompts them to fill in all the required info and then
  // adds that Animal to the hashmap
  if (subchoice1 == 2){
    System.out.println("name:");
    String name = kb.next();
    System.out.println();
    System.out.println("age (years):");
    int age = kb.nextInt();
    //this next line cleans up the excess
    kb.nextLine();
    System.out.println();
    System.out.println("habitat:");
    String habitat;
    habitat = kb.nextLine();
    System.out.println();
    System.out.println("animal class:");
    String animalClass = kb.next();
    System.out.println();
    System.out.println("weight (lbs):");
    int weight = kb.nextInt();
    System.out.println();
    System.out.println("average lifespan (years):");
    int avgLifespan = kb.nextInt();
    System.out.println();

    //stuff for Capybara
    System.out.println("gestation period:");
    int gestationPeriod = kb.nextInt();
    System.out.println();
    System.out.println("nocturnal (true or false):");
    boolean nocturnal = kb.nextBoolean();
    System.out.println();
    System.out.println("fur length (inches):");
    int furLength = kb.nextInt();
    System.out.println();
    System.out.println("link to video:");
    String linkToVideo = kb.next();
    System.out.println();
    System.out.println("number of offspring:");
    int numberOfOffspring = kb.nextInt();
    System.out.println();
    System.out.println("average herd size:");
    int avgHerdSize = kb.nextInt();
    System.out.println();
    System.out.println("Ok! Your new entry has been added to the database.\nIt now holds the following (in no order).");
    System.out.println();
    AbstractAnimal newEntry = new Capybara(name,age,habitat,animalClass,weight,avgLifespan, gestationPeriod, linkToVideo, nocturnal, furLength, numberOfOffspring, avgHerdSize);
    dataBase.put(dataBase.size(),newEntry);

    for (int x=0; x < dataBase.size(); x++){
      System.out.println(dataBase.get(x).print());
      System.out.println();
    }

  }
  // if they choose to create a Puffin Professor it prompts them to fill in all the required info and then
  // adds that Animal to the hashmap
  if (subchoice1 == 3){
    System.out.println("name:");
    String name = kb.next();
    System.out.println();
    System.out.println("age (years):");
    int age = kb.nextInt();
    //this next line cleans up the excess
    kb.nextLine();
    System.out.println();
    System.out.println("habitat:");
    String habitat;
    habitat = kb.nextLine();
    System.out.println();
    System.out.println("animal class:");
    String animalClass = kb.next();
    System.out.println();
    System.out.println("weight (lbs):");
    int weight = kb.nextInt();
    System.out.println();
    System.out.println("average lifespan (years):");
    int avgLifespan = kb.nextInt();
    System.out.println();

    //stuff for Bear
    System.out.println("gestation period:");
    int gestationPeriod = kb.nextInt();
    System.out.println();
    System.out.println("nocturnal (true or false):");
    boolean nocturnal = kb.nextBoolean();
    System.out.println();
    System.out.println("fur length (inches):");
    int furLength = kb.nextInt();
    System.out.println();
    System.out.println("link to video:");
    String linkToVideo = kb.next();
    System.out.println();
    System.out.println("number of offspring:");
    int numberOfOffspring = kb.nextInt();
    System.out.println();
    System.out.println("average herd size:");
    int avgHerdSize = kb.nextInt();
    System.out.println();
    System.out.println("claw length (inches):");
    int clawLength = kb.nextInt();
    System.out.println();
    System.out.println("roar volume (decibels):");
    int roarDecibels = kb.nextInt();
    System.out.println();
    System.out.println("Ok! Your new entry has been added to the database.\nIt now holds the following entries (in no order).");
    System.out.println();
    AbstractAnimal newEntry = new Bear(name, age, habitat, animalClass, weight, avgLifespan, gestationPeriod, linkToVideo, nocturnal, furLength, numberOfOffspring, clawLength, roarDecibels);
    dataBase.put(dataBase.size(),newEntry);

    for (int x=0; x < dataBase.size(); x++){
      System.out.println(dataBase.get(x).print());
      System.out.println();
    }

  }
  // if they choose to create a Bear time Bird it prompts them to fill in all the required info and then
  // adds that Animal to the hashmap
  if (subchoice1 == 4){
    System.out.println("name:");
    String name = kb.next();
    System.out.println();
    System.out.println("age (years):");
    int age = kb.nextInt();
    //this next line cleans up the excess
    kb.nextLine();
    System.out.println();
    System.out.println("habitat:");
    String habitat;
    habitat = kb.nextLine();
    System.out.println();
    System.out.println("animal class:");
    String animalClass = kb.next();
    System.out.println();
    System.out.println("weight (lbs):");
    int weight = kb.nextInt();
    System.out.println();
    System.out.println("average lifespan (years):");
    int avgLifespan = kb.nextInt();
    System.out.println();

    //stuff for Bear time
    System.out.println("egg color:");
    String eggColor = kb.next();
    System.out.println();
    System.out.println("plumage color:");
    String plumageColor= kb.next();
    System.out.println();
    System.out.println("migration distance (miles):");
    int migrationDistance = kb.nextInt();
    System.out.println();
    System.out.println("mate for life (true or false):");
    boolean mateForLife = kb.nextBoolean();
    System.out.println();
    System.out.println("flightless (true or false):");
    boolean flightless = kb.nextBoolean();
    System.out.println();
    System.out.println("nest location:");
    String nestLocation = kb.next();
    System.out.println();
    System.out.println("link to video");
    String linkToVideo = kb.next();
    System.out.println();

    System.out.println("Ok! Your new entry has been added to the database.\nIt now holds the following entries. (in no order).");
    System.out.println();
    AbstractAnimal newEntry = new Puffin(name, age, habitat,animalClass, weight,avgLifespan,linkToVideo, eggColor, plumageColor, flightless, migrationDistance, mateForLife, nestLocation);
    dataBase.put(dataBase.size(),newEntry);

    for (int x=0; x < dataBase.size(); x++){
      System.out.println(dataBase.get(x).print());
      System.out.println();
    }

  }
  // if they choose to create a part time Bird it prompts them to fill in all the required info and then
  // adds that Animal to the hashmap
  if (subchoice1 == 5){
    System.out.println("name:");
    String name = kb.next();
    System.out.println();
    System.out.println("age (years):");
    int age = kb.nextInt();
    //this next line cleans up the excess
    kb.nextLine();
    System.out.println();
    System.out.println("habitat:");
    String habitat;
    habitat = kb.nextLine();
    System.out.println();
    System.out.println("animal class:");
    String animalClass = kb.next();
    System.out.println();
    System.out.println("weight (lbs):");
    int weight = kb.nextInt();
    System.out.println();
    System.out.println("average lifespan (years):");
    int avgLifespan = kb.nextInt();
    System.out.println();
    System.out.println("link to video");
    String linkToVideo = kb.next();
    System.out.println();

    //stuff for part time
    System.out.println("egg color:");
    String eggColor = kb.next();
    System.out.println();
    System.out.println("plumageColor:");
    String plumageColor= kb.next();
    System.out.println();
    System.out.println("migration distance (miles):");
    int migrationDistance = kb.nextInt();
    System.out.println();
    System.out.println("top speed (mph):");
    int topSpeed = kb.nextInt();
    System.out.println();
    System.out.println("flightless (true or false):");
    boolean flightless = kb.nextBoolean();
    System.out.println();
    System.out.println("clutch size:");
    int clutchSize = kb.nextInt();
    System.out.println();
    System.out.println("Ok! Your new entry has been added to the database.\nIt now holds the following entries. (in no order).");
    System.out.println();
    AbstractAnimal newEntry = new Perigrine_Falcon(name, age, habitat, animalClass, weight,avgLifespan,linkToVideo, eggColor, plumageColor, flightless, migrationDistance, topSpeed, clutchSize);
    dataBase.put(dataBase.size(),newEntry);

    for (int x=0; x < dataBase.size(); x++){
      System.out.println(dataBase.get(x).print());
      System.out.println();
    }

  }
  // if they choose to create a Galapagos_Iguana Reptile it prompts them to fill in all the required info and then
  // adds that Animal to the hashmap
  if (subchoice1 == 6){
    System.out.println("name:");
    String name = kb.next();
    System.out.println();
    System.out.println("age (years):");
    int age = kb.nextInt();
    //this next line cleans up the excess
    kb.nextLine();
    System.out.println();
    System.out.println("habitat:");
    String habitat;
    habitat = kb.nextLine();
    System.out.println();
    System.out.println("animal class:");
    String animalClass = kb.next();
    System.out.println();
    System.out.println("weight (lbs):");
    int weight = kb.nextInt();
    System.out.println();
    System.out.println("average lifespan (years):");
    int avgLifespan = kb.nextInt();
    System.out.println();
    System.out.println("link to video");
    String linkToVideo = kb.next();
    System.out.println();

    //stuff for grad Reptile
    System.out.println("number of eggs:");
    int numberOfEggs = kb.nextInt();
    System.out.println();
    System.out.println("incubation period (months):");
    int incubationPeriod = kb.nextInt();
    System.out.println();
    System.out.println("amphibious (true or false):");
    boolean amphibious = kb.nextBoolean();
    System.out.println();
    System.out.println("favorite food:");
    String favoriteFood = kb.next();
    System.out.println();
    System.out.println("max dive depth (feet):");
    int maxDiveDepth = kb.nextInt();
    System.out.println();
    System.out.println("oceanic (true or false):");
    boolean oceanic = kb.nextBoolean();
    System.out.println();
    System.out.println("Ok! Your new entry has been added to the database.\nIt now holds the following entries (in no order).");
    System.out.println();
    AbstractAnimal newEntry = new Galapagos_Iguana(name, age, habitat, animalClass, weight,avgLifespan,linkToVideo, numberOfEggs, incubationPeriod, amphibious, favoriteFood, maxDiveDepth, oceanic);
    dataBase.put(dataBase.size(),newEntry);

    for (int x=0; x < dataBase.size(); x++){
      System.out.println(dataBase.get(x).print());
      System.out.println();
    }

  }
  // if they choose to create an UnderGalapagos_Iguana Reptile it prompts them to fill in all the required info and then
  // adds that Animal to the hashmap
  if (subchoice1 == 7){
    System.out.println("name:");
    String name = kb.next();
    System.out.println();
    System.out.println("age (years):");
    int age = kb.nextInt();
    //this next line cleans up the excess
    kb.nextLine();
    System.out.println();
    System.out.println("habitat:");
    String habitat;
    habitat = kb.nextLine();
    System.out.println();
    System.out.println("animal class:");
    String animalClass = kb.next();
    System.out.println();
    System.out.println("weight (lbs):");
    int weight = kb.nextInt();
    System.out.println();
    System.out.println("average lifespan (years):");
    int avgLifespan = kb.nextInt();
    System.out.println();
    System.out.println("link to video");
    String linkToVideo = kb.next();
    System.out.println();

    //stuff for grad Reptile
    System.out.println("number of eggs:");
    int numberOfEggs = kb.nextInt();
    System.out.println();
    System.out.println("incubation period (months):");
    int incubationPeriod = kb.nextInt();
    System.out.println();
    System.out.println("amphibious (true or false):");
    boolean amphibious = kb.nextBoolean();
    System.out.println();
    System.out.println("favorite food:");
    String favoriteFood = kb.next();
    System.out.println();
    System.out.println("length (inches):");
    int length = kb.nextInt();
    System.out.println();
    System.out.println("courtship rituals (true or false):");
    boolean courtshipRituals = kb.nextBoolean();
    System.out.println();
    System.out.println("Ok! Your new entry has been added to the database.\nIt now holds the following entries. (in no order).");
    System.out.println();
    AbstractAnimal newEntry = new Fire_Belly_Newt(name, age, habitat, animalClass, weight, avgLifespan, linkToVideo, numberOfEggs, incubationPeriod, amphibious, favoriteFood, length, courtshipRituals);
    dataBase.put(dataBase.size(),newEntry);

    for (int x=0; x < dataBase.size(); x++){
      System.out.println(dataBase.get(x).print());
      System.out.println();
    }

  }
}
// if they choose to pull data on an Animal it prompts them for the key in the hashmap
// and then prints the info about that Animal
if (choice == 2){
  System.out.println("Please enter the id number of the Animal you want to pull data on.");
  System.out.println("HINT: if you haven't added any Animals in this session yet, \nyour choices are 0 through 6.");
  System.out.println();
  System.out.println("Enter a number:");
  int AnimalKey = kb.nextInt();
  System.out.println();
  System.out.println(dataBase.get(AnimalKey).print());
}
// if they choose to sort all Animals by Seniority it takes in all entries in the hashmap
// adds them to an arraylist and then uses the collection.sort, using the compareTo method to sort
// the arraylist and then prints it
if(choice == 3){
  System.out.println("All Animals are listed from lowest Seniority to highest \nseniority from top to bottom.");
  System.out.println();
  ArrayList<AbstractAnimal> list = new ArrayList<>();
  for (int x=0; x < dataBase.size(); x++){
    list.add(dataBase.get(x));
  }
  Collections.sort(list);
  for (int x=0; x < dataBase.size(); x++){
    System.out.println(list.get(x).print());
    System.out.println();
  }
}
// this prompts for the Animal number they want to remove and then it uses .remove() to remove it from the hashmap
if(choice == 4){
  System.out.println("Please enter the id number of the Animal you want to eliminate from the database.");
  System.out.println("HINT: if you haven't added any Animals in this session yet, \nyour choices are 0 through 6.");
  System.out.println();
  System.out.println("Enter a number:");
  int AnimalKey = kb.nextInt();
  System.out.println();
  dataBase.remove(AnimalKey);
  System.out.println("Animal " + AnimalKey + " removed. The database now reads as follows." );
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
