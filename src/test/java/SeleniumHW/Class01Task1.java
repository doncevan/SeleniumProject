package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        Fill out the form
        Close the browser
        Note: use name or id as locators */
public class Class01Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("John");
        driver.findElement(By.id("customer.lastName")).sendKeys("Brown");
        driver.findElement(By.id("customer.address.street")).sendKeys("Beach street");
        driver.findElement(By.id("customer.address.city")).sendKeys("Springfield");
        driver.findElement(By.id("customer.address.state")).sendKeys("Massachusetts");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("01234");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("098-765-4321");
        driver.findElement(By.id("customer.ssn")).sendKeys("000-111-2222");
        driver.findElement(By.id("customer.username")).sendKeys("Userlogin");
        driver.findElement(By.id("customer.password")).sendKeys("Password");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Password");
        Thread.sleep(5000);
        driver.close();
    }
}
