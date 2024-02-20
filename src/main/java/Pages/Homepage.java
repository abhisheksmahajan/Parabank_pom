package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Homepage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(css = "#leftPanel>ul>li:nth-of-type(1)>a")
    WebElement openAccount;
    @FindBy(css = "#leftPanel>ul>li:nth-of-type(2)>a")
    WebElement accountsOverview;
    @FindBy(css = "#leftPanel>ul>li:nth-of-type(3)>a")
    WebElement transferFund;
    @FindBy(css = "#leftPanel>ul>li:nth-of-type(4)>a")
    WebElement payBill;
    @FindBy(css = "#leftPanel>ul>li:nth-of-type(7)>a")
    WebElement requestLoan;

    public Homepage(WebDriver driver) {
        this.driver = driver;
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
    public void ClickonOpenaccount(){
        openAccount.click();
    }
    public void Clickonaccountoverview(){
        accountsOverview.click();
    }
    public void Clickontransferfond(){
        transferFund.click();
    }
    public void ClickonPaybill(){
        payBill.click();
    }
    public void ClickonRequestloan(){
        requestLoan.click();
    }
}
