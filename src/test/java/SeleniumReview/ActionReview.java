package SeleniumReview;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionReview extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

//        username
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
//        password
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
//        login
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));

//        declare the instance
        Actions action = new Actions(driver);
        action.click(loginBtn).perform();
        WebElement leaveTab = driver.findElement(By.id("menu_leave_viewLeaveModule"));
        action.moveToElement(leaveTab).perform();
        closeBrowser();
    }
}