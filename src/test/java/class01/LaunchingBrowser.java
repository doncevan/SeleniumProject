package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);
        String title=driver.getTitle();
        System.out.println(title);
        Thread.sleep(5000);
        driver.quit();
    }
}
