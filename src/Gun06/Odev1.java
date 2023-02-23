package Gun06;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev1 extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        WebElement business=driver.findElement(By.cssSelector("[type='radio'][value='Business']"));
        business.click();
        MyFunction.Bekle(2);
        WebElement dropbox=driver.findElement(By.cssSelector("select[id$='_4588']"));
        dropbox.click();
        MyFunction.Bekle(2);
        WebElement online=driver.findElement(By.cssSelector("[value='Online Advertising']"));
        online.click();
        MyFunction.Bekle(2);
        WebElement everyday=driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        everyday.click();
        MyFunction.Bekle(2);
        WebElement good=driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        good.click();
        MyFunction.Bekle(2);
        WebElement select=driver.findElement(By.cssSelector("select[id$='_4597']"));
        select.click();
        MyFunction.Bekle(2);
        WebElement secenek4=driver.findElement(By.cssSelector("select[id$='_4597']>:nth-child(4)"));
        secenek4.click();

        good.click();

        BekleKapat();

    }
}

