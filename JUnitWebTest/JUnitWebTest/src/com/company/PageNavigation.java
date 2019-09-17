package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;


public class PageNavigation {
    WebDriver driver;
    String baseUrl = "https://www.savethemanatee.org";

    @Before
    public void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\19787\\Desktop\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() throws Exception{
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        driver.get(baseUrl);
        String title = driver.getTitle();
        System.out.println(title);
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
         String urlToNav = "https://www.shopsavethemanatee.org/";
         driver.navigate().to(urlToNav);
         Thread.sleep(2000);

         driver.navigate().back();

         Thread.sleep(2000);
         driver.navigate().forward();
    }

}
