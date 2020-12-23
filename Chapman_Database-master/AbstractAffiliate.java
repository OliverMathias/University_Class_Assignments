public abstract class AbstractAffiliate implements Printable, Comparable<AbstractAffiliate>{

protected String name;
protected int age;
protected String address;
protected long phoneNumber;
protected int yearTheyCameToChapman;

/**
 * default constructor for affiliates
 */
public AbstractAffiliate() {
	super();
  age = 0;
  address = " ";
  phoneNumber = 0000000000;
  yearTheyCameToChapman = 0;
}

/** the base overload constructor for all affiliates
 * @param name
 * @param age
 * @param address
 * @param phoneNumber
 * @param yearTheyCameToChapman
 * @return none
 */
public AbstractAffiliate(String name, int age, String address, long phoneNumber, int yearTheyCameToChapman){
	this.name = name;
	this.age = age;
	this.address = address;
	this.phoneNumber = phoneNumber;
	this.yearTheyCameToChapman = yearTheyCameToChapman;
}

/**
 * setting the print method to satisfy the interface requirements
 * @return nothing yet
 */
public abstract String print();
/**
 * setting compareTo to satisfy compare interface
 * @param  affiliate passes the affiliate that will be compared to the current object
 * @return  an int
 */
public abstract int compareTo(AbstractAffiliate affiliate);

}
