package TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.time.Duration;

public class TestBase {
    public static WebDriver driver;

    @BeforeAll
    public static void Initialize() throws IOException{
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void ChromeDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
        driver.get("https://www.webstaurantstore.com/");
    }

   @AfterAll
    public static void TearDownTest(){
        TestBase.driver.quit();
    }

}
