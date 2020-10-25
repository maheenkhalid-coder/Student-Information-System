public class Student extends Course {

  public String firstName;
  private String lastName;
  private int age;
  private int rollNumber;
  private String department;
  private String address;
  private int EnrollmentYear;
  private String phoneNumber;
  private String emailAdress;

  int courseMarks = 100;
  int totalmarks = 500;


  public Student(String fname, String lname, int Age, int rollno, String dept, String Address, int enrollYear,
      String number, String email, String course1, String course2, String course3, String course4, String course5) {

    firstName = fname;
    lastName = lname;
    age = Age;
    rollNumber = rollno;
    department = dept;
    address = Address;
    EnrollmentYear = enrollYear;
    phoneNumber = number;
    emailAdress = email;
    setCourseName1(course1);
    setCourseName2(course2);
    setCourseName3(course3);
    setCourseName4(course4);
    setCourseName5(course5);

  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getRollNumber() {
    return rollNumber;
  }

  public void setRollNumber(int rollNumber) {
    this.rollNumber = rollNumber;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getEnrollmentYear() {
    return EnrollmentYear;
  }

  public void setEnrollmentYear(int enrollmentYear) {
    EnrollmentYear = enrollmentYear;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmailAdress() {
    return emailAdress;
  }

  public void setEmailAdress(String emailAdress) {
    this.emailAdress = emailAdress;
  }

}
