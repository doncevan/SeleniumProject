package SeleniumHW;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Class05Task1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement alertBtn = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alertBtn.click();
        Thread.sleep(2000);
        Alert confirmationAlert = driver.switchTo().alert();
        confirmationAlert.sendKeys("I did it!");
        Thread.sleep(2000);
        confirmationAlert.accept();
    }
}
