/*
* This is an abstract class for all Capybaras
*/
public class Capybara extends AbstractMammal{

private int avgHerdSize;
private int numberOfOffspring;

/**
 * default constructor for the Capybara class
 */
public Capybara(){
  super();
  avgHerdSize = 0;
  numberOfOffspring = 0;
}
/**
 * the overload constructor for the Capybara class
 * @param name
 * @param age
 * @param habitat
 * @param animalClass
 * @param weight
 * @param gestationPeriod
 * @param nocturnal
 * @param furLength
 * @param numberOfOffspring
 * @param avgHerdSize
 */
public Capybara(String name, int age, String habitat, String animalClass, int weight, int avgLifespan, int gestationPeriod, String linkToVideo, boolean nocturnal, int furLength, int numberOfOffspring, int avgHerdSize){
  super(name, age, habitat, animalClass, weight, avgLifespan, gestationPeriod,linkToVideo, nocturnal, furLength, numberOfOffspring);
  this.avgHerdSize = avgHerdSize;
  this.numberOfOffspring = numberOfOffspring;
}
/**
 * prints info about the Capybara
 * @return a String of info
 */
public String print(){
  return "Information about Capybara:" + "\nname:" + name +
  "\nage:" + age +
  "\nhabitat:" + habitat +
  "\nanimal class:" + animalClass +
  "\nweight:" + weight +
  "\ngestation period (months):" + gestationPeriod +
  "\nlink to video:" + linkToVideo +
  "\nnocturnal? (true of false):" + nocturnal +
  "\nfur length (inches):" + furLength +
  "\nnumber of offspring:" + numberOfOffspring +
  "\naverage herd size:" + avgHerdSize;

}
/**
 * compare method to compare the seniority of Animals
 * @param  Animal takes in an Animals
 * @return an int for the sort method
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
