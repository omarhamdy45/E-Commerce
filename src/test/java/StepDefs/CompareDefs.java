package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class CompareDefs {

    @When("user click on add to compare list button")
    public void AddToCompareList() throws InterruptedException {
        JavascriptExecutor js= (JavascriptExecutor) Hooks.driver;
        js.executeScript("scrollBy(0,500)");
        WebElement btn=  Hooks.driver.findElement(By.xpath("//button[@class=\"button-2 add-to-compare-list-button\"]"));
        btn.click();
        Thread.sleep(3000);
        btn.click();
    }
    @Then("product added to compare list message displayed")

    public void CheckAddedMessage(){
        SoftAssert soft=new SoftAssert();
        String ac= Hooks.driver.findElement(By.xpath("//p[@class=\"content\"]")).getText();

        String ex="The product has been added to your product comparison";
        Assert.assertTrue(ex.contains(ac));

    }

}
