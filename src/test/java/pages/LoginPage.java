package pages;

import net.jodah.failsafe.internal.util.Assert;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginPage{
    WebDriver driver;
     By Email      = By.xpath("//input[@class='email']");
     By Password   = By.xpath("//input[@name='Password']");
    By  loginButton = By.xpath("//button[contains(@class,'login-button')]");
    By HomePageVerify=By.xpath("//div[@class='content-header']");
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void loginUser() throws IOException
    {
        String path = System.getProperty("user.dir")+"//src//test//java//TestData//DataDriven.xlsx";
        FileInputStream prop1 = null;
        try{
            prop1 = new FileInputStream(path);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        XSSFWorkbook wb = new XSSFWorkbook(prop1);
        XSSFSheet sheet = wb.getSheet("Sheet1");
        String email = sheet.getRow(1).getCell(0).getStringCellValue();
        String  pwd = sheet.getRow(1).getCell(1).getStringCellValue();

        driver.findElement(Email).clear();
        driver.findElement(Password).clear();
        driver.findElement(Email).sendKeys("email");
        driver.findElement(Password).sendKeys("pwd");
        driver.findElement(loginButton).click();
        driver.findElement(HomePageVerify).click();
        String actual = driver.findElement(HomePageVerify).getText();
        Assert.isTrue(actual.equals("Dashboard"), "Expected result does not match with actual result");
    }

}
