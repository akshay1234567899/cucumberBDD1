package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer {
    WebDriver driver;

    public AddNewCustomer(WebDriver ldriver) {
        driver = ldriver;

        PageFactory.initElements(ldriver, this);
    }


    @FindBy(xpath = "//a[@href='#']//p[contains(text(),'Customers')]")
    WebElement customerbutton;

    @FindBy(xpath = "//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
    WebElement Customer1click;

    @FindBy(xpath = "//a[@href='/Admin/Customer/Create']")
    WebElement Addnewbtn;

    @FindBy(xpath = "//input[@name='Email']")
    WebElement enteremail;

    @FindBy(xpath = "//input[@name='Password']")
    WebElement enterpass;

   @FindBy(xpath = "//input[@id='FirstName']")
    WebElement enterfirstname;

   @FindBy(xpath = "//input[@id='LastName']")
    WebElement enterlastname;

   @FindBy(xpath = "//input[@id='Gender_Male']")
    WebElement selectGender;

   @FindBy(xpath = "//input[@id='DateOfBirth']")
    WebElement selectDateOfBirth;

    @FindBy(xpath = "//input[@id='Company']")
    WebElement entercompanyname;

    @FindBy(xpath = "//input[@id='IsTaxExempt']")
    WebElement selectTax;

    @FindBy(xpath = "//button[@name='save']")
    WebElement btnsave;

    //actions on base page

    public void clickoncustomermenu(){
        customerbutton.click();
    }

    public void clickoncustomermenuitem(){
        Customer1click.click();
    }

    public void clickonAddNew(){
        Addnewbtn.click();
    }

    public void entermail(String s){
        enteremail.sendKeys("demotest123@gmail.com");
    }

    public void enterpass(String s){
        enterpass.sendKeys("demo@1234");
    }

    public void enter_name(String demo){
        enterfirstname.sendKeys("demo1");
    }
    public void entlastname(String test){
        enterlastname.sendKeys("user");
    }

    public void selectGender(String male){
        selectGender.click();
    }

    public void enterdate(String s){
        selectDateOfBirth.sendKeys("12-10-2001");
    }

    public void entercompanyname(String automobile){
        entercompanyname.sendKeys("automobile");
    }

    public void selecttaxbox(){
        selectTax.click();
    }

    public void clickonSave(){
        btnsave.click();
    }

}
