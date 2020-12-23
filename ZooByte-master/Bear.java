/*
* This is an abstract class for all Bear time Professors
*/
public class Bear extends AbstractMammal{

private int clawLength;
private int roarDecibels;

/**
 * default constructor
 */
public Bear(){
  super();
  clawLength = 0;
  roarDecibels = 0;
}
/**
 * default constructor of this Bear class
 * @param name
 * @param age
 * @param habitat
 * @param animalClass
 * @param weight
 * @param gestationPeriod
 * @param nocturnal
 * @param furLength
 * @param numberOfOffspring
 * @param clawLength
 */
public Bear(String name, int age, String habitat, String animalClass, int weight, int avgLifespan, int gestationPeriod, String linkToVideo, boolean nocturnal, int furLength, int numberOfOffspring, int clawLength, int roarDecibels){
  super(name, age, habitat, animalClass, weight, avgLifespan, gestationPeriod, linkToVideo, nocturnal, furLength, numberOfOffspring);
  this.clawLength = clawLength;
  this.roarDecibels = roarDecibels;
}
/**
 * prints info about Bear Professor
 * @return String of info about them
 */
public String print(){
  return "Information about Bear Mammal:" + "\nname:" + name +
  "\nage:" + age +
  "\nhabitat:" + habitat +
  "\nanimal class:" + animalClass +
  "\nweight:" + weight +
  "\ngestation period (months):" + gestationPeriod +
  "\nlink to video:" + linkToVideo +
  "\nnocturnal? (true of false):" + nocturnal +
  "\nfur length (inches):" + furLength +
  "\nnumber of offspring:" + numberOfOffspring +
  "\nclaw length (inches):" + clawLength +
  "\nroar volume (decibels):" + roarDecibels;
}
/**
 * comapares Animal to another based on seniority
 * @param  Animal takes in another Animal
 * @return int to tell sort method who is more senior
 */
public int compareTo(AbstractAnimal Animal){
  if (this.weight < Animal.weight){
    return 1;
  }
  if (this.weight > Animal.weight){
    return -1;
  }
  else{
    return 0;
  }
}

}
