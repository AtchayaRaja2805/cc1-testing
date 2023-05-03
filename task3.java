package com.example.thursday.selproj2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class task3 {
public static void main(String[] args) throws InterruptedException {
WebDriverManager.edgedriver().setup();
WebDriver driver = new EdgeDriver();
driver.get ("https://www.saucedemo.com/");
driver.manage().window().maximize() ;
driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
String firsttext=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
System.out.println(firsttext);
driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")).click();
String secondtext=driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();
System.out.println(secondtext);
System.out.println("Filter (A-Z and Z-A) applied successfully");
driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
String thirdtext=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).getText();
System.out.println(thirdtext);
driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")).click();
String fourthtext=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).getText();
System.out.println(fourthtext);
System.out.println("filter (low price- high price and high price - low price ) applied sucessfully");
Thread.sleep(5000); 
driver.quit();
}
}
