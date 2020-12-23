/*
* This is an abstract class for all abstract Bird
*/
public abstract class AbstractBird extends AbstractAnimal{

protected String eggColor;
protected String plumageColor;
protected boolean flightless;
protected int migrationDistance;

	/**
	* Default empty AbstractBird constructor
	*/
public AbstractBird() {
	super();
  eggColor = " ";
  plumageColor= " ";
	flightless = false;
  migrationDistance = 0;
}

/**
 * again the constructor from the Animal class but we 'extend' it to hold new params for the Bird specifically
 * @param name
 * @param age
 * @param habitat
 * @param animalClass
 * @param weight
 * @param eggColor
 * @param plumageColor
 * @param migrationDistance
 */
public AbstractBird(String name, int age, String habitat, String animalClass, int weight, int avgLifespan, String linkToVideo, String eggColor, String plumageColor, boolean flightless, int migrationDistance) {
	super(name, age, habitat, animalClass, weight, avgLifespan, linkToVideo);
	this.eggColor = eggColor;
	this.flightless = flightless;
	this.plumageColor = plumageColor;
	this.migrationDistance = migrationDistance;
}

/**
* setting the print method to satisfy the interface requirements
* @return nothing yet
*/
public abstract String print();
/**
* setting compareTo to satisfy compare interface
* @param  Animal passes the Animal that will be compared to the current object
* @return  an int
*/
public abstract int compareTo(AbstractAnimal Animal);


}
