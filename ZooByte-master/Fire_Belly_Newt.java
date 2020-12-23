/*
* This is an abstract class for all Fire_Belly_Newts
*/
public class Fire_Belly_Newt extends AbstractReptile {

private int length;
private boolean courtshipRituals;

/**
 * default constructor of Fire_Belly_Newt
 */
public Fire_Belly_Newt(){
  super();
  length = 0;
  courtshipRituals = true;
}
/**
 * oerload constructor of Fire_Belly_Newt
 * @param name
 * @param age
 * @param habitat
 * @param animalClass
 * @param weight
 * @param numberOfEggs
 * @param incubationPeriod
 * @param amphibious
 * @param favoriteFood
 * @param length
 * @param courtshipRituals
 */
public Fire_Belly_Newt(String name, int age, String habitat, String animalClass, int weight, int avgLifespan, String linkToVideo, int numberOfEggs, int incubationPeriod, boolean amphibious, String favoriteFood, int length, boolean courtshipRituals){
super(name, age, habitat, animalClass, weight, avgLifespan, linkToVideo, numberOfEggs, incubationPeriod, amphibious, favoriteFood);
this.length = length;
this.courtshipRituals = courtshipRituals;
}
/**
 * prints info about the UnderGalapagos_Iguana
 * @return String with all info
 */
public String print(){
  return "Information about Fire_Belly_Newt Reptile:" + "\nname:" + name +
  "\nage:" + age +
  "\nhabitat:" + habitat +
  "\nanimal class:" + animalClass +
  "\nweight:" + weight +
  "\naverage life span:" + avgLifespan +
  "\nlink to video:" + linkToVideo +
  "\nnumber of eggs:" + numberOfEggs +
  "\nincubation period (months):" + incubationPeriod +
  "\namphibious (true or false):" + amphibious +
  "\nfavorite food:" + favoriteFood +
  "\nlength (inches):" + length +
  "\nmakes us of courtship rituals (true or false):" + courtshipRituals;
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
