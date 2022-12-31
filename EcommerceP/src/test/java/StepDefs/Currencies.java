package StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Currencies {

    @Given("user navigate to home page")
    public void OpenBrowser() throws InterruptedException {

        Hooks.driver.navigate().to("https://demo.nopcommerce.com");
        Thread.sleep(3000);
    }
    @When("user click on drop down list and click on Euro")
    public void SwitchCurrencies()throws InterruptedException{
        Select currencies= new Select(Hooks.driver.findElement(By.id("customerCurrency")));
        currencies.selectByVisibleText("Euro");
        JavascriptExecutor js= (JavascriptExecutor) Hooks.driver;
        js.executeScript("scrollBy(0,1200)");

    }
    @Then("All the products change to euro symbol")
    public void CheakResualt(){
        String ac=Hooks.driver.findElement(By.xpath("//span[@class=\"price actual-price\"]")).getText();
        System.out.println(ac);
       String ex="€";
        Assert.assertTrue(ac.contains(ex),"error");
    }





}
