package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("doncevan@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("abracadabra");
        String Url=driver.getCurrentUrl();
        System.out.println(Url);
        String title= driver.getTitle();
        System.out.println(title);
        if (title.equals("Facebook")) {

            System.out.println("the title is correct");
        }else{
            System.out.println("its wrong");
        }
        driver.quit();

    }
}
