// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class UntitledTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void untitled() {
    driver.get("https://www.upward.org/");
    driver.manage().window().setSize(new Dimension(969, 801));
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.cssSelector(".elementor-column:nth-child(5) .elementor-button-text")).click();
    vars.put("win2853", waitForWindow(2000));
    driver.switchTo().window(vars.get("win2853").toString());
    driver.findElement(By.id("text-11cd9cd1-5d2b-4ae8-a72b-9162985dd84a")).click();
    driver.findElement(By.id("text-11cd9cd1-5d2b-4ae8-a72b-9162985dd84a")).sendKeys("20109");
    driver.findElement(By.id("select-115f5b17-af87-4299-83ee-6f46d4130f5b")).click();
    {
      WebElement dropdown = driver.findElement(By.id("select-115f5b17-af87-4299-83ee-6f46d4130f5b"));
      dropdown.findElement(By.xpath("//option[. = 'Basketball']")).click();
    }
    driver.findElement(By.id("select-e85e51b2-c7ff-465b-9ee7-31d1edacf08d")).click();
    {
      WebElement dropdown = driver.findElement(By.id("select-e85e51b2-c7ff-465b-9ee7-31d1edacf08d"));
      dropdown.findElement(By.xpath("//option[. = '50 Miles']")).click();
    }
    driver.findElement(By.cssSelector(".btn-text")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".partner-list-item:nth-child(5) > .partner-list-text"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
  }
}
