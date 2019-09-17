package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class MoreStuff {

    WebDriver driver;
    String baseUrl = "https://www.savethemanatee.org";

    @Before
    public void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\19787\\Desktop\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);

    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void Test(){
        WebElement x = driver.findElement(By.xpath("//ul[@id='menu-primary-navigation']/li[1]//span[.='About Us']"));
        String textx = x.getText();
        System.out.println(textx);

        WebElement y = driver.findElement(By.xpath("//ul[@id='menu-primary-navigation']/li[1]//span[.='About Us']"));
        String attributey = y.getAttribute("placeholder");
        System.out.println(attributey);

    }
}
