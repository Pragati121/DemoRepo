package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By loginButton = By.xpath("//button[contains(@class,'login-button')]");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void loginUser(){
        driver.findElement(loginButton).click();
    }
}
