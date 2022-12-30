package StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.sql.Driver;

public class Categories {

    @Given("user navigate to homee page")
    public void OpenBrowser() throws InterruptedException {

        Hooks.driver.navigate().to("https://demo.nopcommerce.com");
        Thread.sleep(3000);
    }
    @When("user select category and subcategory")
        public void SelectCategory()throws InterruptedException {
        Actions builder = new Actions(Hooks.driver);
        WebElement hoverElement = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
        builder.moveToElement(hoverElement).perform();
        Thread.sleep(2000);

    }
    @And("user click on subcategory")
    public void SelectSub(){
        Actions builder = new Actions(Hooks.driver);
        WebElement clickElement = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a"));
        builder.moveToElement(clickElement).click().perform();
    }
    @Then("user find relative product page")
    public void CheackCorrectSub(){
      String ac=  Hooks.driver.getCurrentUrl();
      String ex="https://demo.nopcommerce.com/desktops";
        Assert.assertEquals(ex,ac);

    }


}
