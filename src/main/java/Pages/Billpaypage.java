package Pages;

import org.checkerframework.checker.units.qual.N;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Billpaypage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(css = "input[name='payee.name']")
    WebElement payeeName;
    @FindBy(css = "input[name='payee.address.street']")
    WebElement address;
    @FindBy(css = "input[name='payee.address.city']")
    WebElement city;
    @FindBy(css = "input[name='payee.address.state']")
    WebElement state;
    @FindBy(css = "input[name='payee.address.zipCode']")
    WebElement zipCode;
    @FindBy(css = "input[name='payee.phoneNumber']")
    WebElement phoneNumber;
    @FindBy(css = "input[name='payee.accountNumber']")
    WebElement accountNumber;
    @FindBy(css = "input[name='verifyAccount']")
    WebElement verifyAccount;
    @FindBy(css = "input[name='amount']")
    WebElement amount;
    @FindBy(css = "select[name='fromAccountId']")
    WebElement fromAccount;
    @FindBy(css = "input[value='Send Payment']")
    WebElement sendPayment;
    @FindBy(css = "div[ng-app=\"BillPayApp\"]>div[ng-show=\"showForm\"]>.title")
    WebElement successMsg;
    @FindBy(css = "tr:nth-of-type(9)>td>span[class=\"error\"]")
    WebElement errorMsg;

    public Billpaypage(WebDriver driver) {
        this.driver = driver;
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void AddPayyename(String Name){
        payeeName.sendKeys(Name);
    }
    public void AddAddress(String Address){
        address.sendKeys(Address);
    }
    public void AddCity(String City){
        city.sendKeys(City);
    }
    public void AddState(String State){
        state.sendKeys(State);
    }
    public void AddZipcode(String Zip){
        zipCode.sendKeys(Zip);
    }
    public void AddPhonnauber(String Number){
        phoneNumber.sendKeys(Number);
    }
    public void AddAccountId(String Id){
        accountNumber.sendKeys(Id);
    }
    public void AddVerifyAccountId(String Id){
        verifyAccount.sendKeys(Id);
    }
    public void AddAmount(String Amount){
        amount.sendKeys(Amount);
    }
    public void SelectAccount(String ID){
        Select FromId= new Select(fromAccount);
        FromId.selectByVisibleText(ID);
    }
    public void ClickonSendpayment(){
        sendPayment.click();
    }

    public String vrerifyBillpay(){
        return successMsg.getText();
    }
    public String verifyError(){
        return errorMsg.getText();
    }
}

