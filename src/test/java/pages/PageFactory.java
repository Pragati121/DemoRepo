package pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    private LoginPage loginPage;
private CustomerPage CustomerButton;
    private EditPage EditButton;
    private Report  ReportButton;
    public PageFactory(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null){
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    public CustomerPage getCustomerButton() {
        if(CustomerButton== null)
        {
            CustomerButton = new CustomerPage(driver);
        }
        return CustomerButton;
    }
    public EditPage getEditButton(){
    if(EditButton== null)
{
EditButton= new EditPage(driver);
}
return EditButton;
}
    public Report getReportButton(){
        if(ReportButton== null)
        {
            ReportButton= new Report(driver);
        }
        return ReportButton;
    }
}