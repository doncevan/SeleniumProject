package class05;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Alerts extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement alert1Btn = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1Btn.click();

        Thread.sleep(1000);
//        switch the focus of the driver to the alert
        Alert confirmationAlert1 = driver.switchTo().alert();
        confirmationAlert1.accept();

//        find the other alert button and click on it
        WebElement alert2Btn = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2Btn.click();
//        to observe
        Thread.sleep(1000);

//        switch to the alert

        Alert confirmationAlert2 = driver.switchTo().alert();
        confirmationAlert2.dismiss();

        WebElement promtBox = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        promtBox.click();
        driver.switchTo().alert().sendKeys("Trump");
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        closeBrowser();
    }
}