package asd;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by maksymssyrovatchenko on 3/9/16.
 */
public class BuyTest {
    private FirefoxDriver driver;
    public void testSum(){
        driver = new FirefoxDriver();
        driver.get("http://rozetka.com.ua/");

        //type item name

        driver.findElement(By.cssSelector("div[name=" "]")).click();

        //click search button

        driver.findElement(By.name("search-button")).click();

        //click on first item in search result

        driver.findElement(By.className("g-i-list-title")).click();

        //Get price from product page
        driver.findElement(By.cssSelector("div")).sendKeys(Keys.ENTER);


        String expectedPrice = driver.findElement(By.cssSelector("")).getText();

        Assert.assertEquals(expectedPrice=);






    }
}
