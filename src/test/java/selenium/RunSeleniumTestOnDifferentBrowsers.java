package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//This will run single Test on Different Browser, depending on browserName being passed on from the command line.
//In case no browsername passed on from the command line, then default browser name marked in pom.xml will be used.
//In this... test will run on any one browser at a time.... No parallelism is happening here.

public class RunSeleniumTestOnDifferentBrowsers {

    WebDriver driver = null;

    @BeforeTest
    public void setup() {
        String browserName = System.getProperty("browser");
        if (browserName.equalsIgnoreCase("FIREFOX")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("CHROME")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
    }

    @Test
    public void actualTest() {
        driver.get("https://aakash-shinghal.medium.com/run-selenium-webdriver-script-on-brave-browser-203462fb4c36");
    }

    @AfterTest
    public void tearDownMethod() {
        driver.quit();
    }
}
