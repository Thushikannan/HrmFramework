package test;

import com.pages.AddEmployeePage;
import com.pages.LoginPage;
import com.pages.ReportPage;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.TestBase;

public class AddReportPageTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(AddReportPageTest.class);

    /*
    Verify add function in report page
     */
    @Test(priority = 12, dataProvider = "AddReport", dataProviderClass = ReportAddData.class)
    public void addReportPage(String name, String criteria, String criteriaInclude, String fieldGroup,
                              String field) {
        softAssert = new SoftAssert();
        LoginPage.setUserName("Admin");
        LoginPage.setPass("admin123");
        LoginPage.ClickLogin();
        AddEmployeePage.clickPIM();
        softAssert.assertTrue(AddEmployeePage.isPIMPageDisplay(), "PIM page is not displayed");
        ReportPage.clickReportPage();
        softAssert.assertTrue(ReportPage.isReportPageDisplayed(), "Report page is not displayed");
        ReportPage.clickAddBtn();
        ReportPage.setReportName(name);
        ReportPage.setSelectionCriteriaDownOption(criteria);
        ReportPage.setCriteriaIncludeDownOption(criteriaInclude);
        ReportPage.setFieldGroupsDownOption(fieldGroup);
        ReportPage.setDisplayFieldsDownOption(field);


        softAssert.assertAll();


    }
}
