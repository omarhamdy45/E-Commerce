package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Auth {

    public WebElement Gender(WebDriver driver){
        WebElement gender=driver.findElement(By.id("gender-male"));
        return gender;
    }
    public WebElement Firstname(WebDriver driver){
        WebElement firstname= driver.findElement(By.id("FirstName"));
        return firstname;
    }
    public WebElement Lastname(WebDriver driver){
        WebElement lastname=  driver.findElement(By.id("LastName"));
        return lastname;
    }
    public WebElement Email(WebDriver driver){
        WebElement email=   driver.findElement(By.id("Email"));
        return email;
    }
    public WebElement Company(WebDriver driver){
        WebElement company=  driver.findElement(By.id("Company"));
        return company;
    }
    public WebElement Password(WebDriver driver){
        WebElement password=  driver.findElement(By.id("Password"));
        return password;
    }
    public WebElement C_password(WebDriver driver){
        WebElement c_password=  driver.findElement(By.id("ConfirmPassword"));
        return c_password;
    }
    public WebElement register_btn(WebDriver driver){
        WebElement btn=  driver.findElement(By.id("register-button"));
        return btn;
    }
    public WebElement Success(WebDriver driver){
        WebElement Success_msg=  driver.findElement(By.xpath("//div[@class=\"result\"]"));
        return Success_msg;
    }
}
