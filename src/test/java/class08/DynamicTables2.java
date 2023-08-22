package class08;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DynamicTables2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
//        login into the website
        WebElement userName = driver.findElement(By.name("txtUsername"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.id("btnLogin"));
        loginBtn.click();
//        click on PIM
        WebElement pimBtn = driver.findElement(By.linkText("PIM"));
        pimBtn.click();

        // get all the ids from the table into the list
        List<WebElement> allIds = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
//        iterate through the ids and find the id 53502A and click on associated checkbox
        for (int i = 0; i < allIds.size(); i++) {
            String id = allIds.get(i).getText();
            if (id.equals("19529454")) {
                System.out.println("Click on the check box on row number " + (i + 1));
                WebElement checkBox = driver.findElement(By.xpath("//table/tbody/tr[" + (i + 1) + "]/td[1]"));
                checkBox.click();
            }
        }
        Thread.sleep(2000);
        closeBrowser();
    }
}
