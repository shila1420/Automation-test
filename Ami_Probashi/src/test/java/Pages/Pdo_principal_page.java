package Pages;

import org.apache.poi.ss.formula.functions.T;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Pdo_principal_page {
    public static WebDriver driver;

    String E2;
    String E3;


//    for Attendence manu

    @FindBy(xpath = "//span[text()='Attendance '] ")
    public WebElement AttendanceManu;
    @FindBy(xpath = "//input[contains(@class,'textinput textInput')]")
    public WebElement BatchNum;
    @FindBy(xpath ="//input[contains(@class,'btn btn-primary')]")
    public WebElement search;
    @FindBy(xpath = "//a[contains(@class,'btn btn-sm')]")
    public WebElement attendanceButton;
    @FindBy(id ="uploadFile")
    public  WebElement Upload1;
    @FindBy(id = "uploadFile3")
    public WebElement Upload2;
    @FindBy(xpath = "//button[contains(@class,'btn btn-success')]")
    public WebElement AddAnother1;
    @FindBy(id = "fileDocument")
    public WebElement ChooseFile1;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement Submit1;

    @FindBy(xpath = "//button[contains(@class,'btn btn-success')]")
    public WebElement AddAnother2;
    @FindBy(xpath = "//select[@class='form-control']")
    public WebElement documentsTitle1;
    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement ChooseFile2;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement Submit2;

    @FindBy(xpath = "//button[contains(@class,'btn btn-success')]")
    public WebElement AddAnother3;
    @FindBy(xpath = "//select[@class='form-control']")
    public WebElement documentsTitle2;
    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement ChooseFile3;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement Submit3;


//     for Approval menu

    @FindBy(xpath = "//span[text()='Principal Approval-PDO ']")
    public WebElement approvalPdo;
    @FindBy(xpath = "//a[contains(@class,'btn btn-sm')]")
    public WebElement view;
    @FindBy(xpath = "//input[@class='form-control form-control-sm']")
    public WebElement searchpass;
    @FindBy(xpath = "//button[@class='btn btn-success']")
    public WebElement sendtodg;


    public Pdo_principal_page(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void ReadEnrolment() throws Exception
    {
        File fl=new File("Enroll/Enroolmen.txt");

        BufferedReader bfr=new BufferedReader(new FileReader(fl));
        String last,line;

        while ((line=bfr.readLine()) !=null)
        {
            last=line;
            E2=last;

            E3=E2.substring(18,32);

        }

    }

    public void PrincipalAttendance() throws Exception
    {
        ReadEnrolment();
        Thread.sleep(3000);
        AttendanceManu.click();
        Thread.sleep(3000);
        BatchNum.sendKeys(E3);
        Thread.sleep(3000);
        search.click();
        Thread.sleep(3000);
        attendanceButton.click();
        Thread.sleep(3000);



        Upload1.sendKeys("E:\\Ami_Probashi-20240505T040730Z-001\\Passport_Image\\Document1.png");
        Thread.sleep(3000);
        Upload2.sendKeys("E:\\Ami_Probashi-20240505T040730Z-001\\Passport_Image\\Documents2.png");
        Thread.sleep(3000);
        AddAnother1.click();
        Thread.sleep(3000);
        ChooseFile1.sendKeys("E:\\Ami_Probashi-20240505T040730Z-001\\Passport_Image\\Documents3.png");
        Thread.sleep(3000);
        Submit1.click();
        Thread.sleep(3000);
        AddAnother2.click();
        Thread.sleep(3000);
        ChooseFile2.sendKeys("E:\\Ami_Probashi-20240505T040730Z-001\\Passport_Image\\Documents4.pdf");
        Thread.sleep(3000);
        Submit2.click();
        Thread.sleep(3000);
        AddAnother3.click();
        Thread.sleep(3000);
        ChooseFile3.sendKeys("E:\\Ami_Probashi-20240505T040730Z-001\\Passport_Image\\Documents5.jpeg");
        Thread.sleep(3000);
        Submit3.click();


    }



    public void principalapprovalpdo()throws InterruptedException
    {
        Thread.sleep(2000);
        approvalPdo.click();
        Thread.sleep(2000);
        view.click();
        Thread.sleep(2000);
        searchpass.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        sendtodg.click();

    }

}
