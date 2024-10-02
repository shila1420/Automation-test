package StepDefinations;

import Pages.Test_ttc_Page;
import Utility.Hooks;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class Test_ttc_Step {

    public WebDriver driver;
    Test_ttc_Page TestttcPage;
    public Test_ttc_Step()
    {
        this.driver= Hooks.getDriver();
        TestttcPage = new Test_ttc_Page(driver);
    }

    @When("user clicks on the Admit New Student Manu")
    public void user_clicks_on_the_Admit_New_Student_Manu() throws Exception
    {
        TestttcPage.AdmitNewStudent();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("\n" + " Successfully Admit new student");

    }


    @When("user clicks on the Grading & Certificate Manu")
    public void user_clicks_on_the_Grading_Certificate_Manu() throws Exception
    {
        TestttcPage.Grading();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println("\n" + "Successfully add Grading");
    }


}
