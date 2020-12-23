/*
* This is an abstract class for all Bear time Bird
*/
public class Puffin extends AbstractBird {

private boolean mateForLife;
private String nestLocation;
/**
 * default constructor
 */
public Puffin(){
super();
mateForLife = true;
nestLocation = " ";
}
/**
 * overload constructor for Puffin employee class
 * @param name
 * @param age
 * @param habitat
 * @param animalClass
 * @param weight
 * @param eggColor
 * @param plumageColor
 * @param migrationDistance
 * @param furLength
 */
public Puffin(String name, int age, String habitat, String animalClass, int weight, int avgLifespan, String linkToVideo, String eggColor, String plumageColor, boolean flightless, int migrationDistance, boolean mateForLife, String nestLocation){
super(name, age, habitat, animalClass, weight, avgLifespan, linkToVideo, eggColor, plumageColor, flightless, migrationDistance);
this.mateForLife = mateForLife;
this.nestLocation = nestLocation;
}
/**
 * the print metho
 * @return String with info about the Puffin
 */
public String print(){
  return "Information about Puffin Bird:" + "\nname:" + name +
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
  "\nmate for life (true or false):" + mateForLife +
  "\nnest location:" + nestLocation;
}
/**
 * comapres Animals one another
 * @param  Animal takes in one
 * @return int for sorting method to decide seniority
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
