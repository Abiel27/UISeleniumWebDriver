package LabraryCTproje.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ByNameSearchGoogle {

    public static void main(String[] args) {
        //setup webdriver
        WebDriverManager.chromedriver().setup();
        //creat driver instance
        WebDriver driver = new ChromeDriver();
        //get the web
        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://accounts.google.com");
        WebElement username= driver.findElement(By.id("identifierId") );
        username.sendKeys("abielmenghistu@gmail.com");
//        driver.findElement(By.id("login-username")).sendKeys("abielmenghistu@gmail.com");
//        driver.findElement(By.name("q")).sendKeys("Selenium");
    }
}
