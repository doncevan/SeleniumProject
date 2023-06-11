package SeleniumHW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

        /*
        create a method in Common methods for screenshot
        it should take file name as a parameter.
        */
public class Class09ScreenShot extends CommonMethods {
    /*
        from CommonMethods:
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
                                                                                            */
    public static void main(String[] args) throws InterruptedException {
        String url = "http://amazon.com";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
//         Finding the WebElement
        WebElement logoAmazon = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
//        JSExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
//        The script should draw a border around the WebElement
        js.executeScript("arguments[0].style.border='5px solid red'", logoAmazon);
        Thread.sleep(2000);
//        Action class
        Actions action = new Actions(driver);
//        Focus on the desired webElement,
        action.moveToElement(logoAmazon);
//        take screenshot
        screenShot("Red border around Amazon Logo");
        closeBrowser();
    }
}
