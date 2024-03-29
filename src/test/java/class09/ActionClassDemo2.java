package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionClassDemo2 extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://jqueryui.com/droppable/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//as the element is inside an iframe, so first we need to switch focus
        driver.switchTo().frame(0);

//        find the draggable WebElement
        WebElement draggable = driver.findElement(By.id("draggable"));
//        find the element where u want to drop
        WebElement droppable = driver.findElement(By.id("droppable"));


//        Action Class
        Actions action = new Actions(driver);
        action.dragAndDrop(draggable, droppable).perform();
        closeBrowser();
    }
}