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

import javax.swing.plaf.PanelUI;
import java.util.concurrent.TimeUnit;

public class BMETClearance_page {

    public static WebDriver driver;

    // start new clearance application
    @FindBy(xpath= "//span[text()='BMET Clearance']")
    public WebElement ClearanceButton;
    @FindBy(xpath = "//span[text()='New Applications ']")
    public WebElement NewClearance;
    @FindBy(xpath = "//a[@data-target='#newClearenceApplicationModal']")
    public WebElement StartApplication;
    @FindBy(xpath = "//span[@title='Please Select a country']")
    public WebElement SelectCountry;
    @FindBy(xpath = "//input[@role='searchbox']")
    public WebElement CountrySearchbox;
    @FindBy(xpath = "//select[@class='form-control']")
    public WebElement ClearanceType;
    @FindBy(xpath = "//*[@id=\"newClearenceApplicationModal\"]/div/div/div[2]/div[2]/select/option[2]")
    public WebElement Individual;
    @FindBy(xpath = "//button[contains(@class,'btn px-5')]")
    public WebElement ClearanceContinue;

    //job details
    @FindBy(xpath = "(//label[text()='Employer Name '])[2]/following::input")
    public WebElement employerName;
    @FindBy(xpath = "//div[@id='job_details']/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/select[1]")
    public WebElement VisaType;
    @FindBy(xpath = "//div[@id='job_details']/div[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]")
    public WebElement Skill_type;
    @FindBy(xpath = "//*[@id=\"job_details\"]/div/div[5]/div/div[1]/div/div[4]/div[1]/div/select")
    public WebElement Gender_type;
    @FindBy(xpath = "//div[@id='job_details']/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/select[1]")
    public WebElement Job_category;
    @FindBy(xpath = "//*[@id=\"job_details\"]/div/div[5]/div/div[1]/div/div[3]/div[2]/div/input")
    public WebElement No_Of_post;
    @FindBy(xpath = "//*[@id=\"job_details\"]/div/div[5]/div/div[1]/div/div[4]/div[2]/div/div[1]/div/input")
    public WebElement Age_range_min;
    @FindBy(xpath = "//*[@id=\"job_details\"]/div/div[5]/div/div[1]/div/div[4]/div[2]/div/div[2]/div/input")
    public WebElement Age_range_max;
    @FindBy(xpath = "//*[@id=\"job_details\"]/div/div[5]/div/div[1]/div/div[2]/div[3]/div/input")
    public WebElement Working_hour;
    @FindBy(xpath = "//*[@id=\"job_details\"]/div/div[5]/div/div[1]/div/div[2]/div[4]/div/div[1]/div/input")
    public WebElement Working_days_day;
    @FindBy(xpath = "//*[@id=\"job_details\"]/div/div[5]/div/div[1]/div/div[2]/div[4]/div/div[2]/div/select")
    public WebElement Working_days_Week;
    @FindBy(xpath = "//*[@id=\"job_details\"]/div/div[5]/div/div[1]/div/div[3]/div[3]/div/div[1]/div/input")
    public WebElement amount;
    @FindBy(xpath = "//div[@id='job_details']/div[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[2]/div[1]/select[1]")
    public WebElement Currency_Type;
    @FindBy(xpath = "//*[@id=\"job_details\"]/div/div[5]/div/div[1]/div/div[3]/div[4]/div/select")
    public WebElement Salary_per;
    @FindBy(xpath = "//*[@id=\"job_details\"]/div/div[5]/div/div[1]/div/div[4]/div[3]/div/input")
    public WebElement Contract_tenure;
    @FindBy(xpath = "//*[@id=\"job_details\"]/div/div[5]/div/div[1]/div/div[4]/div[4]/div/select")
    public WebElement Probation;
    @FindBy(xpath = "//*[@id=\"job_details\"]/div/div[5]/div/div[1]/div/div[5]/div/div[1]/div[1]/div/label/span")
    public WebElement Accommodation;
    @FindBy(xpath = "//*[@id=\"job_details\"]/div/div[5]/div/div[1]/div/div[5]/div/div[1]/div[2]/div/label/span")
    public WebElement Visa;
    @FindBy(xpath = "//*[@id=\"job_details\"]/div/div[5]/div/div[1]/div/div[5]/div/div[2]/div[1]/div/label/span")
    public WebElement Medical_benefits;

    @FindBy(xpath = "//*[@id=\"job_details\"]/div/div[5]/div/div[3]/button[2]")
    public  WebElement Save_Next;

    @FindBy(xpath = "//a[@href='#applications_documents']")
    public WebElement Tab_Application_Docu;

// Application Documents

    @FindBy(xpath = "//div[@data-toggle='collapse']")
    public WebElement General_doc;
    @FindBy(xpath = "//*[@id=\"newGeneralDocument1\"]/div/div/div[2]/div/div/div/div/div/div[2]/div/div/button")
    public WebElement Upload_Doc1;

    @FindBy(xpath = "(//div[@data-toggle='collapse'])[2]")
    public WebElement Job;
    @FindBy(xpath = "//div[@id='collapseOne_0']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
    public WebElement Upload_Doc2;
    @FindBy(xpath = "//div[@id='collapseOne_0']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")
    public WebElement Upload_Doc3;

    @FindBy(xpath = "//a[@href='#draft_candidate']")
    public WebElement Tab_candidates;

    //Candidates

    @FindBy(xpath = "//a[@data-target='#addBulkCandidateModal']")
    public WebElement Add_bulk;
    @FindBy(xpath = "//*[@id=\"addBulkCandidateModal\"]/div/div/div[2]/div[1]/div[1]/div/select")
    public WebElement Job_Select;
    @FindBy(xpath = "//div[@id='addBulkCandidateModal']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]")
    public WebElement Passport;
    @FindBy(xpath = "//div[@id='addBulkCandidateModal']/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/button[1]")
    public WebElement Search;

    @FindBy(xpath = "(//th[@class='text-center']//input)[2]")
    public WebElement Select_all;
    @FindBy(xpath = "//div[@id='addBulkCandidateModal']/div[1]/div[1]/div[3]/button[1]")
    public WebElement Add_candidates;

    @FindBy(xpath = "//button[@data-toggle='dropdown']//img[1]")
    public WebElement Action;
    @FindBy(xpath = "//a[@draggable='false']")
    public WebElement View;

    @FindBy(xpath = "//div[@id='candidateView']/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    public WebElement Visa_number;
    @FindBy(xpath = "//div[@id='candidateView']/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]")
    public WebElement Visa_Issue_day;
    @FindBy(xpath = "//div[@id='candidateView']/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]")
    public WebElement Visa_Issue_Month;
    @FindBy(xpath = "//div[@id='candidateView']/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/select[1] ")
    public WebElement Visa_Issue_year;

    @FindBy(xpath ="//div[@id='candidateView']/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/select[1]" )
    public WebElement Visa_Expiry_day;
    @FindBy(xpath = "//div[@id='candidateView']/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/select[1]")
    public WebElement Visa_Expiry_month;
    @FindBy(xpath = "//div[@id='candidateView']/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/select[1]")
    public WebElement Visa_Expiry_year;
    @FindBy(xpath = "(//div[@class='media-body']//button)[2]")
    public WebElement Visa_Documents;
    @FindBy(xpath = "//div[@class='footer_btn_item']//button[1]")
    public WebElement Update;

    @FindBy(xpath = "//button[text()=' Next']")
    public WebElement NeXT;








    public BMETClearance_page(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public void ClearanceApply() throws InterruptedException {
        ClearanceButton.click();
        Thread.sleep(2000);
        NewClearance.click();
        Thread.sleep(2000);
        StartApplication.click();
        Thread.sleep(2000);
        SelectCountry.click();
        Thread.sleep(2000);
        CountrySearchbox.sendKeys("Malaysia");
        Thread.sleep(2000);
        CountrySearchbox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        ClearanceType.click();
        Thread.sleep(2000);
        Individual.click();
        Thread.sleep(2000);
        ClearanceContinue.click();
        Thread.sleep(2000);



    }
    public void JobDetails()throws InterruptedException {
        Thread.sleep(2000);
        employerName.sendKeys("Amiprobashi");
        Thread.sleep(3000);
        VisaType.sendKeys("Visa non_attested");
        Thread.sleep(2000);
        Skill_type.sendKeys("General");
        Thread.sleep(2000);
        Gender_type.click();
        Thread.sleep(2000);
        Gender_type.sendKeys("Others");
        Thread.sleep(2000);
        Job_category.click();
        Thread.sleep(2000);
        Job_category.sendKeys("Artist");
        Thread.sleep(2000);
        No_Of_post.sendKeys("15");
        Thread.sleep(2000);
        Age_range_min.sendKeys("20");
        Thread.sleep(2000);
        Age_range_max.sendKeys("65");
        Thread.sleep(2000);
        Working_hour.sendKeys("12");
        Thread.sleep(2000);
        Working_days_day.sendKeys("22");
        Thread.sleep(2000);
        Working_days_Week.click();
        Thread.sleep(2000);
        Working_days_Week.sendKeys("Month");
        Thread.sleep(2000);
        amount.sendKeys("45000");
        Thread.sleep(2000);
        Currency_Type.click();
        Thread.sleep(2000);
        Currency_Type.sendKeys("USD");
        Thread.sleep(2000);
        Contract_tenure.sendKeys("1");
        Thread.sleep(2000);
        Salary_per.click();
        Thread.sleep(2000);
        Salary_per.sendKeys("Month");
        Thread.sleep(2000);
        Probation.click();
        Thread.sleep(2000);
        Probation.sendKeys("Not Applicable");

        Thread.sleep(2000);
        Accommodation.click();
        Thread.sleep(2000);
        Visa.click();
        Thread.sleep(2000);
        Medical_benefits.click();
        Thread.sleep(2000);

        Save_Next.click();
        Thread.sleep(10000);
        Tab_Application_Docu.click();
        Thread.sleep(3000);

    }

    public void ApplicationDoc() throws InterruptedException
// Application Documents
    {
//        General_doc.click();
//        Thread.sleep(3000);
//        Upload_Doc1.sendKeys("E:\\Ami_Probashi-20240505T040730Z-001\\Passport_Image\\Documents5.jpeg");
//        Thread.sleep(3000);
//
//        Job.click();
//        Thread.sleep(3000);
//        Upload_Doc2.sendKeys("E:\\Ami_Probashi-20240505T040730Z-001\\Passport_Image\\Documents4.pdf");
//        Thread.sleep(3000);
//        Upload_Doc3.sendKeys("E:\\Ami_Probashi-20240505T040730Z-001\\Passport_Image\\Documents3.png");
        Thread.sleep(3000);
        Tab_candidates.click();
    }


    public void Candidates() throws InterruptedException
    {
//Candidates
        Thread.sleep(3000);
        Add_bulk.click();
        Thread.sleep(3000);
        Job_Select.sendKeys("Artist(Amiprobashi)");
        Thread.sleep(3000);
        Passport.sendKeys("K77449112");
        Thread.sleep(3000);
        Search.click();
        Thread.sleep(3000);
        Select_all.click();
        Thread.sleep(3000);
        Add_candidates.click();
        Thread.sleep(3000);

        Action.click();
        Thread.sleep(3000);
        View.click();
        Thread.sleep(3000);
        Visa_number.sendKeys("2345SD");
        Thread.sleep(3000);
        Visa_Issue_day.sendKeys("1");
        Thread.sleep(3000);
        Visa_Issue_Month.sendKeys("jan");
        Thread.sleep(3000);
        Visa_Issue_year.sendKeys("2024");
        Thread.sleep(3000);
        Visa_Expiry_day.sendKeys("1");
        Thread.sleep(3000);
        Visa_Expiry_month.sendKeys("Nov");
        Thread.sleep(3000);
        Visa_Expiry_year.sendKeys("2024");
        Thread.sleep(3000);
        Visa_Documents.sendKeys("E:\\Ami_Probashi-20240505T040730Z-001\\Passport_Image\\Documents5.jpeg");
        Thread.sleep(3000);
        Update.click();
        Thread.sleep(3000);
        NeXT.click();







    }


}
