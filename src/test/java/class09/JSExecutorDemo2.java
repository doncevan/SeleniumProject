package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class JSExecutorDemo2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://amazon.com";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

//            perform a scroll operation
//            using JavaScript

        JavascriptExecutor js = (JavascriptExecutor) driver;
//scroll down
        js.executeScript("window.scrollBy(0, 500)");
//        Thread.sleep for observation
        Thread.sleep(3000);
//        scroll up
        js.executeScript("window.scrollBy(0, -500)");

//        click on the dropdown  "All"
//        use click from jsExecutor
        WebElement select = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Thread.sleep(3000);
        js.executeScript("arguments[0].click();", select);
        System.out.println(select.getText());
        closeBrowser();
    }
}

