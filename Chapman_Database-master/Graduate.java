public class Graduate extends AbstractStudent {

private int numberOfPapersPublished;
private String thesisAdvisor;

/**
 * default constructor of Graduate
 */
public Graduate(){
  super();
  numberOfPapersPublished = 0;
  thesisAdvisor = " ";
}
/**
 * Overload constructor of Graduate
 * @param name
 * @param age
 * @param address
 * @param phoneNumber
 * @param yearTheyCameToChapman
 * @param studentId
 * @param major
 * @param minor
 * @param classStanding
 * @param numberOfPapersPublished
 * @param thesisAdvisor
 */
public Graduate(String name, int age, String address, long phoneNumber, int yearTheyCameToChapman, int studentId, String major, String minor, String classStanding, int numberOfPapersPublished, String thesisAdvisor){
super(name, age, address, phoneNumber, yearTheyCameToChapman, studentId, major, minor, classStanding);
this.numberOfPapersPublished = numberOfPapersPublished;
this.thesisAdvisor = thesisAdvisor;
}
/**
 * returns all info about Graduate
 * @return String with all info
 */
public String print(){
  return "Information about grad student:" + "\nname:" + name +
  "\nage:" + age +
  "\naddress:" + address +
  "\nphone number:" + phoneNumber +
  "\nyear associate came to Chapman:" + yearTheyCameToChapman +
  "\nstudent id:" + studentId +
  "\nmajor:" + major +
  "\nminor:" + minor +
  "\nclass standing:" + classStanding +
  "\nnumber of papers published:" + numberOfPapersPublished +
  "\nthesis advisor:" + thesisAdvisor;
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
