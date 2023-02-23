package Gun07;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SenaryoTest extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://www.saucedemo.com/");
        WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
        login.click();
        WebElement tshirt=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        tshirt.click();
        WebElement addcart=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addcart.click();
        WebElement backtopro=driver.findElement(By.xpath("//button[@id='back-to-products']"));
        backtopro.click();
        WebElement tshirt2=driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        tshirt2.click();
        WebElement addcart2=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addcart2.click();
        WebElement sepet=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        sepet.click();
        WebElement checkout=driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();
        WebElement firstname=driver.findElement(By.xpath("//input[@id='first-name']"));
        firstname.sendKeys("Metin");
        WebElement lastname=driver.findElement(By.xpath("//input[@id='last-name']"));
        lastname.sendKeys("Aykul");
        WebElement zipcode=driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipcode.sendKeys("06790");
        WebElement contiune=driver.findElement(By.xpath("//input[@id='continue']"));
        contiune.click();
        WebElement fiyat=driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));





    }
}
