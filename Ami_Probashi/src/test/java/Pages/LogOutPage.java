package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
    //public static WebDriver driver;

    @FindBy(xpath = "//*[@id=\"kt_quick_user_toggle\"]/span")
    //*[@id="kt_quick_user_toggle"]/span
    public WebElement nameBtn;

    @FindBy(xpath = "//*[@id=\"logout-link\"]")
    public WebElement logoutBtn;


    public LogOutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void logoutBtnClick() throws InterruptedException {
        nameBtn.click();
        Thread.sleep(3000);
        logoutBtn.click();
    }
}
