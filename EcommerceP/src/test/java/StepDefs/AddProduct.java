package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AddProduct {

    @Given("user navigate to product page")
    public void UserNavigateToProductPage() throws InterruptedException {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/software");
    }
    @When("user click on add to cart button")
    public void AddToCart() throws InterruptedException {
        JavascriptExecutor js= (JavascriptExecutor) Hooks.driver;
        js.executeScript("scrollBy(0,500)");
       WebElement btn=  Hooks.driver.findElement(By.xpath("//button[@class=\"button-2 product-box-add-to-cart-button\"]"));
       btn.click();
       Thread.sleep(3000);
        btn.click();
    }
    @Then("product added message displayed")
    public void CheckAddedMessage(){

        String ac= Hooks.driver.findElement(By.xpath("//p[@class=\"content\"]")).getText();

        String ex="The product has been added to your shopping cart";
        Assert.assertTrue(ex.contains(ac));

    }
    @And("shopping cart is increased")
    public void CheckIncreased(){
        String getnum=Hooks.driver.findElement(By.xpath("//span[@class=\"cart-qty\"]")).getText();
        Assert.assertFalse(getnum.contains("0"));
    }
}
