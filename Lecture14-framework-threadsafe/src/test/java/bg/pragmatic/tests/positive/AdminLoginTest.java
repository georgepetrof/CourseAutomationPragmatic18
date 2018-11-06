package bg.pragmatic.tests.positive;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import bg.pragmatic.core.core.App;
import enums.Password;
import enums.Username;

public class AdminLoginTest {

    private App app;

    @BeforeMethod
    public void setup() {
        app = new App();
        app.startBrowser("http://shop.pragmatic.bg/admin");
    }

    @Test
    public void successfulLoginTest() {
        app.adminLoginPage.login(Username.ADMIN_USER, Password.ADMIN_PASSWORD);

        Assert.assertEquals(app.adminDashboard.isLogoutButtonDisplayed(), true, "The loggout button is not displayed");
    }
    

    @AfterMethod
    public void tearDown(){
        app.quit();
    }



}
