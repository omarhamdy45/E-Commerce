package StepDefs;

import Pages.Auth;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ResetPassword {

    @Given("user navigate to reset page")
    public void OpenBrowser() throws InterruptedException {

        Hooks.driver.navigate().to("https://demo.nopcommerce.com/passwordrecovery");
        Thread.sleep(3000);
    }
    @When("user enter email")
    public void FillResetData()throws InterruptedException{
        Auth auth=new Auth();
        WebElement  email=  auth.Email(Hooks.driver);
        email.sendKeys("omar4@gmail.com");
        email.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }

    @Then("successfully recovery message displayed")
    public void recoverySuccessfully()throws InterruptedException{


        WebElement  msg =Hooks.driver.findElement(By.cssSelector("p.content"));
      String  actualres=   msg.getText();
        System.out.println(actualres);
       String ex="Email with instructions has been sent to you.";
        Assert.assertEquals(actualres,ex,"eroorrr");
    }

}
