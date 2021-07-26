package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Definition {
	
	WebDriver driver;

       @Given("Sign up page")
		public void sign_up_page() {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 	    driver = new ChromeDriver();
		 	    driver.get("http://elearningm1.upskills.in/");
		}

        @When("Click on Sign up")
		public void click_on_sign_up() {
		    driver.findElement(By.xpath("//*[@id=\"login-block\"]/div/ul/li[1]/a")).click();
		}
		@When("Enter first name {string}")
		public void enter_first_name(String firstname) {
		    driver.findElement(By.id("registration_firstname")).sendKeys(firstname);
		}
		@When("Enter last name {string}")
		public void enter_last_name(String lastname) {
			 driver.findElement(By.id("registration_lastname")).sendKeys(lastname);
			 
		}
		@When("Enter e-mail {string}")
		public void enter_e_mail(String email) {
			 driver.findElement(By.id("registration_e-mail")).sendKeys(email);
		}
		@When("Enter username {string}")
		public void enter_username(String username) {
			 driver.findElement(By.id("username")).sendKeys(username);
		}
		@When("Enter Pass {string}")
		public void enter_pass(String password) {
			 driver.findElement(By.id("pass1")).sendKeys(password);
		}
		@When("Enter Confirm Password {string}")
		public void enter_confirm_password(String confirmpassword) {
			 driver.findElement(By.id("pass2")).sendKeys(confirmpassword);
		}
		@When("click on Submit")
		public void click_on_submit() {
			 driver.findElement(By.id("registration_submit")).click();
		}
		@When("verify registration")
		public void verify_registration() {
			String Actual = driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/ul/li")).getText();
		    String Expected = "Registration";
		    Assert.assertEquals(Expected,Actual);
		   
		}
		@When("Click on dropdown")
		public void click_on_dropdown() throws InterruptedException {
			 driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/a")).click();
			    Thread.sleep(3000);
			   
		}
		@Then("Click on Logout")
		public void click_on_logout() {
			 driver.findElement(By.xpath("//*[@id=\"logout_button\"]")).click();
			    System.out.println("I am successfully logged out");
			    driver.quit();		
			    }


}
