package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JavaStuff {
    WebDriver driver;
    JavascriptExecutor js;
    String baseUrl ="https://www.savethemanatee.org/";

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\19787\\Desktop\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void testJavaScriptExecution() throws Exception{
        js.executeScript("window.location = https://www.savethemanatee.org");

        long height = (Long) js.executeScript("return window.innerHeight;");
        long width = (Long) js.executeScript("return window.innerWidth;");

        System.out.println("Height: "+height+" Width: "+width);

        js.executeAsyncScript("window.scrollBy(0,-1000);");
    }
}
