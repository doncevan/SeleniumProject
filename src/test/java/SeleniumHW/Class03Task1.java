package SeleniumHW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class03Task1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");

        WebElement firstName = driver.findElement(By.cssSelector("input[name^='first']"));
        firstName.sendKeys("Mike");

        WebElement lastName = driver.findElement(By.cssSelector("input[name*='ast_na']"));
        lastName.sendKeys("Bolt");

        WebElement email = driver.findElement(By.cssSelector("input[name$='ail']"));
        email.sendKeys("MB@gmail.com");

        WebElement phone = driver.findElement(By.cssSelector("input[name='phone']"));
        phone.sendKeys("333-777-4444");

        WebElement address = driver.findElement(By.cssSelector("input[placeholder='Address']"));
        address.sendKeys("1500 Asheville Hwy ");

        WebElement city = driver.findElement(By.cssSelector("input[name='city']"));
        city.sendKeys("Columbia");

        WebElement state = driver.findElement(By.xpath("//select[@name = 'state']"));
        state.click();

        WebElement stateOptions = driver.findElement(By.xpath("//option[text()='South Carolina']"));
        stateOptions.click();

        WebElement zipCode = driver.findElement(By.cssSelector("input[name='zip']"));
        zipCode.sendKeys("98765");

        WebElement website = driver.findElement(By.cssSelector("input[name='website']"));
        website.sendKeys("https://www.mbolt.com");

        WebElement radioBtn = driver.findElement(By.xpath("//input[@value='yes']"));
        radioBtn.click();

        WebElement projectDescription = driver.findElement(By.cssSelector("textarea.form-control"));
        projectDescription.sendKeys("My project description...");
    }
}
