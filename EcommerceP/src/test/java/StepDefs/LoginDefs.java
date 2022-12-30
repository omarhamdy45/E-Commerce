package StepDefs;

import Pages.Auth;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LoginDefs {

    Auth auth=new Auth();
    @Given("user navigate to Login page")
    public void OpenBrowser() throws InterruptedException {
      Hooks.driver.navigate().to("https://demo.nopcommerce.com/Login");
    }
    @When("user fill login data")
    public void FillLoginData()throws InterruptedException{
        auth.Email(Hooks.driver).sendKeys("omar4@gmail.com");

        auth.Password(Hooks.driver).sendKeys("omar1010");
        auth.Password(Hooks.driver).sendKeys(Keys.ENTER);


    }

    @Then("successfully login message displayed")
    public void LoginSuccessfully()throws InterruptedException{


        String  actualres =Hooks.driver.getCurrentUrl();
        System.out.println(actualres);
        String ex="https://demo.nopcommerce.com/";
        Assert.assertEquals(actualres,ex,"eroorrr");
    }

}
