package test;

import org.testng.annotations.Test;

import java.io.IOException;

class VerifyEditButtonOnCustomerPage extends BaseTest{
    @Test
    public void loginTest() throws IOException {
        pageFactory.getLoginPage().loginUser();
    }

    @Test (dependsOnMethods = "loginTest")
    public void CustomerButton(){
        pageFactory.getCustomerButton().Custom();
    }
    @Test (dependsOnMethods = "loginTest")
    public  void EditPage()throws InterruptedException{
        pageFactory.getEditButton().Edit();
    }
}
