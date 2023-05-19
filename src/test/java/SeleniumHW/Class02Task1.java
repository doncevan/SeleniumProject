package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* use XPATH to navigate to fb.com, click on create new account, fill up all the text boxes, close the popup,
    close the browser    Note : in order for your code to work you have to put Thread.sleep(2000) after
    clicking on Create new account  */
public class Class02Task1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement createAccount = driver.findElement(By.xpath("//a[@data-testid= 'open-registration-form-button']"));
        createAccount.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name= 'firstname']")).sendKeys("Dorothy");
        driver.findElement(By.xpath("//input[@aria-label= 'Last name']")).sendKeys("Cook");
        driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("DoC@gmail.com");
        driver.findElement(By.xpath("//input[@aria-label = 'Re-enter email']")).sendKeys("DoC@gmail.com");
        driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("3337777");
        driver.findElement(By.xpath("//select[@id ='month']")).sendKeys("November");
        driver.findElement(By.xpath("//select[@title= 'Day']")).sendKeys("10");
        driver.findElement(By.xpath("//select[@aria-label= 'Year']")).sendKeys("1987");
        WebElement gender = driver.findElement(By.xpath("//label[text()= 'Female']"));
        gender.click();
        Thread.sleep(3000);
        WebElement closePopUp = driver.findElement(By.xpath("//img[@class='_8idr img']"));
        closePopUp.click();
        Thread.sleep(1000);
        driver.quit();


    }
}