package Pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Loginpage {
    WebDriver driver;
    WebDriverWait wait;
    @FindBy(css="input[name='username']")
    WebElement userName;
    @FindBy(css="input[name='password']")
    WebElement passWord;
    @FindBy(css ="input[value='Log In']")
    WebElement logIn;
    @FindBy(css ="#loginPanel>p:nth-of-type(2)>a")
    WebElement register;
    @FindBy(css=".error")
    WebElement error;


    public Loginpage(WebDriver driver) {
        this.driver = driver;
        wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
    public void AddUsernametextbox(String Username){
        userName.sendKeys(Username);
    }
    public  void AddPassword(String Password){
        passWord.sendKeys(Password);
    }
    public void Clickonsubmit(){
        logIn.click();
    }
    public void ClickonRegister(){
        register.click();
    }
    public boolean isError(){
        try {
            String result1 = "The username and password could not be verified.";
            String result2="An internal error has occurred and has been logged.";
            return result1.equals(error.getText())|| result2.equals(error.getText());
        }catch ( NoSuchElementException e){
            return false;
        }
    }



}
