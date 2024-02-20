package Pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    WebDriver driver;
    Loginpage login;
    Homepage homepage;
    Billpaypage billpaypage;
    Openaccountpage openaccountpage;
    Registerpage registerpage;
    Requestpage requestpage;
    Transferfunds transferfunds;



    public PageObjectManager(WebDriver driver){
        this.driver = driver;
        login=new Loginpage(driver);
        homepage= new Homepage(driver);
        billpaypage=new Billpaypage(driver);
        openaccountpage= new Openaccountpage(driver);
        registerpage= new Registerpage(driver);
        requestpage=new Requestpage(driver);
        transferfunds=new Transferfunds(driver);

    }
    public Loginpage GetLoginpage(){
        return login;
    }
    public Homepage GetHomepage(){
        return homepage;
    }
    public Billpaypage GetBillpage(){
        return billpaypage;
    }
    public Openaccountpage GetOpenaccountpage(){
        return openaccountpage;
    }
    public Registerpage GetRegistrationpage(){
        return registerpage;
    }
    public Requestpage GetRequestpage(){
        return requestpage;
    }
    public Transferfunds GetTreansferfuntpage(){
        return transferfunds;
    }


}
