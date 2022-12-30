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

public class WishlistSteps {

    @When("user click on add to wish button")
    public void AddToWishlist() throws InterruptedException {
        JavascriptExecutor js= (JavascriptExecutor) Hooks.driver;
        js.executeScript("scrollBy(0,500)");
        WebElement btn=  Hooks.driver.findElement(By.xpath("//button[@class=\"button-2 add-to-wishlist-button\"]"));
        btn.click();
        Thread.sleep(3000);
        btn.click();
    }
    @Then("product added  to wishlist message displayed")
    public void CheckAddedMessage(){

        String ac= Hooks.driver.findElement(By.xpath("//p[@class=\"content\"]")).getText();

        String ex="The product has been added to your wishlist";
        Assert.assertTrue(ex.contains(ac));

    }
    @And("wishlist counter is increased")
    public void CheckIncreased(){
        String getnum=Hooks.driver.findElement(By.xpath("//span[@class=\"wishlist-qty\"]")).getText();
        Assert.assertFalse(getnum.contains("0"));
    }
}
