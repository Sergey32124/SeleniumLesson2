package org.example.seleniumlesson2.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class AutorizationTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp(){
    driver=new ChromeDriver();
    }

    @AfterEach
    public void theAnd(){
        driver.quit();
    }

    @Test
    public void testLogin(){
        driver.get("https://www.saucedemo.com/");
        WebElement login=driver.findElement(By.name("user-name"));
        WebElement possword=driver.findElement(By.name("password1"));

        login.sendKeys("standard_user");
        possword.sendKeys("secret_sauce");

        WebElement button=driver.findElement(By.name("login-button"));
        button.click();

        try {
            Thread.sleep(2000);
            WebElement acc = driver.findElement(By.className("app_logo"));

            if (acc != null && acc.isDisplayed()) {
                System.out.println("Элемент найден");
            }
        }catch (NoSuchElementException e){
            System.out.println("Eror");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
