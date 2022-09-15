package test;

import org.testng.annotations.Test;

import java.io.IOException;

public class VeirfyUserIsAbleSearchCustomer extends BaseTest{
    @Test
    public void loginTest() throws IOException {
        pageFactory.getLoginPage().loginUser();
    }

    @Test (dependsOnMethods = "loginTest")
    public void CustomerButton(){
        pageFactory.getCustomerButton().Custom();
    }
}

