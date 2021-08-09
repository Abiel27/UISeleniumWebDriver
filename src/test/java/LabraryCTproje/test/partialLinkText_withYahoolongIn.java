package LabraryCTproje.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class partialLinkText_withYahoolongIn {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        //creat driver instance
        WebDriver driver = new ChromeDriver();
        //get the web
        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://login.yahoo.com/");
        Thread.sleep(2000);
        //driver.findElement(By.partialLinkText("username")).sendKeys("abeldebe@yahoo.com");
        driver.findElement(By.partialLinkText("login")).sendKeys("abeldebe@yahoo.com");
        driver.findElement(By.partialLinkText("login")).click();
    }
}
