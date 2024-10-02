package Pages;
import net.bytebuddy.asm.Advice;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class Brac_Application_Page {
    public Brac_Application_Page driver;

    //RM Application

    @FindBy(xpath = "//i[@class='md md-list']/following-sibling::span")
    public WebElement Rmapplication;

    @FindBy(xpath = "//div[@class='col-md-8']//a[1]")
    public WebElement AddReturneeMigrant;

    @FindBy(xpath = "//input[@placeholder='Enter a passport number']")
    public WebElement Passportnumber;

    @FindBy(xpath = "//button[text()[normalize-space()='Search']]")
    public WebElement search;

    @FindBy(xpath = "//span[text()='Select type']")
    public WebElement Current_Employment_status;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement search_status;

    @FindBy(xpath = "//span[text()='Select qualification']")
    public WebElement EducationalQualification;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement search1;

    @FindBy(xpath = "//span[text()='Select Country']")
    public WebElement CountryReturned;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement search_country;

    @FindBy(xpath = "//select[@id='departure_date']")
    public WebElement Date_Departure_Day;

    @FindBy(xpath = "//select[@id='departure_month']")
    public WebElement Date_Departure_Month;

    @FindBy(xpath = "//select[@id='departure_year']")
    public WebElement Date_Departure_Year;

    @FindBy(xpath = "//select[@id='returnee_migrant_type']")
    public WebElement Type_of_Returny;

    @FindBy(xpath = "//span[text()='Select Occupation']")
    public WebElement Occupation_overseasc_ountry;

    @FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[1]")
    public WebElement search_occupation;

    @FindBy(xpath = "//*[@id=\"select2-occupation_id-results\"]/li[1]")
    public WebElement search_account;

    @FindBy(xpath = "//select[@id='return_date']")
    public WebElement Date_of_Return_Day;

    @FindBy(xpath = "//select[@id='return_month']")
    public WebElement Date_of_Return_Month;

    @FindBy(xpath= "//select[@id='return_year']")
    public WebElement Date_of_Return_Year;

    @FindBy(xpath = "//select[@id='remigrant_intention']")
    public WebElement Intention_to_remigration;

    @FindBy (xpath = "//label[text()='Mobile No ']/following::input")
    public WebElement Mobail_no;

    @FindBy(xpath = "//select[@id='bkash_acc_holder']")
    public WebElement Relation_with_RM;

    @FindBy(id = "fileInput1")
    public WebElement Visa_documents_upload;

    @FindBy(id = "fileInput2")
    public WebElement National_ID_Documents_upload;

    @FindBy(xpath = "//div[@class='text-center']//button[1]")
    public WebElement Submit;

    @FindBy(xpath = "//i[@class='md md-list']/following-sibling::span")
    public WebElement All_RM_Application;

//Project Create

    @FindBy(xpath = "(//i[@class='md md-list']/following-sibling::span)[2]")
    public WebElement Projectmanu;

    @FindBy(xpath = "//a[@class='menu-link ']//span")
    public WebElement OngoingProject;

    @FindBy(xpath = "//div[@class='col-md-8']//a[1]")
    public WebElement NewPoject;

    @FindBy(xpath = "//input[contains(@class,'textinput textInput')]")
    public WebElement ProjectNameEN;

    @FindBy(xpath="(//input[contains(@class,'textinput textInput')])[2]")
    public WebElement ProjectNameBN;

    @FindBy(xpath = "//input[@class='custom-control-input']/following-sibling::label")
    public WebElement country;

    @FindBy(xpath = "//select[@class='select custom-select']")
    public WebElement Funded_Country;

    @FindBy(xpath = "//input[@class='numberinput form-control']")
    public WebElement Capacity;

    @FindBy(xpath = "//input[@class='dateinput form-control']")
    public WebElement StartDate;

    @FindBy(xpath = "(//input[@class='dateinput form-control'])[2]")
    public WebElement Enddate;

//    @FindBy(id ="div_id_description")
//    public WebElement Description_Benefits_EN;

    @FindBy(xpath = "/html/body")
    public WebElement Description_Benefits_EN1;


    @FindBy(xpath = "//*[@id=\"cke_1_contents\"]")
    public WebElement tt;


    @FindBy(xpath = "/html/body/p")
    public WebElement Description_Benefits_ENp;

    @FindBy(xpath = "/html/body")
    public WebElement Description_Benefits_BN;



    @FindBy(xpath = "//label[text()[normalize-space()='Active']]")
    public WebElement Status;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement Submit0;

    public Brac_Application_Page(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
//    Rm Application


    public void RmApplication() throws InterruptedException
    {
        Thread.sleep(3000);
        Rmapplication.click();
        Thread.sleep(3000);
        AddReturneeMigrant.click();
        Thread.sleep(3000);
        Passportnumber.sendKeys("K42864699");
        Thread.sleep(3000);
        search.click();
        Thread.sleep(3000);

        Current_Employment_status.click();
        search_status.click();
        Thread.sleep(2000);
        search_status.sendKeys("Self-Employed");
        search_status.sendKeys(Keys.ENTER);

        EducationalQualification.click();
        Thread.sleep(2000);
        search1.sendKeys("SSC/Dakhil/O-Level or Equivalent");
        search1.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        CountryReturned.click();
        Thread.sleep(2000);
        search_country.sendKeys("Armenia");
        search_country.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        Date_Departure_Day.click();
        Date_Departure_Day.sendKeys("01");
        Thread.sleep(2000);
        Date_Departure_Month.click();
        Date_Departure_Month.sendKeys("Jan");
        Thread.sleep(2000);
        Date_Departure_Year.click();
        Date_Departure_Year.sendKeys("2024");
        Thread.sleep(2000);
        Type_of_Returny.click();
        Type_of_Returny.sendKeys("Trafficked Survivor");
        Thread.sleep(2000);
        Occupation_overseasc_ountry.click();
        search_occupation.click();
        Thread.sleep(2000);
        search_account.click();
        Thread.sleep(2000);
        Date_of_Return_Day.click();
        Date_of_Return_Day.sendKeys("01");
        Thread.sleep(2000);
        Date_of_Return_Month.click();
        Date_of_Return_Month.sendKeys("Jun");
        Thread.sleep(2000);
        Date_of_Return_Year.click();
        Date_of_Return_Year.sendKeys("2024");
        Thread.sleep(2000);
        Intention_to_remigration.click();
        Intention_to_remigration.sendKeys("Yes");
        Thread.sleep(2000);
        Mobail_no.sendKeys("01708499333");
        Thread.sleep(2000);
        Relation_with_RM.click();
        Relation_with_RM.sendKeys("Self");
        Thread.sleep(4000);
        Visa_documents_upload.sendKeys("E:\\Automation\\Brac_Automation\\Documents\\pdo_enrollment.pdf");
        Thread.sleep(5000);
        National_ID_Documents_upload.sendKeys("E:\\Automation\\Brac_Automation\\Documents\\pdo_enrollment_card.pdf");
        Thread.sleep(3000);
        Submit.click();


        Thread.sleep(5000);
        All_RM_Application.click();

    }

    public void ProjectCreat() throws InterruptedException
    {
        Thread.sleep(2000);
        Projectmanu.click();
        Thread.sleep(2000);
        OngoingProject.click();
        Thread.sleep(2000);
        NewPoject.click();
        Thread.sleep(2000);
        ProjectNameEN.click();
        ProjectNameEN.sendKeys("Amiprobashi Dhaka");
        Thread.sleep(2000);
        ProjectNameBN.click();
        ProjectNameBN.sendKeys("আমি প্রবাসী");
        Thread.sleep(2000);
        country.click();
        Thread.sleep(2000);
        Funded_Country.click();
        Funded_Country.sendKeys("Austria");
        Thread.sleep(2000);
        Capacity.click();
        Capacity.sendKeys("45");
        Thread.sleep(2000);
        StartDate.click();
        StartDate.sendKeys("06/11/2024");
        Thread.sleep(2000);
        Enddate.click();
        Enddate.sendKeys("06/29/2024");
//        Thread.sleep(2000);
//        Description_Benefits_EN.click();
        Thread.sleep(2000);
        Description_Benefits_EN1.sendKeys(Keys.TAB);
        Thread.sleep(4000);
        // Description_Benefits_EN1.click();

        String p="Abid";

        Description_Benefits_EN1.sendKeys(p);
        Thread.sleep(2000);
        Description_Benefits_EN1.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        Description_Benefits_BN.sendKeys("লামিচানে অবশেষে বিশ্বকাপে, খেলবেন বাংলাদেশ ও দক্ষিণ আফ্রিকার বিপক্ষে");
        Thread.sleep(2000);
        Status.click();
        Thread.sleep(2000);
        Submit0.click();





    }




}
