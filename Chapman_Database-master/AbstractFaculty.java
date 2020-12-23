public abstract class AbstractFaculty extends AbstractAffiliate{

protected int facultyId;
protected String department;
protected int yearlySalary;
protected int numberOfPapers;

	/**
	* Default empty AbstractFaculty constructor
	*/
public AbstractFaculty() {
	super();
  facultyId = 0;
  department = " ";
  yearlySalary = 0;
  numberOfPapers = 0;
}

/**
 * the second layer of the constructor inherited from the affiliate class. adds new params for the faculty specifically
 * @param name
 * @param age
 * @param address
 * @param phoneNumber
 * @param yearTheyCameToChapman
 * @param facultyId
 * @param department
 * @param yearlySalary
 * @param numberOfPapers
 */
public AbstractFaculty(String name, int age, String address, long phoneNumber, int yearTheyCameToChapman, int facultyId, String department, int yearlySalary, int numberOfPapers) {
	super(name, age, address, phoneNumber, yearTheyCameToChapman);
	this.facultyId = facultyId;
	this.department = department;
	this.yearlySalary = yearlySalary;
	this.numberOfPapers = numberOfPapers;
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
