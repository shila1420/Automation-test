package StepDefinations;
import Pages.Brac_Application_Page;
import Pages.Brac_Application_Page;
import Utility.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;
public class Brac_Application_step {
    public WebDriver driver;
    Brac_Application_Page newBracApplicationPage;
    public Brac_Application_step()
    {
        this.driver = Hooks.getDriver();
        newBracApplicationPage = new Brac_Application_Page(driver);

    }

    @When("user clicks on the RM Application")
    public void user_clicks_on_the_RM_Application() throws Exception
    {
        newBracApplicationPage.RmApplication();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("\n"+ "Successfully RM Application Create");
    }

    @When("user clicks on the Projects Manu")
    public void user_clicks_on_the_Projects_Manu() throws Exception
    {
        newBracApplicationPage.ProjectCreat();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println("\n" + " Successfully Project create");
    }

}
