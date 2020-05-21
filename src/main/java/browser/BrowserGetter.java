package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.System.*;

public class BrowserGetter {

    public void Browser(){


    }
    public WebDriver getChromeDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\Desktop\\chromedriver_win32\\chromedriver_83.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public WebDriver getFirefoxDriver(){
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

    public WebDriver getDriver(){
        switch (getProperty("browser").toLowerCase()){
            case "chrome":
                out.println("Chrome was chosen!");
                return getChromeDriver();
            case "firefox":
                out.println("Firefox was chosen!");
                return getFirefoxDriver();
            default:
                throw new RuntimeException("Unsupported browser!");
        }
    }
}
