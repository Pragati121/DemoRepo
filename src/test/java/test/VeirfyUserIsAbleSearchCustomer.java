package test;

import org.testng.annotations.Test;

public class VeirfyUserIsAbleSearchCustomer extends BaseTest{
    @Test
    public void loginTest(){
        pageFactory.getLoginPage().loginUser();
    }

    @Test (dependsOnMethods = "loginTest")
    public void CustomerButton(){
        pageFactory.getCustomerButton().Custom();
    }
}

