public class Undergrad extends AbstractStudent {

private int scholarshipAmmount;
private int numCoursesTaken;

/**
 * default constructor of undergrad
 */
public Undergrad(){
  super();
  scholarshipAmmount = 0;
  numCoursesTaken = 0;
}
/**
 * oerload constructor of undergrad
 * @param name
 * @param age
 * @param address
 * @param phoneNumber
 * @param yearTheyCameToChapman
 * @param studentId
 * @param major
 * @param minor
 * @param classStanding
 * @param scholarshipAmmount
 * @param numCoursesTaken
 */
public Undergrad(String name, int age, String address, long phoneNumber, int yearTheyCameToChapman, int studentId, String major, String minor, String classStanding, int scholarshipAmmount, int numCoursesTaken){
super(name, age, address, phoneNumber, yearTheyCameToChapman, studentId, major, minor, classStanding);
this.scholarshipAmmount = scholarshipAmmount;
this.numCoursesTaken = numCoursesTaken;
}
/**
 * prints info about the Undergraduate
 * @return String with all info
 */
public String print(){
  return "Information about undergrad student:" + "\nname:" + name +
  "\nage:" + age +
  "\naddress:" + address +
  "\nphone number:" + phoneNumber +
  "\nyear associate came to Chapman:" + yearTheyCameToChapman +
  "\nstudent id:" + studentId +
  "\nmajor:" + major +
  "\nminor:" + minor +
  "\nclass standing:" + classStanding +
  "\nscholarship ammount:" + scholarshipAmmount +
  "\nnumber of courses taken:" + numCoursesTaken;
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
