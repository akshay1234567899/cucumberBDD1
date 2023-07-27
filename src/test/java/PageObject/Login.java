package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class Login {
WebDriver driver;
public Login(WebDriver ldriver) {
driver = ldriver;

PageFactory.initElements(ldriver, this);
}

@FindBy(id="Email")
WebElement mail;

@FindBy(id="Password")
WebElement password;

@FindBy(xpath = "//button[@type='submit']")
WebElement login;

@FindBy(xpath = "//a[@href='/logout']")
WebElement logut;


public void enter_email(String entemail){
mail.clear();
mail.sendKeys(entemail);
}

public void enter_pass(String entpass){
password.clear();
password.sendKeys(entpass);
}

public void clickonloginbutton(){
login.click();
}
public void clickonlogout(){
logut.click();
}

}

