package stepdefination;

import PageObject.AddNewCustomer;
import PageObject.Login;
import PageObject.SearchcustomerPage;
import Utilities.Readconfig;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Stepdef extends Baseclass {

//    @Before
//public void lanunchBrowser(){
//        System.out.println("Launch the browser");
//    WebDriverManager.chromedriver().setup();
//    driver=new ChromeDriver();
//    driver.manage().window().maximize();
//}


    public void setup(){
        readconfig= new Readconfig();
        String browser= readconfig.getBrowser();

        switch (browser.toLowerCase()){
            case"chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                driver.manage().deleteAllCookies();
                driver.manage().window().maximize();
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                break;

            case "firfox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;

            default:
                driver=null;
                break;
        }
    }

@Given("launch chrome browser")
public void launch_chrome_browser()  {

//    WebDriverManager.chromedriver().setup();
//    driver=new ChromeDriver();


    login= new Login(driver);
    addnewcustomer=new AddNewCustomer(driver);
    seachcustomerpage=new SearchcustomerPage(driver);
}

@When("user open URL {string}")
public void user_open_URL(String URL) {
    driver.get(URL);
}


@When("user enter email {string} and password {string}")
public void user_enter_email_and_password(String email, String pass) {
    login.enter_email(email);
    login.enter_pass(pass);
}

@When("click on login")
public void click_on_login() {
    login.clickonloginbutton();
}

@Then("page title should be {string}")
public void page_title_should_be(String expected) {
     String actualtitle=driver.getTitle();
     if (actualtitle.equals(expected)){
         Assert.assertTrue(true);
     }
     else {
         Assert.assertTrue(false);
     }
}


@When("user click on logout button")
public void user_click_on_logout_button() {
    login.clickonlogout();
}


    @Then("close browser")
    public void close_browser() {
        driver.close();
        driver.quit();
    }
///////////////....Add Customer.....//////////////

    @When("User can see customers menu")
    public void user_can_see_customers_menu() {
        String actualtitle=driver.getTitle();
        String expectedresult="Dashboard / nopCommerce administration";
        if(actualtitle.equals(expectedresult)){
            Assert.assertTrue(true);
        }
        else {
            Assert.assertTrue(false);
        }

    }

    @Then("click on customers menu item")
    public void click_on_customers_menu_item() {
      addnewcustomer.clickoncustomermenu();
      addnewcustomer.clickoncustomermenuitem();
    }

    @Then("click on Add new button")
    public void click_on_Add_new_button() {
   addnewcustomer.clickonAddNew();
    }

    @Then("User can view add new customer page")
    public void user_can_view_add_new_customer_page() {
    String actualtitle1=driver.getTitle();
    String expectedtitle1="Add a new customer / nopCommerce administration";
    if(actualtitle1.equals(expectedtitle1)){
        Assert.assertTrue(true);
    }
    else {
        Assert.assertTrue(false);
    }
    }

    @When("User enter customer infotmation")
    public void user_enter_customer_infotmation() {

        addnewcustomer.entermail(RandomemailID()+"@gmail.com");
       addnewcustomer.enterpass("demo@1234");
       addnewcustomer.enter_name("demo1");
       addnewcustomer.entlastname("test");
       addnewcustomer.selectGender("Male");
       addnewcustomer.enterdate("12-10-2001");
       addnewcustomer.entercompanyname("automobile");
       addnewcustomer.selecttaxbox();

    }

    @When("Click on save button")
    public void click_on_save_button() {
        addnewcustomer.clickonSave();
    }

    @Then("User can see conformation message {string}")
    public void user_can_see_conformation_message(String expectedresult) {
     String bodytag= driver.findElement(By.tagName("Body")).getText();
     if(bodytag.contains(expectedresult)){
         Assert.assertTrue(true);
     }
     else{
         Assert.assertTrue(false);
     }
    }



//    search customer by eamil address
@Then("Enter email address")
public void enter_email_address(){
    seachcustomerpage.enteremailaddress("demotest123@gmail.com");
}

    @When("click on search button")
    public void click_on_search_button()  {
       seachcustomerpage.clickonSearchButton();
    }

    @Then("user should found the eamil address in the table")
    public void user_should_found_the_eamil_address_in_the_table() {
    String expectedEmail="admin@yourStore.com";
      if(seachcustomerpage.seachByEmailCusomer(expectedEmail)){
          Assert.assertTrue(true);
      }
      else {
          Assert.assertTrue(false);
      }
    }

//////////////////......search by first name and last name.....///////////////

    @Then("Enter customer first name")
    public void enter_customer_first_name() {
        seachcustomerpage.EnterFirstName("John");
    }

    @Then("Enter customer last name")
    public void enter_customer_last_name() {
        seachcustomerpage.EnterLastName("Smith");
    }

    @Then("user should found the name in the table")
    public void user_should_found_the_name_in_the_table() {
        String expectedName="John Smith";
        Assert.assertTrue(seachcustomerpage.searchByFirstandLastName(expectedName));
    }
//@After
    public void teardown(){
    System.out.println("tear down browser");
        driver.quit();
    }

}

