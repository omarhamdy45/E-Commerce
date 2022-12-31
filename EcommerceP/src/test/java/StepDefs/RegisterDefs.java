package StepDefs;

import Pages.Auth;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegisterDefs {

  Auth auth=new Auth();
  @Given("user navigate to register page")
    public void OpenBrowser() throws InterruptedException {

    Hooks.driver.navigate().to("https://demo.nopcommerce.com/register");
    Thread.sleep(3000);
}
  @When("user fill data")
    public void FillData()throws InterruptedException{
    auth.Gender(Hooks.driver).click();
    auth.Firstname(Hooks.driver).sendKeys("hamdy");
    auth.Lastname(Hooks.driver).sendKeys("mohamed");
    JavascriptExecutor js= (JavascriptExecutor) Hooks.driver;
    js.executeScript("scrollBy(0,500)");
    Select day= new Select(Hooks.driver.findElement(By.name("DateOfBirthDay")));
    day.selectByValue("5");
    Select month= new Select(Hooks.driver.findElement(By.name("DateOfBirthMonth")));
    month.selectByVisibleText("May");
    Select year= new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
    year.selectByValue("1999");
    auth.Email(Hooks.driver).sendKeys("omar7@gmail.com");
    auth.Company(Hooks.driver).sendKeys("vno");
    auth.Password(Hooks.driver).sendKeys("omar1010");
    auth.C_password(Hooks.driver).sendKeys("omar1010");


  }
  @And("user press register button")
  public void PressRegister() throws InterruptedException {

    WebElement btn=Hooks.driver.findElement(By.id("register-button"));
    btn.click();

  }
  @Then("successfully message displayed")
  public void RegisterSuccessfully()throws InterruptedException{

    WebElement webElement=Hooks.driver.findElement(By.xpath("//div[@class=\"result\"]"));
    String  actualres =webElement.getText();
    String ex="Your registration completed";
    Assert.assertEquals(actualres,ex,"eroorrr");
  }

}
