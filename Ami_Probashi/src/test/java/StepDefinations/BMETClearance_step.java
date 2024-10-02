package StepDefinations;

import Pages.BMETClearance_page;
import Pages.New_Pdo_Application_Page;
import Utility.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class BMETClearance_step {

    public WebDriver driver;

    BMETClearance_page BMETClearancepage;

    public BMETClearance_step() {
        this.driver = Hooks.getDriver();
        BMETClearancepage = new BMETClearance_page(driver);
    }

    @When("user click on BMET Clearance button")
    public void user_click_on_BMET_Clearance_button() throws Exception {
        BMETClearancepage.ClearanceApply();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("\n" + "Successfully clearance apply");
    }

    @And("user input job details information")
    public void user_input_job_details_information() throws Exception
    {
       BMETClearancepage.JobDetails();
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       System.out.println("\n"+"Successfully add job details");

    }

    @And("user input Application Documents information")
    public void user_input_Application_Documents_information() throws Exception
    {
        BMETClearancepage.ApplicationDoc();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("\n" + "Successfully add documents");
    }
    @And("user input Candidates information")
    public void user_input_Candidates_information() throws Exception
    {
        BMETClearancepage.Candidates();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("\n" + "Successfully add candidates");
    }




}


