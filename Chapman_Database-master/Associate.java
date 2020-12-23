public class Associate extends AbstractFaculty{

private int yearsSinceTenure;

/**
 * default constructor for the associate class
 */
public Associate(){
  super();
  yearsSinceTenure = 0;
}
/**
 * the overload constructor for the associate class
 * @param name
 * @param age
 * @param address
 * @param phoneNumber
 * @param yearTheyCameToChapman
 * @param facultyId
 * @param department
 * @param yearlySalary
 * @param numberOfPapers
 * @param yearsSinceTenure
 */
public Associate(String name, int age, String address, long phoneNumber, int yearTheyCameToChapman, int facultyId, String department, int yearlySalary, int numberOfPapers, int yearsSinceTenure){
  super(name, age, address, phoneNumber, yearTheyCameToChapman, facultyId, department, yearlySalary, numberOfPapers);
  this.yearsSinceTenure = yearsSinceTenure;
}
/**
 * prints info about the associate
 * @return a String of info
 */
public String print(){
  return "Information about Associate:" + "\nname:" + name +
  "\nage:" + age +
  "\naddress:" + address +
  "\nphone number:" + phoneNumber +
  "\nyear associate came to Chapman:" + yearTheyCameToChapman +
  "\nfaculty id:" + facultyId +
  "\ndepartment:" + department +
  "\nyearly salary:" + yearlySalary +
  "\nnumber of papers:" + numberOfPapers +
  "\nyears since tenure:" + yearsSinceTenure;
}
/**
 * compare method to compare the seniority of affiliates
 * @param  affiliate takes in an affiliates
 * @return an int for the sort method
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
