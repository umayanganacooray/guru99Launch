package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/V4/index.php");

        driver.findElement(By.name("uid")).sendKeys(("mngr572144"));
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("masepad");
        driver.findElement(By.name("btnLogin")).click();
        driver.findElement(By.linkText("New Customer")).click();
    }
}