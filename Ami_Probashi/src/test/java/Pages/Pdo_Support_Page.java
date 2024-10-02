package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Pdo_Support_Page {
    public static WebDriver driver;

    String s2;
    String s3;

    @FindBy(xpath = "(//input[@class='form-control rounded'])[2]")
    public WebElement searchbybatch;
    
    @FindBy(xpath = "(//button[@class='btn btn-outline-success'])[2]")
    public WebElement search;

    @FindBy(xpath = "//button[contains(@class,'btn btn-primary')]")
    public WebElement editbatch;
    @FindBy(id = "idStartDate")
    public WebElement startdate;
    @FindBy(id="idEndDate")
    public WebElement enddate;
    @FindBy(xpath = "(//button[@class='btn btn-outline-success'])[2]")
    public WebElement update;

    @FindBy(xpath = "//a[contains(@class,'btn btn-success')]")
    public WebElement editmoreinfo;
    @FindBy(xpath = "//input[@class='form-control form-control-sm']")
    public WebElement searchPassport;
    @FindBy(xpath = "(//a[contains(@class,'btn btn-sm')])[2]")
    public WebElement senttoprincipal;




    public Pdo_Support_Page(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void readEnrolment() throws Exception
    {
        File fl=new File("Enroll/Enroolmen.txt");

        BufferedReader bfr=new BufferedReader(new FileReader(fl));
        String last,line;

        while ((line=bfr.readLine()) !=null)
        {
            last=line;
            s2=last;

            s3=s2.substring(18,32);

        }

    }

    public void Searchbybatch() throws Exception
    {
        readEnrolment();
        Thread.sleep(2000);
        searchbybatch.sendKeys(s3);
        Thread.sleep(2000);
        search.click();
    }
    public void Editbatch() throws InterruptedException
    {
        Thread.sleep(2000);
        editbatch.click();
        Thread.sleep(2000);
        startdate.click();
        Thread.sleep(3000);
        startdate.clear();
        startdate.sendKeys("May. 28, 2024");
        startdate.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        enddate.click();
        enddate.clear();
        enddate.sendKeys("May. 30, 2024");
        enddate.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        update.click();
    }



    public void Editmoreinfo()throws InterruptedException
    {
        Thread.sleep(2000);
        editmoreinfo.click();
        Thread.sleep(2000);
        searchPassport.sendKeys("");
        Thread.sleep(2000);
        searchPassport.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        senttoprincipal.click();
    }

}
