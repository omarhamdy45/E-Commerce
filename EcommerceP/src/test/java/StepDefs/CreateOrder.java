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

public class CreateOrder {
    Auth auth=new Auth();
    @Given("user navigate to shopping cart page")
    public void CreateOrder(){
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/cart");
        JavascriptExecutor js= (JavascriptExecutor) Hooks.driver;
        js.executeScript("scrollBy(0,400)");
    }
    @When("user do checkout")
    public void Checkout(){
     WebElement check= Hooks.driver.findElement(By.id("termsofservice"));
    if(!check.isSelected()) {
        check.click();
        Hooks.driver.findElement(By.id("checkout")).click();
    }
    }
    @And("user fill all mandatory data")
    public void FillData() {
        if(Hooks.driver.findElement(By.id("edit-billing-address-button")).isDisplayed()){
            Hooks.driver.findElement(By.xpath("//button[@class=\"button-1 new-address-next-step-button\"]")).click();
        }
        else {
            JavascriptExecutor js= (JavascriptExecutor) Hooks.driver;
            js.executeScript("scrollBy(0,300)");
            Select select = new Select(Hooks.driver.findElement(By.id("BillingNewAddress_CountryId")));
            select.selectByVisibleText("Egypt");
            Hooks.driver.findElement(By.id("BillingNewAddress_City")).sendKeys("cairo");
            Hooks.driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("cairo-ainshams");
            Hooks.driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("0212");
            Hooks.driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("01024075385");
            Hooks.driver.findElement(By.name("save")).click();
        }

        Hooks.driver.findElement(By.xpath("//button[@class=\"button-1 shipping-method-next-step-button\"]")).click();
        Hooks.driver.findElement(By.id("CardholderName")).sendKeys("lava");
        Hooks.driver.findElement(By.id("CardNumber")).sendKeys("5678 9012 3456");
        Select day = new Select(Hooks.driver.findElement(By.id("ExpireMonth")));
        day.selectByValue("5");
        Select year = new Select(Hooks.driver.findElement(By.id("ExpireYear")));
        year.selectByValue("2025");
        Hooks.driver.findElement(By.id("CardCode")).sendKeys("121");
        Hooks.driver.findElement(By.xpath("//button[@class=\"button-1 payment-info-next-step-button\"]")).click();
    }
       @Then("Click Confirm order")
       public void ClickConfirm(){
        System.out.println("ss");


           System.out.println("ss");
            Hooks.driver.findElement(By.xpath("//button[@class=\"button-1 confirm-order-next-step-button\"]")).click();
           System.out.println("ss");

        }
    @Then("Successfully order message is visible")
    public void SuccessfullyMessage(){
       String ac= Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong")).getText();
       System.out.println(ac);
       String ex="Your order has been successfully processed!";
       Assert.assertTrue(ac.contains(ex));
    }





}
