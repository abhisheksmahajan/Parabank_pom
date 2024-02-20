package Pages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Openaccountpage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy (css = "#type")
    WebElement accountType;
    @FindBy (css = "#fromAccountId")
    WebElement fromAccountId;
    @FindBy (css = "input[value='Open New Account']")
    WebElement openNewAccount;
    @FindBy(css = "div[ng-if='showResult']>p:nth-of-type(1)")
    WebElement textVerify;
    @FindBy(css = "div[ng-if='showResult']>p>a")
    WebElement account;

    public Openaccountpage(WebDriver driver) {
        this.driver = driver;
        wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);
    }
    public void SelectAccounttype(String Type){
        Select Accounttype= new Select(accountType);
        Accounttype.selectByVisibleText(Type);
    }
    public void SelectFromAccountid(String Id){
        Select AccountId= new Select(fromAccountId);
        AccountId.selectByVisibleText(Id);
    }
    public void ClickonOpennewaccount(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try{Thread.sleep(3000);}catch (Exception e){}
        openNewAccount.click();
    }
    public String isVerify(){
        //Select AccountId= new Select(textVerify);
        return textVerify.getText();
    }
    public String ExtactAccountnumber(){
        return account.getText();
    }


}
