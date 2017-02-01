
public class Student {
  private String firstName;
  private String lastName;
  private int id;
  private int age;

  public Student(String firstName, String lastName, int id, int age) {
	this.firstName = firstName;
	this.lastName  = lastName;
	this.id        = id;
	this.age       = age;
  }

  /**
   * Increases the age of the student by one.
   */
  public void studentBirthday() {
	  this.age += 1;
  }
  
  /**
   * Gets the first name of the student. This must be a string.
   * 
   * @return the first name of the student.
   */
  public String getFirstName() {
	  return this.firstName;
  }
  
  /**
   * Gets the last name of the student. This must be a string.
   * 
   * @return the last name of the student.
   */
  public String getLastName() {
	  return this.lastName;
  }
  
  /**
   * Gets the id number of the student. 
   * 
   * @return the id number of the student.
   */
  public int getId() {
	  return this.id;
  }
  
  /**
   * Sets the age of the student.  This age must be greater than 14 for a college student.
   *
   * @param studentAge the 
   * @throws IllegalArgumentException if an age less than 15 is given.
   */
  public void setAge(int studentAge) {
	  if (studentAge >= 15) {
		  this.age = studentAge;
	  } else {
		  throw new IllegalArgumentException();
	  }
  }

  /**
   * Gets the age of the student.
   * 
   * @return the age of the student
   */
  public int getAge() {
	  return this.age;
  }
  
}
