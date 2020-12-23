/*
* This is an abstract class for all Manatees
*/
public class Manatee extends AbstractMammal{

private int percentageOfFat;
private int topSpeed;
/**
 * default constructor
 */
public Manatee(){
  super();
  percentageOfFat = 0;
  topSpeed = 0;
}
/**
 * again the constructor being passed down and added to specifically for the Manatee class
 * @param name
 * @param age
 * @param habitat
 * @param animalClass
 * @param weight
 * @param gestationPeriod
 * @param nocturnal
 * @param furLength
 * @param numberOfOffspring
 * @param percentageOfFat
 */
public Manatee(String name, int age, String habitat, String animalClass, int weight, int avgLifespan, int gestationPeriod, String linkToVideo, boolean nocturnal, int furLength, int numberOfOffspring, int percentageOfFat, int topSpeed){
  super(name, age, habitat, animalClass, weight, avgLifespan, gestationPeriod, linkToVideo, nocturnal, furLength, numberOfOffspring);
  this.percentageOfFat = percentageOfFat;
  this.topSpeed = topSpeed;
}
/**
 * prints all info about an Manatee
 * @return string of info
 */
public String print(){
  return "Information about Manatee:" + "\nname:" + name +
  "\nage:" + age +
  "\nhabitat:" + habitat +
  "\nanimal class:" + animalClass +
  "\nweight:" + weight + "lbs" +
  "\ngestation period (months):" + gestationPeriod +
  "\nlink to video:" + linkToVideo +
  "\nnocturnal? (true of false):" + nocturnal +
  "\nfur length (inches):" + furLength +
  "\nnumber of offspring:" + numberOfOffspring +
  "\npercentage of fat:" + percentageOfFat + "%" +
  "\ntop speed:" + topSpeed + "mph";
}

/**
 * compares the Seniority of one Animal to another
 * @param  Animal takes in an Animal to compare the current one to
 * @return an int to tell the sort method is one iffiliate is more, less, or even Seniority
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
