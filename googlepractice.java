import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\19787\\Desktop\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html//form[@id='tsf']//div[@class='a4bIc']/input[@role='combobox']")).sendKeys("letskodeit");
        driver.findElement(By.name("btnK")).click();

}
}
