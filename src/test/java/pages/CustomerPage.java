package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerPage {
    WebDriver driver;

    By CustomerButton = By.xpath("(//p[contains(text(), 'Customers')])[1]");
    By Customerbuton  = By.xpath("(//a[@class='nav-link'])[22]");
    By Email          = By.xpath("//input[@class='form-control text-box single-line']");
    By SearchButton   = By.xpath("//button[contains(@class,'btn-search')]");

    public CustomerPage(WebDriver driver){
        this.driver = driver;
    }

    public void Custom()
    {
        driver.findElement(CustomerButton).click();
        driver.findElement(Customerbuton).click();
        driver.findElement(Email).sendKeys("victoria_victoria@nopCommerce.com");
        driver.findElement(SearchButton).click();
    }
}
