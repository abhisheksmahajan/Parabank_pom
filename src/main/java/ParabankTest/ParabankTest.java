package ParabankTest;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import util.ProjectConfig;
import util.TextContextSetup;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParabankTest {
    TextContextSetup tcs;
    FileWriter csvWriter;
    ArrayList<String> Account=new ArrayList<>();
    String a[]= new String[10];

    @BeforeTest
    public void setup() {
        tcs = new TextContextSetup();
        tcs.base.initializeDriver().get(ProjectConfig.url);
        tcs.Setup().GetLoginpage().AddUsernametextbox(ProjectConfig.Username);
        tcs.Setup().GetLoginpage().AddPassword(ProjectConfig.Password);
        tcs.Setup().GetLoginpage().Clickonsubmit();
        if (tcs.Setup().GetLoginpage().isError()) {
            tcs.Setup().GetLoginpage().ClickonRegister();
            tcs.Setup().GetRegistrationpage().AddFirstname("Sahu");
            tcs.Setup().GetRegistrationpage().AddLastname("Malik");
            tcs.Setup().GetRegistrationpage().AddAddress("Sector 15");
            tcs.Setup().GetRegistrationpage().AddCity("Noida");
            tcs.Setup().GetRegistrationpage().AddState("Uttar Pradesh");
            tcs.Setup().GetRegistrationpage().AddZip("200419");
            tcs.Setup().GetRegistrationpage().AddPhonenumber("7702458790");
            tcs.Setup().GetRegistrationpage().AddSSN("784587");
            tcs.Setup().GetRegistrationpage().AddUsername(ProjectConfig.Username);
            tcs.Setup().GetRegistrationpage().AddPassword(ProjectConfig.Password);
            tcs.Setup().GetRegistrationpage().AddConfirmpassword(ProjectConfig.Password);
            tcs.Setup().GetRegistrationpage().ClickonRegister();

        }
    }

    @Test(priority = 0,description = "Verify that User should Create Account.")
    public void OpenAccount1(){
        tcs.Setup().GetHomepage().ClickonOpenaccount();
        tcs.Setup().GetOpenaccountpage().SelectAccounttype("SAVINGS");
        tcs.Setup().GetOpenaccountpage().ClickonOpennewaccount();
        Assert.assertEquals( tcs.Setup().GetOpenaccountpage().isVerify(),"Congratulations, your account is now open.");
        Account.add(tcs.Setup().GetOpenaccountpage().ExtactAccountnumber());
        a[0]= tcs.Setup().GetOpenaccountpage().ExtactAccountnumber();
    }
    @Test(priority = 1,description = "Verify that User should Create Multiple Accounts.")
    public void OpenAccount2(){
        int j=5;
        int amount=100;
        int i;
        tcs.Setup().GetHomepage().ClickonOpenaccount();
        tcs.Setup().GetOpenaccountpage().SelectAccounttype("SAVINGS");
        tcs.Setup().GetOpenaccountpage().SelectFromAccountid(a[0]);
        tcs.Setup().GetOpenaccountpage().ClickonOpennewaccount();
        Assert.assertEquals( tcs.Setup().GetOpenaccountpage().isVerify(),"Congratulations, your account is now open.");
        Account.add(tcs.Setup().GetOpenaccountpage().ExtactAccountnumber());
        a[1]= tcs.Setup().GetOpenaccountpage().ExtactAccountnumber();
        tcs.Setup().GetHomepage().ClickonOpenaccount();
        tcs.Setup().GetOpenaccountpage().SelectAccounttype("SAVINGS");
        tcs.Setup().GetOpenaccountpage().SelectFromAccountid(Account.get(1));
        tcs.Setup().GetOpenaccountpage().ClickonOpennewaccount();
        Assert.assertEquals( tcs.Setup().GetOpenaccountpage().isVerify(),"Congratulations, your account is now open.");
        Account.add(tcs.Setup().GetOpenaccountpage().ExtactAccountnumber());
        a[2]= tcs.Setup().GetOpenaccountpage().ExtactAccountnumber();
        tcs.Setup().GetHomepage().ClickonOpenaccount();
        tcs.Setup().GetOpenaccountpage().SelectAccounttype("SAVINGS");
        tcs.Setup().GetOpenaccountpage().SelectFromAccountid(Account.get(2));
        tcs.Setup().GetOpenaccountpage().ClickonOpennewaccount();
        Assert.assertEquals( tcs.Setup().GetOpenaccountpage().isVerify(),"Congratulations, your account is now open.");
        Account.add(tcs.Setup().GetOpenaccountpage().ExtactAccountnumber());
        a[3]= tcs.Setup().GetOpenaccountpage().ExtactAccountnumber();
        tcs.Setup().GetHomepage().ClickonOpenaccount();
        tcs.Setup().GetOpenaccountpage().SelectAccounttype("SAVINGS");
        tcs.Setup().GetOpenaccountpage().SelectFromAccountid(Account.get(3));
        tcs.Setup().GetOpenaccountpage().ClickonOpennewaccount();
        Assert.assertEquals( tcs.Setup().GetOpenaccountpage().isVerify(),"Congratulations, your account is now open.");
        Account.add(tcs.Setup().GetOpenaccountpage().ExtactAccountnumber());
        a[4]= tcs.Setup().GetOpenaccountpage().ExtactAccountnumber();
        tcs.Setup().GetHomepage().ClickonOpenaccount();
        tcs.Setup().GetOpenaccountpage().SelectAccounttype("SAVINGS");
        tcs.Setup().GetOpenaccountpage().SelectFromAccountid(Account.get(4));
        tcs.Setup().GetOpenaccountpage().ClickonOpennewaccount();
        Assert.assertEquals( tcs.Setup().GetOpenaccountpage().isVerify(),"Congratulations, your account is now open.");
        Account.add(tcs.Setup().GetOpenaccountpage().ExtactAccountnumber());
        a[5]= tcs.Setup().GetOpenaccountpage().ExtactAccountnumber();
        tcs.Setup().GetHomepage().ClickonOpenaccount();
        tcs.Setup().GetOpenaccountpage().SelectAccounttype("SAVINGS");
        tcs.Setup().GetOpenaccountpage().SelectFromAccountid(Account.get(5));
        tcs.Setup().GetOpenaccountpage().ClickonOpennewaccount();
        Assert.assertEquals( tcs.Setup().GetOpenaccountpage().isVerify(),"Congratulations, your account is now open.");
        Account.add(tcs.Setup().GetOpenaccountpage().ExtactAccountnumber());
        a[6]= tcs.Setup().GetOpenaccountpage().ExtactAccountnumber();
        tcs.Setup().GetHomepage().ClickonOpenaccount();
        tcs.Setup().GetOpenaccountpage().SelectAccounttype("SAVINGS");
        tcs.Setup().GetOpenaccountpage().SelectFromAccountid(Account.get(6));
        tcs.Setup().GetOpenaccountpage().ClickonOpennewaccount();
        Assert.assertEquals( tcs.Setup().GetOpenaccountpage().isVerify(),"Congratulations, your account is now open.");
        Account.add(tcs.Setup().GetOpenaccountpage().ExtactAccountnumber());
        a[7]= tcs.Setup().GetOpenaccountpage().ExtactAccountnumber();
        tcs.Setup().GetHomepage().ClickonOpenaccount();
        tcs.Setup().GetOpenaccountpage().SelectAccounttype("SAVINGS");
        tcs.Setup().GetOpenaccountpage().SelectFromAccountid(Account.get(7));
        tcs.Setup().GetOpenaccountpage().ClickonOpennewaccount();
        Assert.assertEquals( tcs.Setup().GetOpenaccountpage().isVerify(),"Congratulations, your account is now open.");
        Account.add(tcs.Setup().GetOpenaccountpage().ExtactAccountnumber());
        a[8]= tcs.Setup().GetOpenaccountpage().ExtactAccountnumber();
        tcs.Setup().GetHomepage().ClickonOpenaccount();
        tcs.Setup().GetOpenaccountpage().SelectAccounttype("SAVINGS");
        tcs.Setup().GetOpenaccountpage().SelectFromAccountid(Account.get(8));
        tcs.Setup().GetOpenaccountpage().ClickonOpennewaccount();
        Assert.assertEquals( tcs.Setup().GetOpenaccountpage().isVerify(),"Congratulations, your account is now open.");
        Account.add(tcs.Setup().GetOpenaccountpage().ExtactAccountnumber());
        a[9]= tcs.Setup().GetOpenaccountpage().ExtactAccountnumber();
        tcs.Setup().GetHomepage().ClickonOpenaccount();
        tcs.Setup().GetOpenaccountpage().SelectAccounttype("SAVINGS");
        tcs.Setup().GetOpenaccountpage().ClickonOpennewaccount();
        Assert.assertEquals( tcs.Setup().GetOpenaccountpage().isVerify(),"Congratulations, your account is now open.");
        Account.add(tcs.Setup().GetOpenaccountpage().ExtactAccountnumber());
        try{   // To write Fromaccount,Toaccount and Amount in Dataset.csv
            csvWriter = new FileWriter("Dataset.csv");
            for(i=0; i < 5; i++){
                csvWriter.append(Account.get(i)+","+Account.get(j)+","+amount);

                csvWriter.append("\n");

                j++;
                amount+=100;
            }

            csvWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Test(priority = 4,description = "Verify that User should not Tranfer Negitive Digit Amount.")
    public void Transferfunds1(){
        tcs.Setup().GetHomepage().Clickontransferfond();
        tcs.Setup().GetTreansferfuntpage().Addamount("500");
        tcs.Setup().GetTreansferfuntpage().ClickonTransfer();
        Assert.assertEquals(tcs.Setup().GetTreansferfuntpage().isverify(),"The amount cannot be empty.");

    }
    @Test(priority = 5,dataProvider = "Dataset",description = "Verify that User should Transfer fund from one Account to another")
    public void Transferfunds2(String fromaccount,String toaccount,String amount){
        tcs.Setup().GetHomepage().Clickontransferfond();
        tcs.Setup().GetTreansferfuntpage().Addamount(amount);
        tcs.Setup().GetTreansferfuntpage().SelectfromAccount(fromaccount);
        tcs.Setup().GetTreansferfuntpage().SelecttoAccount(toaccount);
        tcs.Setup().GetTreansferfuntpage().ClickonTransfer();
    }
    @Test(priority = 2,description = "Verify that user should Pay bill with correct information")
    public void Paybill1(){
    tcs.Setup().GetHomepage().ClickonPaybill();
    tcs.Setup().GetBillpage().AddPayyename("Sunder Narayan");
    tcs.Setup().GetBillpage().AddAddress("sector 50");
    tcs.Setup().GetBillpage().AddCity("Noida");
    tcs.Setup().GetBillpage().AddState("Uttar Pradesh");
    tcs.Setup().GetBillpage().AddZipcode("201457");
    tcs.Setup().GetBillpage().AddPhonnauber("9858654742");
    tcs.Setup().GetBillpage().AddAccountId(Account.get(1));
    tcs.Setup().GetBillpage().AddVerifyAccountId(Account.get(1));
    tcs.Setup().GetBillpage().AddAmount("500");
    tcs.Setup().GetBillpage().SelectAccount(Account.get(2));
    tcs.Setup().GetBillpage().ClickonSendpayment();
    Assert.assertEquals(tcs.Setup().GetBillpage().vrerifyBillpay(),"Bill Payment Service");
    }
    @Test(priority = 3,description = "Verify that user should not Pay bill with incorrect information ")
    public void paybill2(){
        tcs.Setup().GetHomepage().ClickonPaybill();
        tcs.Setup().GetBillpage().AddPayyename("Rahul Garg");
        tcs.Setup().GetBillpage().AddAddress("sector 62");
        tcs.Setup().GetBillpage().AddCity("Noida");
        tcs.Setup().GetBillpage().AddState("Uttar Pradesh");
        tcs.Setup().GetBillpage().AddZipcode("201400");
        tcs.Setup().GetBillpage().AddPhonnauber("9858774742");
        tcs.Setup().GetBillpage().AddAccountId(Account.get(1));
        tcs.Setup().GetBillpage().AddVerifyAccountId(Account.get(2));
        tcs.Setup().GetBillpage().AddAmount("400");
        tcs.Setup().GetBillpage().SelectAccount(Account.get(2));
        tcs.Setup().GetBillpage().ClickonSendpayment();
        Assert.assertEquals(tcs.Setup().GetBillpage().verifyError(),"The account numbers do not match.");

    }
    @Test(priority = 6,description = "Verifying Requesting loan with sufficient Downpayment fund")
    public void RequestloanTC1(){
        tcs.Setup().GetHomepage().ClickonRequestloan();
        tcs.Setup().GetRequestpage().Addloanamount("10000");
        tcs.Setup().GetRequestpage().AddDounpayment("500");
        tcs.Setup().GetRequestpage().SelectAccount(Account.get(1));
        tcs.Setup().GetRequestpage().ClickonApplynow();
        Assert.assertEquals(tcs.Setup().GetRequestpage().VerifyLoanrequest(),"Approved");

    }
    @Test(priority = 7,description = "Verifying Requesting loan with insufficient Downpayment fund")
    public void RequestloanTC2(){
        tcs.Setup().GetHomepage().ClickonRequestloan();
        tcs.Setup().GetRequestpage().Addloanamount("50000000");
        tcs.Setup().GetRequestpage().AddDounpayment("1000000");
        tcs.Setup().GetRequestpage().ClickonApplynow();
        Assert.assertEquals(tcs.Setup().GetRequestpage().VerifyLoanrequest(),"Denied");

    }







    @DataProvider(name = "Dataset")
    public Object[][] csvTestDataDataProvider1() throws IOException {
        List<Object[]> testData = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("Dataset.csv"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(",");
            String fromID = values[0];
            String toID = values[1];
            String amount = values[2];

            testData.add(new Object[]{fromID,toID,amount});
        }
        reader.close();
        return testData.toArray(new Object[0][0]);
    }



}

