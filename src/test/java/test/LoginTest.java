package test;

import com.pages.LoginPage;

import org.testng.annotations.Test;
import utils.TestBase;


public class LoginTest extends TestBase {


    @Test
    public void LoginTest() {


        LoginPage.setUserName("Admin");

        LoginPage.setPass("admin123");

        LoginPage.ClickLogin();

    }

    }


