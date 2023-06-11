package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class CommonMethods {
    public static WebDriver driver;

    public static void openBrowserAndLaunchApplication(String url, String browser) {

        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static void sendText(String text, WebElement element) {
        element.clear();
        element.sendKeys(text);
    }

    public static void selectFromDropDown(By dropdownLocator, int optionIndex) {
        WebElement dropdown = driver.findElement(dropdownLocator);
        Select sel = new Select(dropdown);
        sel.selectByIndex(optionIndex);
    }
    public static final String SCREENSHOT_PATH=System.getProperty("user.dir")+"\\screenshot\\";

    public static void screenShot(String fileName) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File screenShot = ts.getScreenshotAs(OutputType.FILE);
        String path = SCREENSHOT_PATH;
        try {
            FileUtils.copyFile(screenShot, new File(path + fileName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void selectDateOnCalendar(String calendarXpath, String monthXpath, String yearXpath, String dateXpath, String selectDate, String selectMonth, String selectYear) {
        WebElement calendar = driver.findElement(By.xpath((calendarXpath)));
        calendar.click();

        WebElement month = driver.findElement(By.xpath(monthXpath));
        Select selMonth = new Select(month);
        selMonth.selectByVisibleText(selectMonth);

        WebElement year = driver.findElement(By.xpath(yearXpath));
        Select selYear = new Select(year);
        selYear.selectByValue(selectYear);

        boolean found = false;
        while (!found) {
            List<WebElement> allDates = driver.findElements(By.xpath(dateXpath));
            for (WebElement date : allDates) {
                String currentDate = date.getText();
                if (currentDate.equals(selectDate)) {
                    date.click();
                    found = true;
                    break;
                }
            }
        }
    }
}