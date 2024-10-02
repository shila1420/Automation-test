package StepDefinations;
import Pages.TTC_Loging_Page;
import Utility.BaseData;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Utility.BaseCredentials.testEnv;
import static Utility.Hooks.getDriver;

public class TTC_Loging_Step {

    public WebDriver driver;
    TTC_Loging_Page TTCLogingPage;

    public TTC_Loging_Step() {
        this.driver = getDriver();
        TTCLogingPage = new TTC_Loging_Page(driver);
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

    @Given("user has logged into the TTC portal")
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
        TTCLogingPage.TTCLogingClass();
        waitLoad();
        System.out.println("Login successfully");

    }

}
