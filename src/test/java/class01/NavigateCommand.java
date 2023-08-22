package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class NavigateCommand {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        String handle1 = driver.getWindowHandle();
        Thread.sleep(1000);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(1000);
        String handle = driver.getWindowHandle();
        System.out.println(handle);
        String title = driver.getTitle();
        System.out.println(title);
        driver.switchTo().window(handle);
        Thread.sleep(5000);
        Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        driver.manage().window().fullscreen();
        Thread.sleep(1000);
        driver.close();
    }
}
