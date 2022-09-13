package test;

import org.testng.annotations.Test;

public class TestVerifyUserIsAbleToLogin extends BaseTest {

    @Test
    public void loginTest(){
        pageFactory.getLoginPage().loginUser();
    }
}
