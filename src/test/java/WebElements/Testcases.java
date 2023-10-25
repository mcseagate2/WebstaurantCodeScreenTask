package WebElements;

import TestBase.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;


public class Testcases extends TestBase {

    @Test
    public void searchstainlessworktable() {
        PageElements pe = PageFactory.initElements(driver, PageElements.class);
        pe.setSearchinput();
        pe.setClicksearch();
        pe.setlastitem();
        pe.setAddtocart();
        pe.setPop();
        pe.setEmptycart();
        pe.setEmptycartpopup();
   }
}
