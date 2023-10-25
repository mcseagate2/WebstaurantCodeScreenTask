package WebElements;

import TestBase.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;
import java.time.Duration;

public class PageElements extends TestBase {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    public PageElements(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(id = "searchval") WebElement searchinput;
    @FindBy(xpath = "//button[@value='Search']") WebElement clicksearch;
    @FindBy(xpath = "//a[@href='/search/stainless-work-table.html?page=9']") WebElement lastitem;
    @FindBy(xpath = "//input[@data-testid= 'itemAddCart']")WebElement addtocart;
   // @FindBy(xpath = "//a[@href = '/cart/']") WebElement cartitem;
    @FindBy(xpath = "//a[@href='/viewcart.cfm']") WebElement pop;
    @FindBy(xpath = "//*[@id='main']/div[1]/div/div[1]/div/button") WebElement emptycart;
    @FindBy(xpath = "//button[@class= 'border-solid border box-border cursor-pointer inline-block text-center no-underline antialiased focus-visible:outline focus-visible:outline-offset-2 focus-visible:outline-2 mr-2 rounded-normal text-base leading-normal px-7 py-2-1/2 hover:bg-green-800 text-white text-shadow-black-60 bg-green-500 border-black-10 focus-visible:outline-green-800 btn align-middle font-semibold']") WebElement emptycartpopup;



    public void setSearchinput(){
        searchinput.clear();
        searchinput.sendKeys("stainless work table");
    }
    public void setClicksearch(){
        clicksearch.click();
    }

    public void setlastitem() {
       // JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", lastitem);
        lastitem.click();

    }

    public void setAddtocart(){
       // JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", addtocart);
        addtocart.click();
    }

    public void setPop(){
        pop.click();
    }


    public void setEmptycart(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(emptycart)).click();
    }

    public void setEmptycartpopup(){
        emptycartpopup.click();
   }
}
