package SeleniumHW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Class05Task3 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://the-internet.herokuapp.com/iframe";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        driver.switchTo().frame(0);
        WebElement body = driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
        Thread.sleep(1000);
        body.clear();
        Thread.sleep(1000);
        body.sendKeys("Hello iFrame");
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
        WebElement heading = driver.findElement(By.xpath("//h3[text()='An iFrame containing the TinyMCE WYSIWYG Editor']"));
        String text = heading.getText();
        System.out.println(text);
        driver.close();
    }
}
