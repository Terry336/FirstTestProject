import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public WebDriver driver;

    @Test
    public void Test1() throws InterruptedException{
        String projectPath= System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath+  "/src/main/resources/Drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.bg/");
        driver.findElement(By.id("L2AGLb")).click();
        driver.findElement(By.name("q")).sendKeys("world's richest person"+ Keys.ENTER);
        Thread.sleep(5000);
        driver.quit();

    }
}
