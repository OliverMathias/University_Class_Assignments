/*
* This is an abstract class for all part time employees
*/
public class Perigrine_Falcon extends AbstractBird {

private int topSpeed;
private int clutchSize;
/**
 * default constructor
 */
public Perigrine_Falcon(){
super();
topSpeed = 0;
clutchSize = 0;
}
/**
 * overload constructor for Perigrine_Falcon class
 * @param name
 * @param age
 * @param habitat
 * @param animalClass
 * @param weight
 * @param eggColor
 * @param plumageColor
 * @param migrationDistance
 * @param topSpeed
 */
public Perigrine_Falcon(String name, int age, String habitat, String animalClass, int weight, int avgLifespan, String linkToVideo, String eggColor, String plumageColor, boolean flightless, int migrationDistance, int topSpeed, int clutchSize){
super(name, age, habitat, animalClass, weight, avgLifespan, linkToVideo, eggColor, plumageColor, flightless, migrationDistance);
this.topSpeed = topSpeed;
this.clutchSize = clutchSize;
}
/**
 * gives info on the Perigrine_Falcon worker
 * @return String with all info on worker
 */
public String print(){
  return "Information about Perigrine_Falcon Bird:" + "\nname:" + name +
  "\nage:" + age +
  "\nhabitat:" + habitat +
  "\nanimal class:" + animalClass +
  "\nweight:" + weight +
  "\naverage life span:" + avgLifespan +
  "\nlink to video:" + linkToVideo +
  "\negg color:" + eggColor +
  "\nplumage color:" + plumageColor+
  "\nmigration distance:" + migrationDistance +
  "\nflightless (true or false):" + flightless +
  "\ntop speed (mph):" + topSpeed +
  "\nclutch size:" + clutchSize;
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
