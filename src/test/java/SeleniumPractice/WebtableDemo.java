package SeleniumPractice;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebtableDemo extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://www2.asx.com.au/markets/trade-our-cash-market/equity-market-prices";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement frame1= driver.findElement(By.id("//*[@id=\"home_top_twenty\"]/div/div[1]/div/div[1]"));
        driver.switchTo().frame(frame1);

        List<WebElement> rowelements=driver.findElements(By.xpath(""));
        System.out.println(rowelements.size());
        int rowsize= rowelements.size();

        List<WebElement> columnelements=driver.findElements(By.xpath(""));
        System.out.println(columnelements.size());
        int colsize= columnelements.size();

        for (int i = 1; i <=rowsize ; i++) {
            for (int j = 1; j <=colsize; j++) {
                System.out.print(driver.findElement(By.xpath("")).getText()+" ");
            }
        }
        System.out.println();
    }
}
