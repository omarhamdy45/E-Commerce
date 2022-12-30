package StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FilterSteps {

    @Given("user navigate to shoes page")
    public void OpenProductsPage() throws InterruptedException {

            Hooks.driver.navigate().to("https://demo.nopcommerce.com/shoes?viewmode=grid&orderby=0&pagesize=6");
            Thread.sleep(3000);
    }
    @When("user Select color like red")
   public void SelectColor(){
        if(!Hooks.driver.findElement(By.id("attribute-option-15")).isSelected()){
            Hooks.driver.findElement(By.id("attribute-option-15")).click();
        }
    }
    @Then("all shoes with red is displayed")
    public void EnsureFilteredP(){
      String  ac=Hooks.driver.getCurrentUrl();
      System.out.println(ac);
      String ex="15";
        Assert.assertTrue(ac.contains(ex),"error");
    }

}
