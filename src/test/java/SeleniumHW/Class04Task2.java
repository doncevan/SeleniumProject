package SeleniumHW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Class04Task2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.facebook.com";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement createNewAcc = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAcc.click();
        Thread.sleep(2000);

        WebElement month = driver.findElement(By.id("month"));
        WebElement day = driver.findElement(By.id("day"));
        WebElement year = driver.findElement(By.id("year"));

        Select selectMonth = new Select(month);
        Select selectDay = new Select(day);
        Select selectYear = new Select(year);

        selectMonth.selectByIndex(7);
        selectDay.selectByVisibleText("10");
        selectYear.selectByValue("1999");
    }
}
