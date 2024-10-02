package Pages;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Test_ttc_Page {
    public static WebDriver driver;

    @FindBy(xpath = "(//i[@class='md md-assignment']/following-sibling::span)[2]")
    public WebElement Admit_New_Student_Manu;

    @FindBy(xpath = "//span[@role='textbox']")
    public WebElement TradeName;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement TradeNameSearch;

    @FindBy(xpath = "(//span[@role='textbox'])[2]")
    public WebElement session;

    @FindBy(xpath = "//*[@id=\"kt_body\"]/span/span/span[1]/input")
    public WebElement sessionsearch;

    @FindBy(xpath = "//input[@class='form-control numbersOnly ']")
    public WebElement Mobilenumber;

    @FindBy(id = "kt_content")
    public WebElement blankClick;

    @FindBy(id = "save_student")
    public WebElement submit;

    @FindBy(xpath = "//span[text()='Grading & Certificate']")
    public WebElement grading;

    @FindBy(xpath = "//span[text()='Grade Students ']")
    public WebElement GradingStudents;

    @FindBy(xpath = "//a[contains(@class,'btn btn-outline-secondary')]")
    public WebElement Filter;

    @FindBy(xpath = "//span[@role='textbox']")
    public WebElement Trade;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement AllTrade;

    @FindBy(xpath = "//select[@class='form-control form-control']")
    public WebElement session1;

    @FindBy(xpath = "(//button[@data-toggle='dropdown'])[2]")
    public WebElement submit0;

    @FindBy(xpath = "//a[contains(@class,'btn btn-sm')]")
    public WebElement ActionGrade;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div/div[1]/div[2]/div[2]/div/div/div[1]/div/div[1]/div[2]/div/a")
    public WebElement Upload1;

    @FindBy(xpath = "")
    public WebElement dfghj;





    public Test_ttc_Page(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void AdmitNewStudent()throws Exception
    {
        Thread.sleep(2000);
        Admit_New_Student_Manu.click();
        Thread.sleep(2000);
        TradeName.click();
        Thread.sleep(2000);
        TradeNameSearch.click();
        Thread.sleep(2000);
        TradeNameSearch.sendKeys("Auto mechanics");
        TradeNameSearch.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        session.click();
        Thread.sleep(2000);
        sessionsearch.sendKeys("01-Oct-24 to 31-Dec-24(015-004-24-22021)");
        sessionsearch.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        Mobilenumber.sendKeys("01856289803");
        Thread.sleep(2000);
        blankClick.click();
        Thread.sleep(1000);
        submit.click();

    }

    public void Grading() throws Exception
    {
        Thread.sleep(2000);
        grading.click();
        Thread.sleep(2000);
        GradingStudents.click();
        Thread.sleep(2000);
        Filter.click();
        Thread.sleep(2000);
        Trade.click();
        Thread.sleep(2000);
        AllTrade.sendKeys("Auto mechanics");
        AllTrade.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        session1.click();

        session1.sendKeys("01-Oct-24 to 31-Dec-24");
        session1.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        submit0.click();
        Thread.sleep(2000);
        ActionGrade.click();
        Thread.sleep(2000);
        Upload1.sendKeys("E:\\Automation\\Ami_Probashi_Automation\\Passport_Image\\Document1.png");
        Thread.sleep(2000);




    }




}
