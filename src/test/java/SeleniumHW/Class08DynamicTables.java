package SeleniumHW;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Class08DynamicTables extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
//        Login into the website
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();

//        Click on Recruitment
        driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']")).click();

//        Open Calendar
        driver.findElement(By.xpath("//input[@name='candidateSearch[dateApplication][from]']")).click();

//        Select month, then year from dropdown
        selectFromDropDown(By.xpath("//select[@class='ui-datepicker-month']"), 11);
        selectFromDropDown(By.xpath("//select[@class='ui-datepicker-year']"), 189);
//         Get days from the calendar and loop
        List<WebElement> calendarDays = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement day : calendarDays) {
            if (day.getText().equals("21")) {
                day.click();
                break;
            }
        }
    }
}


