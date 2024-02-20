package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Requestpage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(css=".input.ng-pristine.ng-valid.ng-empty.ng-touched")
    WebElement loanAmount;
    @FindBy(css="#downPayment")
    WebElement downPayment;
    @FindBy(css="#fromAccountId")
    WebElement fromAccount;
    @FindBy(css = "input[value='Apply Now']")
    WebElement applyNow;


    public Requestpage(WebDriver driver) {
        this.driver = driver;
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void Addloanamount(String Amount){
        loanAmount.sendKeys(Amount);
    }
    public  void AddDounpayment(String Payment){
        downPayment.sendKeys(Payment);
    }
    public void SelectAccount(String Account){
        Select Acconttype=new Select(fromAccount);
        Acconttype.selectByVisibleText(Account);
    }
    public  void ClickonApplynow(){
        applyNow.click();
    }
}
