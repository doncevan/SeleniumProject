package SeleniumHW;
    /*
    goto http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
    click on get new user
    print the firstname of user
    */

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class Class06ImplicitWait extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//button[text()='Get New User']")).click();

        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        System.out.println(firstName.getText());
        Thread.sleep(3000);
        driver.close();
    }
}
