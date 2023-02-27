package Odev;


import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class CssSelectortest extends BaseDriver {
    @Test
   public void Test1(){
        driver.get("http://demoqa.com/text-box");


        WebElement fllname=driver.findElement(By.cssSelector("[placeholder='Full Name']"));
        fllname.sendKeys("Automation");
        WebElement mail=driver.findElement(By.cssSelector("[type='email']"));
        mail.sendKeys("Testing@gmail.com");
        WebElement cadres=driver.findElement(By.cssSelector("[placeholder='Current Address']"));
        cadres.sendKeys("Testing Current Address");
        WebElement padres=driver.findElement(By.cssSelector("div[id='permanentAddress-wrapper'] textarea"));
        padres.sendKeys("Testing Permanent Address");
        WebElement sbutton=driver.findElement(By.cssSelector("button[class='btn btn-primary']"));
        sbutton.click();
        WebElement fullnamecheck=driver.findElement(By.cssSelector("[class='border col-md-12 col-sm-12']>p:nth-child(1)"));
        WebElement emailcheck=driver.findElement(By.cssSelector("[class='border col-md-12 col-sm-12']>p:nth-child(2)"));
        Assert.assertTrue("aynı değil",fullnamecheck.getText().contains("Automation"));
        Assert.assertTrue("içinde yok",emailcheck.getText().contains("Testing"));


    }
    @Test
     public void Test2(){
         driver.get("https://demo.applitools.com/");
         String message="Your nearest branch closes in: 30m 5s";
         WebElement username=driver.findElement(By.cssSelector("[placeholder='Enter your username']"));
         username.sendKeys("ttechno@gmail.com");
         WebElement password=driver.findElement(By.cssSelector("[placeholder='Enter your password']"));
         password.sendKeys("techno123.");
         WebElement signin=driver.findElement(By.cssSelector("div[class='buttons-w']>a"));
         signin.click();
         WebElement text=driver.findElement(By.cssSelector("div[class='element-actions']+h6"));
         Assert.assertTrue(text.getText().equals(message));
    }
    @Test
     public void Test3(){
         driver.get("https://www.snapdeal.com/");
         WebElement search=driver.findElement(By.cssSelector("div[class='overlap']+input"));
         search.sendKeys("teddy bear");
         WebElement searchclick=driver.findElement(By.cssSelector("span[class='searchTextSpan']"));
         searchclick.click();
         WebElement foundmsg=driver.findElement(By.cssSelector("div[id='searchMessageContainer'] span"));
         Assert.assertTrue("aynısı değil",foundmsg.getText().contains("We've got 318 results for teddy bear"));

    }
    @Test
     public void Test4(){
         driver.get("https://testpages.herokuapp.com/styled/index.html");
         WebElement calc=driver.findElement(By.cssSelector("a[href='/calculate.php']"));
         calc.click();
         WebElement nmbr1=driver.findElement(By.cssSelector("form[action='calculate.php']>input:nth-child(1)"));
         nmbr1.sendKeys("5");
         WebElement nmbr2=driver.findElement(By.cssSelector("form[action='calculate.php']>input:nth-child(3)"));
         nmbr2.sendKeys("8");
         WebElement btcalc=driver.findElement(By.cssSelector("form[action='calculate.php']>input:nth-child(4)"));
         btcalc.click();
         WebElement answer=driver.findElement(By.cssSelector("form[action='calculate.php']+span"));
         System.out.println("answer = " + answer.getText());
    }
    @Test
     public void Test5(){
         driver.get("https://testpages.herokuapp.com/styled/index.html");
         WebElement fakealerttest=driver.findElement(By.cssSelector("a[href='alerts/fake-alert-test.html']"));
         fakealerttest.click();
         WebElement fakealert=driver.findElement(By.cssSelector("input[onclick='show_alert()']"));
         fakealert.click();
         WebElement clickok=driver.findElement(By.cssSelector("div[id='dialog'] button"));
         clickok.click();
    }
    @Test
     public void Test6(){
         driver.get("https://testpages.herokuapp.com/styled/index.html");
         WebElement clickfakealert=driver.findElement(By.cssSelector("a[href='alerts/fake-alert-test.html']"));
         clickfakealert.click();
         WebElement clickshowmodal=driver.findElement(By.cssSelector("input[onclick='show_modal()']"));
         clickshowmodal.click();
         WebElement showmodalokclick=driver.findElement(By.cssSelector("div[id='dialog'] button"));
         showmodalokclick.click();
         BekleKapat();
    }


}
