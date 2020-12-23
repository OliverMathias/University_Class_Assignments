/*
* This is an abstract class for all Animals
*/
public abstract class AbstractAnimal implements Printable, Comparable<AbstractAnimal>{

protected String name;
protected int age;
protected String habitat;
protected String animalClass;
protected int weight;
protected int avgLifespan;
protected String linkToVideo;

/**
 * default constructor for Animals
 */
public AbstractAnimal() {
	super();
  age = 0;
  habitat = " ";
  animalClass = " ";
  weight = 0;
	avgLifespan = 0;
	linkToVideo = " ";
}

/** the base overload constructor for all Animals
 * @param name
 * @param age
 * @param habitat
 * @param animalClass
 * @param weight
 * @param avgLifespan
 * @return none
 */
public AbstractAnimal(String name, int age, String habitat, String animalClass, int weight, int avgLifespan, String linkToVideo){
	this.name = name;
	this.age = age;
	this.habitat = habitat;
	this.animalClass = animalClass;
	this.weight = weight;
	this.avgLifespan = avgLifespan;
	this.linkToVideo = linkToVideo;
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
