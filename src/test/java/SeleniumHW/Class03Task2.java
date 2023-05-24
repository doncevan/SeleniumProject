package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class03Task2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");

        WebElement userName = driver.findElement(By.cssSelector("input#txtUsername"));
        userName.sendKeys("Admin");

        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
        password.sendKeys("");
        Thread.sleep(1000);

        WebElement loginBtn = driver.findElement(By.cssSelector("input#btnLogin"));
        loginBtn.click();

        Thread.sleep(3000);
        driver.close();
    }
}
