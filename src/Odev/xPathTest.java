package Odev;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class xPathTest extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://demoqa.com/text-box");
        WebElement fullname=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fullname.sendKeys("Automation");
        WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("Testing@gmail.com");
        WebElement cadress=driver.findElement(By.xpath("(//*[@class='form-control'])[1]"));
        cadress.sendKeys("Testing Current Address");
        WebElement padress=driver.findElement(By.xpath("(//*[@class='form-control'])[2]"));
        padress.sendKeys("Testing Permanent Address");
        WebElement submit=driver.findElement(By.xpath("//button[text()='Submit']"));
        submit.click();
        WebElement name=driver.findElement(By.xpath("//*[text()='Name:']"));
        Assert.assertTrue("Aynı değil",name.getText().contains("Automation"));
        WebElement emailcheck=driver.findElement(By.xpath("//*[text()='Email:']"));
        Assert.assertTrue("İcinde yok",emailcheck.getText().contains("Testing"));


    }
    @Test
    public void Test2(){
        driver.get("https://demo.applitools.com/");
        WebElement username=driver.findElement(By.xpath("//input[@placeholder='Enter your username']"));
        username.sendKeys("ttechno@gmail.com");
        WebElement password=driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
        password.sendKeys("techno123.");
        WebElement signin=driver.findElement(By.xpath("//a[text()='Sign in']"));
        signin.click();
        WebElement logincheck=driver.findElement(By.xpath("//h6[text()='Your nearest branch closes in: 30m 5s']"));
        Assert.assertTrue("Giriş başarısız",logincheck.getText().equals("Your nearest branch closes in: 30m 5s"));
    }
    @Test
    public void Test3(){
        driver.get("https://www.snapdeal.com/");
        WebElement search=driver.findElement(By.xpath("//input[@class='col-xs-20 searchformInput keyword']"));
        search.sendKeys("teddy bear");
        WebElement searchclick=driver.findElement(By.xpath("//*[text()='Search']"));
        searchclick.click();
        WebElement searchcheck=driver.findElement(By.xpath("(//span[@class='nnn'])[1]"));
        Assert.assertTrue("içinde yokr",searchcheck.getText().contains("teddy bear"));
    }
    @Test
    public void Test4(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement calc=driver.findElement(By.xpath("//a[text()='Calculate']"));
        calc.click();
        WebElement nmb1=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        nmb1.sendKeys("5");
        WebElement nmb2=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        nmb2.sendKeys("10");
        WebElement calcclick=driver.findElement(By.xpath("//input[@value='Calculate']"));
        calcclick.click();
        WebElement answer=driver.findElement(By.xpath("//span"));
        System.out.println("Cevap="+answer.getText());

    }
    @Test
    public void Test5(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement falerts=driver.findElement(By.xpath("//a[text()='Fake Alerts']"));
        falerts.click();
        WebElement salerts=driver.findElement(By.xpath("//input[@onclick='show_alert()']"));
        salerts.click();
        WebElement okbutton=driver.findElement(By.xpath("//button[text()='OK']"));
        okbutton.click();
    }
    @Test
    public void Test6(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement falerts=driver.findElement(By.xpath("//a[text()='Fake Alerts']"));
        falerts.click();
        WebElement salerts=driver.findElement(By.xpath("//input[@onclick='show_modal()']"));
        salerts.click();
        WebElement okbutton=driver.findElement(By.xpath("//button[text()='OK']"));
        okbutton.click();
        BekleKapat();

    }


}
