package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

    public WebElement getSearchItem(WebDriver driver){
        WebElement search=   driver.findElement(By.id("small-searchterms"));
        return search;
    }
    public WebElement NoItem(WebDriver driver){
        WebElement noitem=   driver.findElement(By.cssSelector("div.no-result"));
        return noitem;
    }
}
