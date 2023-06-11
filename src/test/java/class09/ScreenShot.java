package class09;

import Utils.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class ScreenShot extends CommonMethods {
    public static void main(String[] args) throws IOException {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
//        press the login btn

//        find the login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
//
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", loginBtn);


//        take the screenshot

//        declare the instance
        TakesScreenshot ts = (TakesScreenshot) driver;

//        take screenshot  as output type FILE
        File screenShot = ts.getScreenshotAs(OutputType.FILE);

//        save it in your computer
        FileUtils.copyFile(screenShot, new File(SCREENSHOT_PATH+"testSyntax.png"));
    }
}