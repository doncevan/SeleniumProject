package class08;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class Calendars extends CommonMethods {

    public static void main(String[] args) {
        String url = "https://www.aa.com/homePage.do?locale=en_US";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//        click on the calendar
        WebElement calendar = driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]"));
        calendar.click();

//         Select the date   August 4, 2023

        boolean monthFound = false;
        while (!monthFound) {
            //        get the month and check if it is the desired one
            WebElement month = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));
            String currentMonth = month.getText();
            if (currentMonth.equals("October")) {
                System.out.println("Your flight in " + currentMonth);
                List<WebElement> allDates = driver.findElements(By.xpath("//table/tbody/tr/td"));
                for (WebElement date : allDates) {
                    String currentDate = date.getText();
                    if (currentDate.equals("15")) {
                        date.click();
                        System.out.println("On the date of " + currentDate);
                        break;
                    }
                }
                monthFound = true;
            } else {
//                click next
                WebElement nxtBtn = driver.findElement(By.xpath("(//a[@class='ui-datepicker-next ui-corner-all'])"));
                nxtBtn.click();
            }
        }
    }
}
