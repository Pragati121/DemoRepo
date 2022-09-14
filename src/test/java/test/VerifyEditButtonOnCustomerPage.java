package test;

import org.testng.annotations.Test;

class VerifyEditButtonOnCustomerPage extends BaseTest{
    @Test
    public void loginTest(){
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
