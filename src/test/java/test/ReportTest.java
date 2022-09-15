package test;

import org.testng.annotations.Test;

import java.io.IOException;

public class ReportTest extends BaseTest {
    @Test
    public void listOfItems() throws IOException, InterruptedException {
        pageFactory.getLoginPage().loginUser();
        pageFactory.getCustomerButton().Custom();
        pageFactory.getEditButton().Edit();
        pageFactory.getReportButton().clickReport();
    }

}