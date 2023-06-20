package SeleniumReview;

import Utils.CommonMethods;
import org.openqa.selenium.*;

import java.io.IOException;

public class KeysDemoAndScreenShot extends CommonMethods {
    public static void main(String[] args) throws InterruptedException, IOException {
        String url = "https://the-internet.herokuapp.com/key_presses";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement textBox = driver.findElement(By.id("target"));
        textBox.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        textBox = driver.findElement(By.id("target"));
        textBox.sendKeys(Keys.TAB);
        Thread.sleep(2000);
        textBox = driver.findElement(By.id("target"));
        textBox.sendKeys(Keys.ARROW_DOWN);

        screenShot("Keys1");
    }
}
