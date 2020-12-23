/*
* This is an abstract class for all Galapagos_Iguana Reptiles
*/
public class Galapagos_Iguana extends AbstractReptile {

private int maxDiveDepth;
private boolean oceanic;

/**
 * default constructor of Galapagos_Iguana
 */
public Galapagos_Iguana(){
  super();
  maxDiveDepth = 0;
  oceanic = true;
}
/**
 * Overload constructor of Galapagos_Iguana
 * @param name
 * @param age
 * @param habitat
 * @param animalClass
 * @param weight
 * @param numberOfEggs
 * @param incubationPeriod
 * @param amphibious
 * @param favoriteFood
 * @param maxDiveDepth
 * @param oceanic
 */
public Galapagos_Iguana(String name, int age, String habitat, String animalClass, int weight, int avgLifespan, String linkToVideo, int numberOfEggs, int incubationPeriod, boolean amphibious, String favoriteFood, int maxDiveDepth, boolean oceanic){
super(name, age, habitat, animalClass, weight, avgLifespan, linkToVideo, numberOfEggs, incubationPeriod, amphibious, favoriteFood);
this.maxDiveDepth = maxDiveDepth;
this.oceanic = oceanic;
}
/**
 * returns all info about Galapagos_Iguana
 * @return String with all info
 */
public String print(){
  return "Information about grad Reptile:" + "\nname:" + name +
  "\nage:" + age +
  "\nhabitat:" + habitat +
  "\nanimal class:" + animalClass +
  "\nweight:" + weight +
  "\nnumber of eggs:" + numberOfEggs +
  "\nincubation period (months):" + incubationPeriod +
  "\nlink to video:" + linkToVideo +
  "\namphibious (true or false):" + amphibious +
  "\nfavorite food:" + favoriteFood +
  "\nmax dive depth (feet):" + maxDiveDepth +
  "\noceanic species:" + oceanic;
}
/**
 * compares Animals by seniority
 * @param  Animal takes in an Animal
 * @return an int to decide the seniority
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
