public class Assistant extends AbstractFaculty{

private int yearsUntilTenure;
/**
 * default constructor
 */
public Assistant(){
  super();
  yearsUntilTenure = 0;
}
/**
 * again the constructor being passed down and added to specifically for the assistant class
 * @param name
 * @param age
 * @param address
 * @param phoneNumber
 * @param yearTheyCameToChapman
 * @param facultyId
 * @param department
 * @param yearlySalary
 * @param numberOfPapers
 * @param yearsUntilTenure     
 */
public Assistant(String name, int age, String address, long phoneNumber, int yearTheyCameToChapman, int facultyId, String department, int yearlySalary, int numberOfPapers, int yearsUntilTenure){
  super(name, age, address, phoneNumber, yearTheyCameToChapman, facultyId, department, yearlySalary, numberOfPapers);
  this.yearsUntilTenure = yearsUntilTenure;
}
/**
 * prints all info about an assistant
 * @return string of info
 */
public String print(){
  return "Information about Assistant:" + "\nname:" + name +
  "\nage:" + age +
  "\naddress:" + address +
  "\nphone number:" + phoneNumber +
  "\nyear associate came to Chapman:" + yearTheyCameToChapman +
  "\nfaculty id:" + facultyId +
  "\ndepartment:" + department +
  "\nyearly salary:" + yearlySalary +
  "\nnumber of papers:" + numberOfPapers +
  "\nyears until tenure:" + yearsUntilTenure;
}

/**
 * compares the Seniority of one affiliate to another
 * @param  affiliate takes in an affiliate to compare the current one to
 * @return an int to tell the sort method is one iffiliate is more, less, or even Seniority
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
