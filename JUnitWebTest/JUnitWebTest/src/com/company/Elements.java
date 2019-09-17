package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;


public class Elements {
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
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        driver.get(baseUrl);
        org.openqa.selenium.WebElement a = driver.findElement(By.xpath("/html//header[@id='bb-header']/div[@class='bb-header__top']/div[@class='bb-header__top-wrap container-fluid']//div[@class='hidden-xs']/div[@class='bb-search-wrap']/form[@action='https://www.savethemanatee.org/']//input[@name='s']"));
        a.sendKeys("manatees");

    }

}

