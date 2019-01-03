package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CentralHubClass {

    public WebDriver driver = null;

    @BeforeMethod

    public void startUp(){

        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\googleDriver\\chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.alibaba.com/");

            }

    @AfterMethod

    public void endUp(){
        driver.close();

    }

}
