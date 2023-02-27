package Odev;

import Utility.BaseDriver;
import com.sun.deploy.config.WinPlatform;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OdevtestXpath extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("http://demoqa.com/text-box");
        WebElement fullname = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fullname.sendKeys("Automation");
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("Testing@gmail.com");
        WebElement cadress = driver.findElement(By.xpath("(//textarea[@class='form-control'])[1]"));
        cadress.sendKeys("Testing Current Address");
        WebElement padress = driver.findElement(By.xpath("(//textarea[@class='form-control'])[2]"));
        padress.sendKeys("Testing Permanent Address");
        WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        button.click();
        WebElement namecheck = driver.findElement(By.xpath("//p[text()='Name:']"));
        Assert.assertTrue("Aynı Değil", namecheck.getText().contains("Automation"));
        WebElement emailcheck = driver.findElement(By.xpath("//p[text()='Email:']"));
        Assert.assertTrue("İçinde Değil", emailcheck.getText().contains("Testing"));

    }

    @Test
    public void Test2() {
        driver.get("https://demo.applitools.com/");
        WebElement username = driver.findElement(By.xpath("//input[@placeholder='Enter your username']"));
        username.sendKeys("ttechno@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
        password.sendKeys("techno123.");
        WebElement signin = driver.findElement(By.xpath("//a[text()='Sign in']"));
        signin.click();
        WebElement signincheck = driver.findElement(By.xpath("//h6[text()='Your nearest branch closes in: 30m 5s']"));
        Assert.assertTrue("Giriş doğrulanmadı", signincheck.getText().equals("Your nearest branch closes in: 30m 5s"));

    }

    @Test
    public void Test3() {
        driver.get("https://www.snapdeal.com/");
        WebElement tedyy = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
        tedyy.sendKeys("teddy bear");
        WebElement searchbutton = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
        searchbutton.click();
        WebElement checkfound = driver.findElement(By.xpath("//span[contains(text(),'teddy')]"));
        Assert.assertTrue("Arama doğrulanmadı", checkfound.getText().contains("teddy bear"));
    }

    @Test
    public void Test4() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement calculate = driver.findElement(By.xpath("//a[text()='Calculate']"));
        calculate.click();
        WebElement number1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        number1.sendKeys("5");
        WebElement number2 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        number2.sendKeys("10");
        WebElement hesapla = driver.findElement(By.xpath("//input[@value='Calculate']"));
        hesapla.click();
        WebElement answer = driver.findElement(By.xpath("//span"));
        System.out.println("Cevap = " + answer.getText());

    }

    @Test
    public void Test5() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement fakealert = driver.findElement(By.xpath("//a[text()='Fake Alerts']"));
        fakealert.click();
        WebElement showalert = driver.findElement(By.xpath("//input[@onclick='show_alert()']"));
        showalert.click();
        WebElement clickok = driver.findElement(By.xpath("//button[text()='OK']"));
        clickok.click();

    }
    @Test
    public void Test6(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement fakealertclick=driver.findElement(By.xpath("//a[text()='Fake Alerts']"));
        fakealertclick.click();
        WebElement showmodal=driver.findElement(By.xpath("//input[@value='Show modal dialog']"));
        showmodal.click();
        WebElement okclick=driver.findElement(By.xpath("//button[@class='dialog-button']"));
        okclick.click();
        BekleKapat();
    }
}
