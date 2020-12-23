public abstract class AbstractStaff extends AbstractAffiliate{

protected int staffId;
protected String title;
protected String building;

	/**
	* Default empty AbstractStaff constructor
	*/
public AbstractStaff() {
	super();
  staffId = 0;
  title = " ";
  building = " ";
}

/**
 * again the constructor from the affiliate class but we 'extend' it to hold new params for the staff specifically
 * @param name
 * @param age
 * @param address
 * @param phoneNumber
 * @param yearTheyCameToChapman
 * @param staffId
 * @param title
 * @param building
 */
public AbstractStaff(String name, int age, String address, long phoneNumber, int yearTheyCameToChapman, int staffId, String title, String building) {
	super(name, age, address, phoneNumber, yearTheyCameToChapman);
	this.staffId = staffId;
	this.title = title;
	this.building = building;
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
