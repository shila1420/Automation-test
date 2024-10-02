package StepDefinations;
import Pages.New_Pdo_Application_Page;

import Pages.Pdo_Support_Page;
import Utility.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class Pdo_Support_Step {
    public WebDriver driver;
    Pdo_Support_Page PdoSupportPage;

    public Pdo_Support_Step()
    {
        this.driver = Hooks.getDriver();
        PdoSupportPage = new Pdo_Support_Page (driver);

    }
    @When("user click search by batch number button")
    public void user_click_search_by_batch_number_button() throws Exception
    {

        PdoSupportPage.Searchbybatch();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("\n"+ "Successfully search by batch");

    }

    @And("user click edit batch button")
    public void user_click_edit_batch_button()throws Exception
    {
        PdoSupportPage.Editbatch();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println("\n"+ "Successfully edit batch");
    }
    @And("user click edit more info")
    public void user_click_edit_more_info() throws Exception
    {
        PdoSupportPage.Editmoreinfo();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("\n"+"successfully edit more info");

    }




}
