package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Report {
    WebDriver driver;
    List<WebElement> allElementDisplay;
    public Report(WebDriver driver) {
        this.driver = driver;
    }


    public void clickReport() throws InterruptedException

    {
        Thread.sleep(3000);
        allElementDisplay = driver.findElements(By.tagName("a"));
        for(WebElement allElements:allElementDisplay)
        {
            String StrLinkText=allElements.getText();
            System.out.println(StrLinkText);
        }

    }
}
