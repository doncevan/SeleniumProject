package class05;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Frames extends CommonMethods {

    public static void main(String[] args) throws InterruptedException {
        String url = "https://chercher.tech/practice/frames";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
//            task1: print animal on screen
//            and select BabyCat from drop down

//    Step1:        as the webElement is inside an iframe
//            first we need to switch to it by index (starts from 0)
        driver.switchTo().frame(1);
//            find the WebElement animal
        WebElement animal = driver.findElement(By.xpath("//b[text()='Animals : ']"));
        System.out.println(animal.getText());
//            select baby cat
        WebElement dd = driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel = new Select(dd);
        sel.selectByVisibleText("Baby Cat");

//            switch the focus to the main page
        driver.switchTo().defaultContent();

//            switch to frame containing text box by name
        driver.switchTo().frame("frame1");
        WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
        textBox.sendKeys("abracadabra");

//            click on the checkbox
//            switch to iframe using webElement method
        WebElement innerFrame = driver.findElement(By.id("frame3"));
        driver.switchTo().frame(innerFrame);

        driver.findElement(By.id("a")).click();
        Thread.sleep(2000);
        closeBrowser();
    }
}