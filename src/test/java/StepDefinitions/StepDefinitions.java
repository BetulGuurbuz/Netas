package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;


public class StepDefinitions {

    WebDriver driver = DriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);
    @Given("User at home page")
    public void userAtHomePage() {
        homePage.homepage();
    }

    @When("Accept cookies")
    public void acceptCookies() {
        homePage.AcceptCookies();
    }

    @When("Click kariyer")
    public void clickKariyer() {
        homePage.ClickKariyer();
    }

    @When("Accept repeat cookies")
    public void acceptRepeatCookies() {
        homePage.RepeatCookies();
    }

    @When("Click BT")
    public void clickBT() {
        homePage.ClickBT();
    }

    @Then("Click Genel Basvuru")
    public void clickGenelBasvuru() {
        homePage.ClickGenelBasvuru();
    }

    @Then("Click Simdi Basvur")
    public void clickSimdiBasvur() {
        homePage.ClickSimdiBasvur();
    }


    @When("Click again Simdi Basvur")
    public void clickAgainSimdiBasvur() {
        homePage.ClickAgainSimdiBasvur();

    }

    @Then("Write email")
    public void writeEmail() {
        homePage.WriteEmail();

    }

    @Then("Write password")
    public void writePassword() {
        homePage.WritePassword();

    }

    @Then("Click SignIn")
    public void clickSignIn() {
        homePage.ClickSignIn();
    }


}
