package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CSSDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//        click on create new account
        WebElement createNewAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();

//        enter the first name
        WebElement fName = driver.findElement(By.cssSelector("input[name='firstname']"));
        fName.sendKeys("bob");

        WebElement lName = driver.findElement(By.cssSelector("input[name='lastname']"));
        lName.sendKeys("dodic");

        WebElement phone = driver.findElement(By.cssSelector("input[name='reg_email__']"));
        phone.sendKeys("4695425410");

        WebElement pass = driver.findElement(By.cssSelector("input[name='reg_passwd__']"));
        pass.sendKeys("abracadabra123");

        WebElement month = driver.findElement(By.id("month"));
        Select sel_M = new Select(month);
        sel_M.selectByVisibleText("May");

        WebElement day = driver.findElement(By.id("day"));
        Select sel_D = new Select(day);
        sel_D.selectByVisibleText("17");

        WebElement year = driver.findElement(By.id("year"));
        Select sel_Y = new Select(year);
        sel_Y.selectByVisibleText("2000");

       driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();

        driver.findElement(By.cssSelector("button[name='websubmit']")).click();
    }
}