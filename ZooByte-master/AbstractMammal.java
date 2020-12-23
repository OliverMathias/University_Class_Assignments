/*
* This is an abstract class for all Mammal
*/
public abstract class AbstractMammal extends AbstractAnimal{

protected int gestationPeriod;
protected int furLength;
protected boolean nocturnal;
protected int numberOfOffspring;

	/**
	* Default empty AbstractMammal constructor
	*/
public AbstractMammal() {
	super();
  gestationPeriod = 0;
  furLength = 0;
	nocturnal = false;
  numberOfOffspring = 0;
}

/**
 * the second layer of the constructor inherited from the Animal class. adds new params for the Mammal specifically
 * @param name
 * @param age
 * @param habitat
 * @param animalClass
 * @param weight
 * @param gestationPeriod
 * @param nocturnal
 * @param furLength
 * @param numberOfOffspring
 */

public AbstractMammal(String name, int age, String habitat, String animalClass, int weight, int avgLifespan, int gestationPeriod, String linkToVideo, boolean nocturnal, int furLength, int numberOfOffspring) {
	super(name, age, habitat, animalClass, weight, avgLifespan, linkToVideo);
	this.gestationPeriod = gestationPeriod;
	this.nocturnal = nocturnal;
	this.furLength = furLength;
	this.numberOfOffspring = numberOfOffspring;
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
