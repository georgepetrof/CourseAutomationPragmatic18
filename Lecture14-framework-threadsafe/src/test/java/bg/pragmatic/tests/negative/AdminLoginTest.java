package bg.pragmatic.tests.negative;

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
    public void unsuccessfulLoginTest() {
        app.adminLoginPage.login(Username.INVALID_USERNAME, Password.INVALID_PASSWORD);
      
        Assert.assertTrue(app.adminLoginPage.getValidationError().contains("No match for Username and/or Password."));
    }
    
    @AfterMethod
    public void tearDown(){
        app.quit();
    }



}
