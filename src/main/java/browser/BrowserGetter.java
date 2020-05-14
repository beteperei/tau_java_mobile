package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserGetter {

    public void Browser(){


    }
    public WebDriver getChromeDriver(){
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public WebDriver getFirefoxDriver(){
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

}
