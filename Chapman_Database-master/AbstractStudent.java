public abstract class AbstractStudent extends AbstractAffiliate{

protected int studentId;
protected String major;
protected String minor;
protected String classStanding;

	/**
	* Default empty AbstractStudent constructor
	*/
	public AbstractStudent() {
		super();
    studentId = 0;
    major = " ";
    minor = " ";
    classStanding = " ";
	}

	/**
	 * now the constructor is for students adds more parameters for students specifically
	 * @param name
	 * @param age
	 * @param address
	 * @param phoneNumber
	 * @param yearTheyCameToChapman
	 * @param studentId
	 * @param major
	 * @param minor
	 * @param classStanding      
	 */

	public AbstractStudent(String name, int age, String address, long phoneNumber, int yearTheyCameToChapman, int studentId, String major, String minor, String classStanding) {
		super(name, age, address, phoneNumber, yearTheyCameToChapman);
		this.studentId = studentId;
		this.major = major;
		this.minor = minor;
		this.classStanding = classStanding;
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
