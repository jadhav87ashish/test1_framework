package stepdefinitions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginCucumberTest {

    LoginPage login;
    HomePage home;
    Playwright playwright = Playwright.create();
    BrowserType firefox = playwright.firefox();
    Browser browser = firefox.launch(new BrowserType.LaunchOptions().setHeadless(false));
    Page page = browser.newPage();



    @Given("User launched SwagLabs application.")
    public void userLaunchedSwagLabsApplication() {
        page.navigate("https://www.saucedemo.com/");
        home = new HomePage(page);
        login = new LoginPage(page);

    }

    @When("User verifies the Page title.")
    public void userVerifiesThePageTitle() {
        String title = page.title();
        System.out.println(title);
        Assert.assertEquals(title, "Swag Labs");
    }


    @When("User logged in to the app using the username {string} and password {string}")
    public void userLoggedInToTheAppUsingTheUsernameAndPassword(String username, String password) {
        login.loginIntoApplication(username, password);

    }

    @Then("User verifies the product name {string}")
    public void userVerifiesTheProductName(String productname) {
        String productName = home.getProductName();
        Assert.assertEquals(productName, productname);
    }

    @Then("User logout from the application.")
    public void userLogoutFromTheApplication() {
        login.logoutApplication();
    }
}