package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RunSeleniumTestOnBraveBrowser {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions().setBinary("/Applications/Brave Browser.app/Contents/MacOS/Brave Browser");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://aakash-shinghal.medium.com/docker-cmd-vs-entrypoint-b7e59b474b45");
        driver.quit();
    }
}
