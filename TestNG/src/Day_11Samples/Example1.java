package Day_11Samples;

import org.testng.annotations.Test;

public class Example1 {
  @Test
  public void testCase8() {
		displayDetails();
		System.out.println("Hello, I am TC8 from example1 class");
	}

  @Test
	public void testCase7() {
		System.out.println("Hello, I am TC7 from example1 class");
		displayDetails();
	}
	
	void displayDetails() {
		System.out.println("I am display method of Example1 class");
	}
}
/**
if testing class contains more dn one test method dn all the test method will be executed in
alphabetical order
*/