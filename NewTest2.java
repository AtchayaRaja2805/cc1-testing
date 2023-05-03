package com.example.demo.sampletesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class NewTest2 
{
    public static void main( String[] args ) throws InterruptedException
    {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Atchaya");
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Raja");
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("622003");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        System.out.println("Name of the product: " + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div")).getText());
        System.out.println("Price of the product: " + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div")).getText());
        String title=driver.getTitle();
        String tile="Swag Labs";
        String url=driver.getCurrentUrl();
        String ourl="https://www.saucedemo.com/checkout-step-two.html";
        if(url.equals(ourl))
        {
          System.out.println("true");
        }
        if(title.equals(tile))
        {
          System.out.print("true");  
        }
	      
        
        
     }
}