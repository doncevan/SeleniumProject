package SeleniumReview;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class brokenLinks extends CommonMethods {
    public static void main(String[] args) throws IOException {
        String url = "http://amazon.com";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (int i = 0; i < links.size(); i++) {
            String linkURL = links.get(i).getAttribute("href");
            if (linkURL != null) {
                URL obj = new URL(url);
                HttpURLConnection conn = ((HttpURLConnection)
                        obj.openConnection());
                int rCode = conn.getResponseCode();
                if (rCode == 200) {
                    System.out.println(i + " Link is valid------" + linkURL);
                } else {
                    System.out.println(i + " Link is broken------" + linkURL);
                }
            } else {
                System.out.println(links.get(i).getText());
                System.out.println(i + " Link is broken ********" + linkURL);
            }
        }
        driver.close();
    }
}