package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class KeysDemo extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

//        locate the text Box USerName
        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester", Keys.TAB);
        Thread.sleep(1000);
//        locate the password text Box
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test", Keys.ENTER);

        WebElement checkBox = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[5]/td[1]"));
        checkBox.sendKeys("",Keys.ENTER);
    }
}