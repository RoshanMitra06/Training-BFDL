import java.util.Scanner;

class Person {
  private String name;
  private String dob;
  private String gender;
  private String mobile;
  private String blood_Group;

  /**
   * @return String return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return String return the dob
   */
  public String getDob() {
    return dob;
  }

  /**
   * @param dob the dob to set
   */
  public void setDob(String dob) {
    this.dob = dob;
  }

  /**
   * @return String return the gender
   */
  public String getGender() {
    return gender;
  }

  /**
   * @param gender the gender to set
   */
  public void setGender(String gender) {
    this.gender = gender;
  }

  /**
   * @return String return the mobile
   */
  public String getMobile() {
    return mobile;
  }

  /**
   * @param mobile the mobile to set
   */
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  /**
   * @return String return the blood_Group
   */
  public String getBlood_Group() {
    return blood_Group;
  }

  /**
   * @param blood_Group the blood_Group to set
   */
  public void setBlood_Group(String blood_Group) {
    this.blood_Group = blood_Group;
  }

}

class Donor extends Person {

  private String bloodBankName;
  private String donorType;
  private String donationDate;

  /**
   * @return String return the bloodBankName
   */
  public String getBloodBankName() {
    return bloodBankName;
  }

  /**
   * @param bloodBankName the bloodBankName to set
   */
  public void setBloodBankName(String bloodBankName) {
    this.bloodBankName = bloodBankName;
  }

  /**
   * @return String return the donorType
   */
  public String getDonorType() {
    return donorType;
  }

  /**
   * @param donorType the donorType to set
   */
  public void setDonorType(String donorType) {
    this.donorType = donorType;
  }

  /**
   * @return String return the donationDate
   */
  public String getDonationDate() {
    return donationDate;
  }

  /**
   * @param donationDate the donationDate to set
   */
  public void setDonationDate(String donationDate) {
    this.donationDate = donationDate;
  }

  public void displayDonationDetails(Donor p) {
    System.out.println("Name: " + p.getName());
    System.out.println("Date of Birth: " + p.getDob());
    System.out.println("Gender: " + p.getGender());
    System.out.println("Mobile number: " + p.getMobile());
    System.out.println("Blood Group: " + p.getBlood_Group());
    System.out.println("Blood Bank name: " + bloodBankName);
    System.out.println("Donor Type: " + donorType);
    System.out.println("Donation Date: " + donationDate);
  }

}

class Main {
  public static void main(String args[]) {
    // Person p = new Person();
    Scanner sc = new Scanner(System.in);
    Donor d = new Donor();
    System.out.println("Enter Name: ");
    d.setName(sc.next());
    System.out.println("Enter DOB: ");
    d.setDob(sc.next());
    System.out.println("Enter gender: ");
    d.setGender(sc.next());
    System.out.println("Enter mobile number: ");
    d.setMobile(sc.next());
    System.out.println("Enter blood-group: ");
    d.setBlood_Group(sc.next());
    System.out.println("Enter Blood Bank Name: ");
    d.setBloodBankName(sc.next());
    System.out.println("Enter Donor Type: ");
    d.setDonorType(sc.next());
    System.out.println("Enter Donation Date: ");
    d.setDonationDate(sc.next());
    d.displayDonationDetails(d);
  }

}