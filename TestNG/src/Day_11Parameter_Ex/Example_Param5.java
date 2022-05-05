package Day_11Parameter_Ex;

import org.testng.annotations.Test;

public class Example_Param5 {
	@Test(dependsOnMethods="signIn",enabled=true)
	public void login() {
		System.out.println("Hello, I am login ");
	}
	@Test(dependsOnMethods="login",enabled=true)
	public void checkNotification() {
		System.out.println("Hello, I am checkNotification ");
	}
	@Test(enabled=true,expectedExceptions=ArithmeticException.class)
	public void signIn() {
		System.out.println("Hello, I am signIn" );
		int i=10/0;
  }
}
