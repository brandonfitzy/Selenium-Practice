package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;


public class BoxesButtons {
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
        driver.findElement(By.xpath("//ul[@id='menu-action-nav']/li[3]//span[.='Donate']")).click();
        WebElement box1 = driver.findElement(By.xpath("/html//input[@id='level_standardauto_repeatname']"));
        WebElement box2 = driver.findElement(By.xpath("/html//input[@id='single_designee_unrestricted']"));
        WebElement box3 = driver.findElement(By.xpath("/html//input[@id='single_designee_designated']"));
        box1.click();
        box2.click();
        box3.click();
        System.out.println(box1.isSelected());
        System.out.println(box2.isSelected());
        System.out.println(box3.isSelected());

    }

}