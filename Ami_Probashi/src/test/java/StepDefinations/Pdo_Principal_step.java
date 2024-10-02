package StepDefinations;

import Pages.Pdo_principal_page;
import Utility.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class Pdo_Principal_step{
    public WebDriver driver;
    Pdo_principal_page Pdoprincipalpage;

    public Pdo_Principal_step()
    {
        this.driver= Hooks.getDriver();
        Pdoprincipalpage= new Pdo_principal_page(driver);
    }

    @When("user clicks Attendance manu")
    public void user_clicks_Attendance_manu() throws Exception
    {
        Pdoprincipalpage.PrincipalAttendance();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println("\n" + "Successfully Add Documents");
    }


    @And("user click principal approval pdo button")
    public void user_click_principal_approval_pdo_button()throws Exception
    {
        Pdoprincipalpage.principalapprovalpdo();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println("\n"+"Successfully principal approve pdo");
    }


}
