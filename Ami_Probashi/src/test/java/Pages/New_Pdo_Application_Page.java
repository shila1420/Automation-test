package Pages;
import Utility.BaseData;
import Utility.CommonPageMethods;
import Utility.Random_data;
import org.apache.poi.ss.formula.functions.T;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.concurrent.TimeUnit;


public class New_Pdo_Application_Page {

    public static String enroolmanNumber;

    public static WebDriver driver;

//    String p2;
//    String p3;


    @FindBy(xpath = "//*[@id=\"admin-app\"]/div/div[2]/div/div[1]/div/div[1]/div[2]/div/a/p")
    public WebElement pdoApplication;

    @FindBy( xpath = "//*[@id=\"id_passport_number\"]")
    public WebElement passportNumber;

    @FindBy( xpath = "//*[@id=\"id_gender\"]")
    public WebElement gender;

    @FindBy(xpath ="//*[@id=\"id_religion\"]")
    public WebElement Religion;

    @FindBy (xpath = "/html/body/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div/form/div/div[7]/button")
    public WebElement next;

    @FindBy(xpath = "//select[@class='select custom-select']")
    public WebElement ttc;

    @FindBy(xpath=" (//select[@class='select custom-select'])[2]")
    public  WebElement country;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div/form/div/div[2]/div/div[2]/div/table/tbody/tr/td/div/div/div/table/tbody/tr[1]/td[2]/div/div[1]")
    public WebElement CalenderBatchSelect;

    @FindBy(xpath = "//*[@id=\"rdo_1727\"]")
    public WebElement SelectedBatch;

    @FindBy(xpath = "//button[contains(@class,'btn btn-success')]")
    public WebElement next1;

    @FindBy(xpath= "//button[contains(@class,'btn btn-success')]")
    public WebElement onPayment;

    @FindBy(xpath= "//a[@data-channel='ssl']//img[1]")
    public WebElement SSL;

    @FindBy(xpath="//input[@type='checkbox']")
    public WebElement checkbox;

    @FindBy(xpath = "//div[@class='btnn_section text-center']")
    public WebElement pay;

    @FindBy(xpath= "(//a[@class='ng-star-inserted'])[2]")
    public WebElement mobailBank;

    @FindBy(xpath="//img[contains(@class,'wow fadeIn')]")
    public WebElement bkash;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement success;

    @FindBy(xpath="//input[@type='file']")
    public WebElement photo;



    @FindBy(xpath= "//button[contains(@class,'btn btn-success')]")
    public WebElement next2;

    @FindBy(id = "btnEnrollmentDownload")
    public WebElement dwnlodEnrollmntCrd;

    @FindBy(xpath = "//b[text()='PDO Enrollment card']")
    public WebElement text;

    @FindBy(xpath="//*[@id=\"divEnrollment\"]/div/div/div/div[2]/div[3]/div/div[6]/div[2]")
    public static WebElement enrollBatchNo;


    public New_Pdo_Application_Page(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void PDOApp()
    {
        pdoApplication.click();
    }

//    public void ReadPassport() throws Exception
//    {
//        File fl=new File("Passport/Passport.txt");
//        BufferedReader bfr=new BufferedReader(new FileReader(fl));
//        String last,line;
//
//        while ((line=bfr.readLine()) !=null)
//        {
//            last=line;
//            p2=last;
//        }
//        p3=p2.substring(18,27);
//
//    }


    public void passportInfo() throws Exception {

//        ReadPassport();
//        Thread.sleep(2000);
//        passportNumber.sendKeys(p3);

         Thread.sleep(2000);



        Thread.sleep(2000);
        passportNumber.sendKeys("K73819229  ");
        passportNumber.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        gender.click();
        gender.sendKeys("Male");
//        passportNumber.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        Religion.click();
        Religion.sendKeys("Islam");

    }

    public void next()
    {
        next.click();
    }
    public void batchInfo() throws InterruptedException
    {
        Thread.sleep(1000);
        ttc.click();
        ttc.sendKeys("TTC, Cumilla");
        Thread.sleep(1000);
        ttc.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        country.click();
        country.sendKeys("United Arab Emirates");
        country.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        CalenderBatchSelect.click();

        Thread.sleep(2000);
        SelectedBatch.click();

    }
    public void next1()
    {
        next1.click();
    }

    public void payment() throws InterruptedException
    {
        Thread.sleep(2000);
        onPayment.click();
        Thread.sleep(2000);
        SSL.click();
        Thread.sleep(2000);
        checkbox.click();
        Thread.sleep(2000);
        pay.click();
        Thread.sleep(2000);
        mobailBank.click();
        Thread.sleep(2000);
        bkash.click();
        Thread.sleep(2000);
        success.click();

    }

    public void photo() throws InterruptedException
    {
        photo.sendKeys("C:\\Users\\shammiara.shila\\Downloads\\1.png");

    }

    public void next2()
    {
        next2.click();
    }

    public void download()
    {
        dwnlodEnrollmntCrd.click();
    }

    public boolean verification()
    {
        return text.isDisplayed();
    }

    public static String enroolbatch()
    {
        enroolmanNumber=enrollBatchNo.getText();

        return enroolmanNumber;
    }

    public static String Enrool()
    {
        String test=enroolmanNumber;
        return test;
    }


}
