package StepDefs;

import Pages.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class SearchDefs {
  SearchPage searchitem=new SearchPage();
    @Given("user navigate to search field")
    public void OpenBrowser() throws InterruptedException {

        Hooks.driver.navigate().to("https://demo.nopcommerce.com");
        Thread.sleep(3000);
    }
    @When("user search for product name like apple")
    public void FillSearchField()throws InterruptedException{
        searchitem.getSearchItem(Hooks.driver).sendKeys("apple");
        searchitem.getSearchItem(Hooks.driver).sendKeys(Keys.ENTER);

    }
    @Then("user could search successfully and go to search page")
    public void SearchSuccessfully()throws InterruptedException{
        String ac=  Hooks.driver.getCurrentUrl();
        String ex="https://demo.nopcommerce.com/search?q=apple";
        Assert.assertTrue(ac.contains(ex),"error");
    }

    @When("user search for product name like north")
    public void FillInvaildItem()throws InterruptedException{
        searchitem.getSearchItem(Hooks.driver).sendKeys("north");
        searchitem.getSearchItem(Hooks.driver).sendKeys(Keys.ENTER);
    }
    @Then("user could not search for the product")
    public void unableSearch()throws InterruptedException{
      String ac= searchitem.NoItem(Hooks.driver).getText();
      String ex="No products were found that matched your criteria.";
      Assert.assertTrue(ac.contains(ex),"error");
    }

}
