package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.util.concurrent.TimeUnit;

public class MyTest {

    WebDriver driver;
    String baseUrl = "https://www.savethemanatee.org";


    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\19787\\Desktop\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void test() {
        driver.get(baseUrl);
        driver.findElement(By.xpath("//ul[@id='menu-action-nav']/li[1]//span[.='Adopt']")).click();
        driver.findElement(By.xpath("/html//input[@id='cons_email']")).sendKeys("Brandon");
        driver.findElement(By.xpath("/html//input[@id='cons_email']")).clear();

    }
    @After
    public void tearDown() throws Exception {
        //after every test many
    }

}
