package SeleniumReview;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class tablesPractice extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.toolsqa.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement cookies = driver.findElement(By.cssSelector("button[id='accept-cookie-policy']"));
        Thread.sleep(500);
        cookies.click();
        driver.findElement(By.xpath("/html/body/header/nav/div/div/div[3]/div/div[1]/ul/li[3]/a")).click();
        Set<String> allHandles = driver.getWindowHandles();
        for (String handle : allHandles) {
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("DEMOQA")) {
                break;
            }
        }
//        when the focus is shifted to correct page
        System.out.println("the current page under focus is : " + driver.getTitle());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='card mt-4 top-card'])[1]"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='text' and text()='Web Tables']"))).click();
//get number of rows
        List<WebElement> rows = driver.findElements(By.xpath("//div[@role='grid']")); // get all rows
        WebElement lastRow = rows.get(rows.size() - 1); // get the last row
        List<WebElement> cells = lastRow.findElements(By.xpath("(//div[@role='rowgroup'])[3]")); // get all cells in the last row

        for (int i = 0; i < cells.size(); i++) {
            String cellText = cells.get(i).getText();
            System.out.print(cellText + " ");
        }
        System.out.println();
        System.out.println("********************************* print all rows ******************************************");
        List<WebElement> rowsAll =
                driver.findElements(By.xpath("//div[@role='grid']"));
        for (int i = rowsAll.size() - 1; i >= 0; i--) {
            System.out.print(rowsAll.get(i).getText() + " ");
            break;
        }
        driver.quit();
    }
}
