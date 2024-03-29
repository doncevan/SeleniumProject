package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxDemo extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url = "http://practice.syntaxtechs.net/basic-checkbox-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

//            check the checkbox if it is already not checked

        WebElement c1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));

        if (!c1.isSelected()) {
            Thread.sleep(500);
            c1.click();
        }

//        check the option-3 from the list of  check boxes
        List<WebElement> options = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        for (WebElement option : options) {
            String value = option.getAttribute("value");
            if (value.equals("Option-3")) {
                Thread.sleep(500);
                option.click();
                break;
            }
        }
        closeBrowser();
    }
}