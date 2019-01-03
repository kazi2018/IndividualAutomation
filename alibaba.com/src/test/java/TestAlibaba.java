import base.CentralHubClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestAlibaba extends CentralHubClass {

    @Test

    public void test1(){
//alibab search key test
        driver.findElement(By.cssSelector("searchbar-keyword ")).sendKeys("Toys Child");

    }
}
