public class Full extends AbstractFaculty{

private int yearsTilRetirement;

/**
 * default constructor
 */
public Full(){
  super();
  yearsTilRetirement = 0;
}
/**
 * default constructor of this full class
 * @param name
 * @param age
 * @param address
 * @param phoneNumber
 * @param yearTheyCameToChapman
 * @param facultyId
 * @param department
 * @param yearlySalary
 * @param numberOfPapers
 * @param yearsTilRetirement
 */
public Full(String name, int age, String address, long phoneNumber, int yearTheyCameToChapman, int facultyId, String department, int yearlySalary, int numberOfPapers, int yearsTilRetirement){
  super(name, age, address, phoneNumber, yearTheyCameToChapman, facultyId, department, yearlySalary, numberOfPapers);
  this.yearsTilRetirement = yearsTilRetirement;
}
/**
 * prints info about full Professor
 * @return String of info about them
 */
public String print(){
  return "Information about full faculty:" + "\nname:" + name +
  "\nage:" + age +
  "\naddress:" + address +
  "\nphone number:" + phoneNumber +
  "\nyear associate came to Chapman:" + yearTheyCameToChapman +
  "\nfaculty id:" + facultyId +
  "\ndepartment:" + department +
  "\nyearly salary:" + yearlySalary +
  "\nnumber of papers:" + numberOfPapers +
  "\nyears til retirement:" + yearsTilRetirement;
}
/**
 * comapares affiliate to another based on seniority
 * @param  affiliate takes in another affiliate
 * @return int to tell sort method who is more senior
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
