package test;

import com.pages.AddEmployeePage;
import com.pages.LoginPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.TestBase;

public class AddEmployeeTestPage extends TestBase {

    @Test(dataProvider = "AddEmployeeTestData", dataProviderClass = AddEmployeeData.class)
    public void AddEmployee(String FullName,String MName,String LName){
        softAssert = new SoftAssert();
        LoginPage.setUserName("Admin");
        LoginPage.setPass("admin123");
        LoginPage.ClickLogin();
        AddEmployeePage.clickPIM();
        softAssert.assertTrue(AddEmployeePage.isPIMPageDisplay(), "PIM page is not displayed");
        AddEmployeePage.clickEmployeeList();
        AddEmployeePage.clickAddBtn();
        AddEmployeePage.typeFirstName(FullName);
        AddEmployeePage.typeMiddleName(MName);
        AddEmployeePage.typeLastName(LName);
        // EmployeeListPage.typeEmployeeId(22);
       // AddEmployeePage.photoUpload("profile-blank-female.png");
        AddEmployeePage.clickCreateLogin();
        AddEmployeePage.typeUserName("THusiKannan");
        AddEmployeePage.typePassword("KanThusi");
        AddEmployeePage.confirmPassword("Thesi12346");
        AddEmployeePage.setDropDownOption("Disabled");
        softAssert.assertEquals(AddEmployeePage.getSelectedOption(), "Disabled",
                "DropDown value is incorrect");
        AddEmployeePage.clicSaveBtn();
        //softAssert.assertTrue(EmployeeListPage.isUserDisplayed(), "User not created");
        softAssert.assertAll();
    }
}
