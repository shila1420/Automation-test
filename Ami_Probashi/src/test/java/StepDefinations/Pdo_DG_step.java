package StepDefinations;

import Pages.Pdo_DG_page;
import Utility.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class Pdo_DG_step {

    public WebDriver driver;
    Pdo_DG_page PdoDGpage;

    public Pdo_DG_step()
    {
        this.driver = Hooks.getDriver();
        PdoDGpage = new Pdo_DG_page(driver);
    }
    @When("user click Pdo certificate approval pdo button")
    public void user_click_Pdo_certificate_approval_pdo_button() throws Exception
    {
        PdoDGpage.PdoCertificates();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println("\n"+ "Successfully DG Approved Pdo");
    }


}
