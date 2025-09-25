package baseclass;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {
public static WebDriver driver;
	public void getBrowser(String browser) {
		switch(browser) {
		case "chrome" :
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.err.println("Invalid browser" );
			break;
		}
		driver.manage().window().maximize();
	}
	//Open URL
	public void getUrl(String url) {
		driver.get(url);
	}
	//Element Actions sendkeys
	public void sendkeys(WebElement element,String text) {
		element.sendKeys(text);
	}
	//Element Actions Click
	public void click(WebElement element) {
		element.click();
	}
	//Handle Dropdowns
	public void SelectOptiontext(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	//Webdriver Wait 
	public void WaitForElement(WebElement element, int timeinseconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeinseconds));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	 // Quit browser
    public void quitBrowser() {
        if (driver != null) {
            System.out.println("Closing Browser: " + driver.getTitle());
            driver.quit();
        }

}
}
