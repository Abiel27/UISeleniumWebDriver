package LabraryCTproje.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class findBb_ID_yahooLogIn {
    public static void main(String[] args) throws InterruptedException {
        //setup webdriver
        WebDriverManager.chromedriver().setup();
        //creat driver instance
        WebDriver driver = new ChromeDriver();
        //get the web
        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://login.yahoo.com");
//        WebElement username= driver.findElement(By.id("identifierId") );
//        username.sendKeys("abielmenghistu@gmail.com");
        driver.findElement(By.id("login-username")).sendKeys("abielmenghistu@gmail.com");
//        driver.findElement(By.name("q")).sendKeys("Selenium");
//        Thread.sleep(2000);
//        driver.findElement(By.name("btnk")).click();
//       driver.findElement(By.linkText("elm:btn;elmt:forgot;slk:forgot;mkey:login-landing-forgot")).click();





    }
}
