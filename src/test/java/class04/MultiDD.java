package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MultiDD extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

//         Approach to select multiple options from multi select DRopDOWn

//        1. inspect and find the element that has the dropdown
        WebElement DD = driver.findElement(By.xpath("//select[@name='States']"));
//        2.create an object of the select class and pass in the parameters the element dropdown
        Select sel = new Select(DD);

//        check if the dropdown  multiselect
        boolean isMul = sel.isMultiple();
        System.out.println("the drop down is multi select :" + isMul);

//        select by visible text
        sel.selectByVisibleText("California");
        Thread.sleep(1000);
//        select by value
        sel.selectByValue("Ohio");
        Thread.sleep(1000);
//        select by index
        sel.selectByIndex(7);
        Thread.sleep(1000);
//        we have deselect methods also available for multi select drop down
        sel.deselectByVisibleText("Ohio");
        closeBrowser();
    }
}