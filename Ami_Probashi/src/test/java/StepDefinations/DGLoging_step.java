package StepDefinations;
import Pages.*;
import Utility.BaseData;
import Utility.Hooks;
import Utility.SmartWait;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import Pages.PdoSupportLogin_page;

import java.util.concurrent.TimeUnit;

import static Utility.BaseCredentials.testEnv;
import static Utility.Hooks.getDriver;
public class DGLoging_step {
    public WebDriver driver;
    DGLoging_Page DGloging_Page;
    public DGLoging_step() {
        this.driver = getDriver();
        DGloging_Page = new DGLoging_Page (driver);
    }

    public void waitLoad() {
        new WebDriverWait(driver, 40).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    @After(order = 1)
    public void takeScraenshotOnFailure(Scenario scenario) {

        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

    }

    @Given("user has logged into the DG portal")
    public void a_valid_url() throws Exception {
        String URL = BaseData.BaseUrlMain();

        if (testEnv().trim().equals("tst")) {

            driver.get(URL);
        } else if (testEnv().trim().equals("dev")) {
            driver.get(URL);

        } else {
            System.out.println("\n" + "Please check Environment name in config.properties file");
            driver.quit();
        }

        driver.manage().window().maximize();
        waitLoad();
        DGloging_Page.DGLogingClass();
        waitLoad();
        System.out.println("Login successfully");

    }
}