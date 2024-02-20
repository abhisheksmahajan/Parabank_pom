package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;
import java.time.Duration;

public class Registerpage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(css="input[name='customer.firstName']")
    WebElement firstName;
    @FindBy(css="input[name='customer.lastName']")
    WebElement lastName;
    @FindBy(css="input[name='customer.address.street']")
    WebElement address;
    @FindBy(css = "input[name='customer.address.city']")
    WebElement city;
    @FindBy(css = "input[name='customer.address.state']")
    WebElement state;
    @FindBy(css = "input[name='customer.address.zipCode']")
    WebElement zipCode;
    @FindBy(css = "input[name='customer.phoneNumber']")
    WebElement phoneNumber;
    @FindBy(css = "input[name='customer.ssn']")
    WebElement ssn;
    @FindBy(css = "input[name='customer.username']")
    WebElement userName;
    @FindBy(css = "input[name='customer.password']")
    WebElement passWord;
    @FindBy(css = "input[name='repeatedPassword']")
    WebElement confirmPassword;
    @FindBy(css = "input[value='Register']")
    WebElement registerBtn;

    public Registerpage(WebDriver driver) {
        this.driver = driver;
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
    public void AddFirstname(String Firstname){
        wait.until(ExpectedConditions.visibilityOf(firstName));
        firstName.sendKeys(Firstname);
    }
    public void AddLastname(String Lastname){
        wait.until(ExpectedConditions.visibilityOf(lastName));
        lastName.sendKeys(Lastname);
    }
    public void AddAddress(String Address){
        wait.until(ExpectedConditions.visibilityOf(address));
        address.sendKeys(Address);
    }
    public void AddCity(String City){
        wait.until(ExpectedConditions.visibilityOf(city));
        city.sendKeys(City);
    }
    public void AddState(String State){
        wait.until(ExpectedConditions.visibilityOf(state));
        state.sendKeys(State);
    }
    public void AddZip(String Zip){
        wait.until(ExpectedConditions.visibilityOf(zipCode));
        zipCode.sendKeys(Zip);
    }
    public void AddPhonenumber(String Phonenumber){
        wait.until(ExpectedConditions.visibilityOf(phoneNumber));
        phoneNumber.sendKeys(Phonenumber);
    }
    public void AddSSN(String Ssn){
        wait.until(ExpectedConditions.visibilityOf(ssn));
        ssn.sendKeys(Ssn);
    }
    public void AddUsername(String Username){
        wait.until(ExpectedConditions.visibilityOf(userName));
        userName.sendKeys(Username);
    }
    public void AddPassword(String Password){
        wait.until(ExpectedConditions.visibilityOf(passWord));
        passWord.sendKeys(Password);
    }
    public void AddConfirmpassword(String ConfirmPassword){
        wait.until(ExpectedConditions.visibilityOf(confirmPassword));
        confirmPassword.sendKeys(ConfirmPassword);
    }
    public void ClickonRegister(){

        registerBtn.click();
    }
}
