package SeleniumPractice;

/*   import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigReader;
import utils.Constants;
import utils.ExcelReader;
import utils.SeleniumMethods;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class FromOleksiiRash extends CommonMethods {
    public static void main(String[] args) throws IOException, InterruptedException {

        ConfigReader.getProperties(Constants.CONFIG_READER_PATH);

        String url = ConfigReader.getProperty("URL");
        openBrowserGetURL(url, "chrome");

        var username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys(ConfigReader.getProperty("userName"));
        var pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        pass.sendKeys(ConfigReader.getProperty("password"));
        var submit = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        submit.click();

        driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();


        var addEmployeeData = ExcelReader.read("BasicData", Constants.HRMS_DATA_FILE);

        for (var add : addEmployeeData) {
            var addEmployee = driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']"));
            addEmployee.click();

            String firstName = add.get("First Name");
            String middleName = add.get("Middle Name");
            String lastName = add.get("Last Name");
            String id = add.get("Employee Id");

            sendText(firstName, driver.findElement(By.xpath("//input[@id='firstName']")));
            sendText(middleName, driver.findElement(By.xpath("//input[@id='middleName']")));
            sendText(lastName, driver.findElement(By.xpath("//input[@id='lastName']")));
            sendText(id, driver.findElement(By.xpath("//input[@id='employeeId']")));
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@id='btnSave']")).click();
        }


        var searchEmployeeData = ExcelReader.read("FullData", Constants.HRMS_DATA_FILE);

        for (var search : searchEmployeeData) {
            driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();

            String id = search.get("Employee Id");
            var sendId = driver.findElement(By.xpath("//input[@id='empsearch_id']"));
            sendId.sendKeys(id);

            driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
            driver.findElement(By.xpath("//a[contains(text(), '" + id + "')]")).click();
            driver.findElement(By.xpath("//input[@value='Edit']")).click();

            String firstNameRefresh = search.get("First Name");
            String middleNameRefresh = search.get("Middle Name");
            String lastNameRefresh = search.get("Last Name");
            String idRefresh = search.get("Employee Id");
            String maritalStatusRefresh = search.get("Marital Status");
            String nickNameRefresh = search.get("Nick Name");

            sendText(firstNameRefresh, driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']")));
            sendText(middleNameRefresh, driver.findElement(By.xpath("//input[@id='personal_txtEmpMiddleName']")));
            sendText(lastNameRefresh, driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']")));
            sendText(idRefresh, driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']")));

            var marriedDroDown = driver.findElement(By.xpath("//select[@id='personal_cmbMarital']"));
            dropDownSelect(marriedDroDown, maritalStatusRefresh);

            sendText(nickNameRefresh, driver.findElement(By.xpath("//input[@id='personal_txtEmpNickName']")));
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@id='btnSave']")).click();

            var editBtn = driver.findElement(By.xpath("//input[@value='Edit']"));
            var waitSearchBtn = new WebDriverWait(driver, Duration.ofSeconds(20));
            waitSearchBtn.until(ExpectedConditions.visibilityOf(editBtn));
            editBtn.click();

        }

        var deleteEmployeeData = ExcelReader.read("FullData", Constants.HRMS_DATA_FILE);

        for (var delete : deleteEmployeeData) {
            driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();
            String id = delete.get("Employee Id");
            var sendId = driver.findElement(By.xpath("//input[@id='empsearch_id']"));
            sendId.sendKeys(id);
            driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
            driver.findElement(By.xpath("//input[@name='chkSelectRow[]']")).click();
            driver.findElement(By.xpath("//input[@name='btnDelete']")).click();
            driver.findElement(By.xpath("//input[@id='dialogDeleteBtn'][@value='Ok']")).click();
        }


    }
}
*/