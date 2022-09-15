package test;

import org.testng.annotations.Test;

import java.io.IOException;

public class TestVerifyUserIsAbleToLogin extends BaseTest {

    @Test
    public void loginTest() throws IOException {
        pageFactory.getLoginPage().loginUser();
    }
}
