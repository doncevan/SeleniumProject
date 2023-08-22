package SeleniumHW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Class10AmazonDropDown extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://amazon.com";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
        Select sel = new Select(dropdown);
        List<WebElement> values = sel.getOptions();
        for (WebElement storeDeps : values) {
            String departments = storeDeps.getAccessibleName();
            System.out.println(departments);
        }
        driver.close();
    }
}