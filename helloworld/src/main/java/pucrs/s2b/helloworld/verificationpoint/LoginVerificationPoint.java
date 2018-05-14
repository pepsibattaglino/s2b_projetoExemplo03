package pucrs.s2b.helloworld.verificationpoint;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

	public class LoginVerificationPoint {
		private WebDriver driver;
		
		public LoginVerificationPoint(WebDriver driver) {
			this.driver = driver;
		}
		
		public void checkHelloMessage() {
			final String expectedMessage = "Hi demo";
			assertTrue(this.driver.getPageSource().contains(expectedMessage));//também funcionaria da forma abaixo
	//		if (this.driver.getPageSource().contains("Hi demo")) {
	//			System.out.println("Encontrou");
	//		} else {
	//			System.out.println("Não encontrou");
	//		}	
		}
}
