package StepDefinations;

import Pages.New_Pdo_Application_Page;
import Utility.Hooks;
import Utility.Random_data;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class New_Pdo_Application_step {

    public WebDriver driver;

    public static String EnrollManBach;

    New_Pdo_Application_Page newPdoApplicationPage;

    public New_Pdo_Application_step() {
        this.driver = Hooks.getDriver();
        newPdoApplicationPage = new New_Pdo_Application_Page (driver);

    }
    @When("user clicks on pdo application button")
    public void  user_clicks_on_pdo_application_button() throws Exception
    {
        newPdoApplicationPage.PDOApp();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("\n" + "Successfully pdo clicked");
    }
    @And("user puts passport information")
    public void user_puts_passport_information() throws Exception
    {
        newPdoApplicationPage.passportInfo();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("\n" + "Successfully inputs passport number");
    }

    @And("user click next button form PDO")
    public void user_click_next_button_form_PDO() throws Exception
    {
        newPdoApplicationPage.next();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @And("user puts batch information")
    public void user_puts_batch_information() throws Exception
    {
        newPdoApplicationPage.batchInfo();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println("\n" + "Successfully inputs Batch Information");

    }
    @And("user click next1 button")
    public void user_click_next1_button() throws Exception
    {
        newPdoApplicationPage.next1();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @And("user inputs payment")
    public void user_inputs_payment()throws Exception
    {
        newPdoApplicationPage.payment();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println("\n" + "Successfully inputs payments");
    }

    @And("user upload photo")
    public void user_upload_photo() throws Exception
    {
        newPdoApplicationPage.photo();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println("\n"+"Successfully upload photo");
    }

    @And("user click next2 button")
    public void user_click_next2_button() throws Exception
    {
        newPdoApplicationPage.next2();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @Then("user should download enrollment card")
    public void user_should_download_enrollment_card() throws Exception
    {
        newPdoApplicationPage.download();
        writeEmail();
    }


    public void writeEmail() throws Exception {

        EnrollManBach=newPdoApplicationPage.enroolbatch();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        System.out.println("Email:  " + EnrollManBach + " " + dtf.format(now));

        String Data ="Passport Number : "+ EnrollManBach + "  "+dtf.format(now);
       // Data2= "Passport Number : "+ EnrollManBach ;

        File files = new File("Enroll/Enroolmen.txt");
        FileWriter fw = new FileWriter(files,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(Data);
        bw.newLine();
        bw.close();
    }


}
