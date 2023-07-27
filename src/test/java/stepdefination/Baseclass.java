package stepdefination;

import PageObject.AddNewCustomer;
import PageObject.Login;
import PageObject.SearchcustomerPage;
import Utilities.Readconfig;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Test;

public class Baseclass {
    public WebDriver driver;
    public Login login;
    public AddNewCustomer addnewcustomer;
    public SearchcustomerPage seachcustomerpage;
    public Readconfig readconfig;


//    generate unique id ...
    public String  RandomemailID(){
        return (RandomStringUtils.randomAlphabetic(6));
    }
}
