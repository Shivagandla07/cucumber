package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmp {
	
	String beforeid="";
	String afterid="";
	WebDriver driver;

@Given("^user navigate url\"([^\"]*)\"$")
public void user_navigate_url(String url) throws Throwable {
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
   driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get(url);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

@When("^user login as username \"([^\"]*)\"and\"([^\"]*)\"$")
public void user_login_as_username_and(String user, String pass) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(user);
   driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pass);
}

@When("^user click login button$")
public void user_click_login_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
}

@When("^user click on pim button$")
public void user_click_on_pim_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
}

@When("^user click add button$")
public void user_click_add_button() throws Throwable {
    driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
    
}

@When("^user Enter \"([^\"]*)\"and\"([^\"]*)\"and \"([^\"]*)\"$")
public void user_Enter_and_and(String Firstname, String middlename, String lastname) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(Firstname);
   driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(middlename);
   driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastname);
}

@When("^user capture emid$")
public void user_capture_emid() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//input[@id='employeeId']")).getAttribute("value");
}

@When("^user click save button$")
public void user_click_save_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//input[@id='btnSave']")).click();
}

@When("^user click emid aftersave$")
public void user_click_emid_aftersave() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//input[@id='btnSave']")).getAttribute("value");
}

@Then("^user valid emid$")
public void user_valid_emid() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   if(beforeid.equals(afterid)) {
	   System.out.println("emp add succesfull"+beforeid+"        "+afterid);
	 	   
   }else
   {
	   System.out.println("emp add failed+beforeid"+"     "+afterid);
   }
}

@Then("^user close browser$")
public void user_close_browser() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.close();
}



}
