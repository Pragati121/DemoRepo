package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditPage {

    WebDriver driver;

    By EditButton = By.xpath("//td[contains(@class,'button-column')]");
    By NewName    = By.xpath("//input[@name='FirstName']");
    By SaveButton  =By.xpath("//button[@name='save']");

    public EditPage(WebDriver driver){
        this.driver = driver;
    }

    public void Edit()throws InterruptedException
    {
        driver.findElement(EditButton).click();
        Thread.sleep(20);
        driver.findElement(NewName).clear();
        driver.findElement(NewName).sendKeys("Brenda");
        driver.findElement(SaveButton).click();
    }
}
