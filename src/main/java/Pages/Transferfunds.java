package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Transferfunds {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(css = "#amount")
    WebElement amount;
    @FindBy(css = "#fromAccountId")
    WebElement fromAccount;
    @FindBy(css = "#toAccountId")
    WebElement toAccount;
    @FindBy(css = "input[value='Transfer']")
    WebElement transferBtn;
    @FindBy(css = "p[id='amount.errors' ]")
    WebElement amountError;

    public Transferfunds(WebDriver driver) {
        this.driver = driver;
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
    public void Addamount(String Amount){
        amount.sendKeys(Amount);
    }
    public void SelectfromAccount(String Id){
        Select Fromaccount= new Select(fromAccount);
        Fromaccount.selectByVisibleText(Id);
    }
    public void SelecttoAccount(String Id){
        Select Toaccount= new Select(toAccount);
        Toaccount.selectByVisibleText(Id);
    }
    public void ClickonTransfer(){
        try{Thread.sleep(3000);}catch (Exception e){}
        transferBtn.click();
    }
    public String isverify(){
        return amountError.getText();
    }
}
