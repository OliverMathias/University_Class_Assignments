public class PartTime extends AbstractStaff {

private int hourlySalary;
/**
 * default constructor
 */
public PartTime(){
super();
hourlySalary = 0;
}
/**
 * overload constructor for PartTime class
 * @param name
 * @param age
 * @param address
 * @param phoneNumber
 * @param yearTheyCameToChapman
 * @param staffId
 * @param title
 * @param building
 * @param hourlySalary
 */
public PartTime(String name, int age, String address, long phoneNumber, int yearTheyCameToChapman, int staffId, String title, String building, int hourlySalary){
super(name, age, address, phoneNumber, yearTheyCameToChapman, staffId, title, building);
this.hourlySalary = hourlySalary;
}
/**
 * gives info on the PartTime worker
 * @return String with all info on worker
 */
public String print(){
  return "Information about parttime staff:" + "\nname:" + name +
  "\nage:" + age +
  "\naddress:" + address +
  "\nphone number:" + phoneNumber +
  "\nyear associate came to Chapman:" + yearTheyCameToChapman +
  "\nstaff id:" + staffId +
  "\ntitle:" + title +
  "\nbuilding:" + building +
  "\nhourly salary:" + hourlySalary;
}
/**
 * compares affiliates by seniority
 * @param  affiliate takes in an affiliate
 * @return an int to decide the seniority
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
