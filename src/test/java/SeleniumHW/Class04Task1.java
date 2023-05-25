package SeleniumHW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Class04Task1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement days = driver.findElement(By.cssSelector("select#select-demo"));
        Select select = new Select(days);
        select.selectByIndex(3);
        Thread.sleep(2000);
        select.selectByVisibleText("Thursday");
        Thread.sleep(2000);
        select.selectByValue("Friday");
    }
}
