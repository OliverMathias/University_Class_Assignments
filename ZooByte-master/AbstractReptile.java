/*
* This is an abstract class of all Reptiles
*/
public abstract class AbstractReptile extends AbstractAnimal{

protected int numberOfEggs;
protected int incubationPeriod;
protected boolean amphibious;
protected String favoriteFood;

	/**
	* Default empty AbstractReptile constructor
	*/
	public AbstractReptile() {
		super();
    numberOfEggs = 0;
    incubationPeriod = 0;
    amphibious = false;
    favoriteFood = " ";
	}

	/**
	 * now the constructor is for Reptiles adds more parameters for Reptiles specifically
	 * @param name
	 * @param age
	 * @param habitat
	 * @param animalClass
	 * @param weight
	 * @param numberOfEggs
	 * @param incubationPeriod
	 * @param amphibious
	 * @param favoriteFood
	 */


	public AbstractReptile(String name, int age, String habitat, String animalClass, int weight, int avgLifespan, String linkToVideo, int numberOfEggs, int incubationPeriod, boolean amphibious, String favoriteFood) {
		super(name, age, habitat, animalClass, weight, avgLifespan, linkToVideo);
		this.numberOfEggs = numberOfEggs;
		this.incubationPeriod = incubationPeriod;
		this.amphibious = amphibious;
		this.favoriteFood = favoriteFood;
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
