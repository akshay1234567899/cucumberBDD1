package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchcustomerPage {
WebDriver driver;

public SearchcustomerPage(WebDriver ldriver) {
    driver = ldriver;

    PageFactory.initElements(ldriver, this);
}

@FindBy(xpath = "//input[@name='SearchEmail']")
WebElement emailaddress;

@FindBy(xpath = "//button[@id='search-customers']")
WebElement searchbutton;

@FindBy(xpath = "//div[@class='card card-default']")
WebElement seachtable;

@FindBy(xpath = "(//div[@class='card card-default']//table)[2]//tr")
List<WebElement> tableRows;

@FindBy(xpath = "(//div[@class='card card-default']//table)[2]//tr[1]//td")
List<WebElement> tableCoulumn;

@FindBy(xpath = "//input[@id='SearchFirstName']")
WebElement enterFirstName;

@FindBy(xpath = "//input[@name='SearchLastName']")
WebElement enterLastname;

//action method for email address
public void enteremailaddress(String email) {
    emailaddress.sendKeys("admin@yourStore.com");
}

//click action on search button
public void clickonSearchButton(){
    searchbutton.click();
}

public boolean seachByEmailCusomer(String email) {
    boolean found = false;
    //total nubmers of rows in a grid
    int total_rows = tableRows.size();

    //total numbers of Columns
    int total_columns = tableCoulumn.size();
    System.out.println(total_columns);

    for (int i = 0; i < total_columns; i++) //to Iterate all rows of the grid
    {
     WebElement actualemail= driver.findElement(By.xpath("(//div[@class='card card-default']//table)[2]//tr["+i+"]//td[2]"));
     String actutalEailAddress= actualemail.getText();
     if(actutalEailAddress.equals(email)){
         found=true;
     }
    }
    return false;
}
public void EnterFirstName(String name){
    enterFirstName.sendKeys("John");
}
    public void EnterLastName(String lastname){
     enterLastname.sendKeys("Smith");
    }


    public boolean searchByFirstandLastName(String name) {
        boolean found = false;
        //total nubmers of rows in a grid
        int total_rows = tableRows.size();

        for (int i = 0; i < total_rows; i++) //to Iterate all rows of the grid
        {
            System.out.println("Total number of rows"+i);
            WebElement actualname= driver.findElement(By.xpath("(//div[@class='card card-default']//table)[2]//tr["+i+"]//td[3]"));
            String actualName= actualname.getText();
            if(actualName.equals(name)){
                found=true;
                break;
            }
        }
        return false;
    }
}
