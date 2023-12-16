package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import util.ElementHelper;

import java.util.concurrent.TimeUnit;

public class HomePage {
        static WebDriver driver;
        util.ElementHelper elementHelper;

        static By cookie = By.id("wt-cli-accept-btn");
        static By kariyer = By.xpath("//a[normalize-space()='Kariyer']");
        static By repeatcookies = By.xpath("//button[@id='cookie-acknowledge']");
        static By bt = By.cssSelector("a[title='BT']");
        static By genelbasvuru = By.xpath("//tbody/tr[1]/td[1]/span[1]/a[1]");
        static By simdibasvur = By.xpath("//div[contains(@class,'jobTitle')]//button[contains(@aria-label,'Şimdi Başvur')][contains(text(),'Şimdi Başvur')]");
        static By clickagainsimdibasvur = By.cssSelector("#applyOption-top-manual");
        By writeemail = By.cssSelector("#username");
        By writepassword = By.cssSelector("#password");
        By clicksignin = By.cssSelector("button[onclick='return validateFields();']");

        public HomePage(WebDriver driver){
            HomePage.driver = driver;
            this.elementHelper = new ElementHelper(driver);
        }


    public void homepage() {
        driver.get("https://netas.com.tr/");
    }

    public void AcceptCookies() {
            driver.findElement(cookie).click();
    }

    public void ClickKariyer() {
            driver.findElement(kariyer).click();
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,650)", "");
    }

    public void RepeatCookies() {
            driver.findElement(repeatcookies).click();
    }

    public void ClickBT() {
            driver.findElement(bt).click();
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,250)", "");
    }

    public void ClickGenelBasvuru() {
            driver.findElement(genelbasvuru).click();

    }

    public void ClickSimdiBasvur() {
            driver.findElement(simdibasvur).click();
    }


    public void ClickAgainSimdiBasvur() {
            driver.findElement(clickagainsimdibasvur).click();
    }

    public void WriteEmail() {
            driver.findElement(writeemail).sendKeys("betulguurbuz@gmail.com");

    }

    public void WritePassword() {
            driver.findElement(writepassword).sendKeys("12345678");
    }

    public void ClickSignIn() {
            driver.findElement(clicksignin).click();
    }
}


