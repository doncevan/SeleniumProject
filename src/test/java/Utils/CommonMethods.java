package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {
    public static WebDriver driver;

    public static void openBrowserAndLaunchApplication(String url) {
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

    }

    public static void closeBrowser() {
        driver.quit();
    }
}
