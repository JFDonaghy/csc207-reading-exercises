
public class Dog {
  public String breed;
  //for describeEyes: Give color, size, and shape
  public String describeEyes;
  public String tailShape;
  //for describeEars: Give color and shape
  public String describeEars;
  
  public Dog(String breed, String describeEyes, String tailShape, String describeEars) {
	  this.breed = breed;
	  this.describeEyes = describeEyes;
	  this.tailShape = tailShape;
	  this.describeEars = describeEars;

  }
  
  public void speak() {
	  System.out.println("I am a(n) " + breed + ".");
  }
  
  public void bark() {
	  System.out.println("I have " + describeEyes + " eyes.");
  }
  
  public void wag() {
	  System.out.println("My tail is " + tailShape + ".");
  }
  
  public void scratch () {
	  System.out.println("Scratch me behind my " + describeEars + " ears!");
  }
  
  public static void main(String[] args) {
	
	//characteristics shortened to meet line length requirements.  
    Dog dog = new Dog("Alaskan Malamute", "almond-shaped", "like a waving plume", "triangular");

	dog.speak();
	  
	dog.bark();
	 
	dog.wag();
	 
	dog.scratch();
	 
  }

}
