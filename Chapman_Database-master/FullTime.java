public class FullTime extends AbstractStaff {

private int yearlySalary;
/**
 * default constructor
 */
public FullTime(){
super();
yearlySalary = 0;
}
/**
 * overload constructor for FullTime employee class
 * @param name
 * @param age
 * @param address
 * @param phoneNumber
 * @param yearTheyCameToChapman
 * @param staffId
 * @param title
 * @param building
 * @param yearlySalary
 */
public FullTime(String name, int age, String address, long phoneNumber, int yearTheyCameToChapman, int staffId, String title, String building, int yearlySalary){
super(name, age, address, phoneNumber, yearTheyCameToChapman, staffId, title, building);
this.yearlySalary = yearlySalary;
}
/**
 * the print metho
 * @return String with info about the FullTime
 */
public String print(){
  return "Information about fulltime staff:" + "\nname:" + name +
  "\nage:" + age +
  "\naddress:" + address +
  "\nphone number:" + phoneNumber +
  "\nyear associate came to Chapman:" + yearTheyCameToChapman +
  "\nstaff id:" + staffId +
  "\ntitle:" + title +
  "\nbuilding:" + building +
  "\nyearly salary:" + yearlySalary;
}
/**
 * comapres affiliates one another
 * @param  affiliate takes in one
 * @return int for sorting method to decide seniority
 */
public int compareTo(AbstractAffiliate affiliate){
  if (this.yearTheyCameToChapman < affiliate.yearTheyCameToChapman){
    return 1;
  }
  if (this.yearTheyCameToChapman > affiliate.yearTheyCameToChapman){
    return -1;
  }
  else{
    return 0;
  }
}

}
