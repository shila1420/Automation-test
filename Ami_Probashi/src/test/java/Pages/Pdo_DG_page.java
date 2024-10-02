package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pdo_DG_page {

    public static WebDriver driver;

    @FindBy(xpath="//span[text()='PDO certificate approval ']")
    public WebElement PdoCertificateApproval;
    @FindBy(xpath="//a[contains(@class,'btn btn-sm')]")
    public WebElement view;


    public Pdo_DG_page(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void PdoCertificates()throws InterruptedException
    {
        Thread.sleep(2000);
        PdoCertificateApproval.click();
        Thread.sleep(2000);
        view.click();
    }

}
