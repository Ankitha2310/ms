package milestone;

import java.sql.Driver;
import java.time.Duration;

public class MoneyControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.chrome.driver", ‪"‪‪‪C:\\Drivers\\chromedriver.exe");
WebDriver driver=new chromeDriver();

driver.get("https://www.moneycontrol.com/");
driver.manage().window().maximize();
Actions action = new Action(driver);
WebElement element = driver.findElement(By.linkText("personal Finance"));
action.moveToElement(element).build().perform();
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2, 0));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Income Tax calculator")));
WebElement element2 = driver.findElement(By.linkText("Income Tax calculator"));
action.click().build().perform();

	}

}
