package Odev;


import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Odevtest extends BaseDriver {
    @Test
   public void Test1(){
        driver.get("http://demoqa.com/text-box");
        String fullname="Automation";
        String email="Testing@gmail.com";


        WebElement fllname=driver.findElement(By.cssSelector("[id='userName']"));
        fllname.sendKeys(fullname);
        WebElement mail=driver.findElement(By.cssSelector("[id='userEmail']"));
        mail.sendKeys(email);
        WebElement cadres=driver.findElement(By.cssSelector("[id='currentAddress']"));
        cadres.sendKeys("Testing Current Address");
        WebElement padres=driver.findElement(By.cssSelector("[id='permanentAddress']"));
        padres.sendKeys("Testing Permanent Address");
        WebElement sbutton=driver.findElement(By.cssSelector("[id='submit']"));
        sbutton.click();
       //  Assert.assertTrue(fllname.getText().contains(fullname));
       //  Assert.assertTrue(mail.getText().contains(email));
         BekleKapat();


    }
    @Test
     public void Test2(){
         driver.get("https://demo.applitools.com/");
         String message="Your nearest branch closes in: 30m 5s";
         WebElement username=driver.findElement(By.cssSelector("[id='username']"));
         username.sendKeys("ttechno@gmail.com");
         WebElement password=driver.findElement(By.cssSelector("[id='password']"));
         password.sendKeys("techno123.");
         WebElement signin=driver.findElement(By.cssSelector("[id='log-in']"));
         signin.click();
         WebElement text=driver.findElement(By.cssSelector("[id='time']"));
         Assert.assertTrue(text.getText().equals(message));
         BekleKapat();
    }
    @Test
     public void Test3(){
         driver.get("https://www.snapdeal.com/");
         String fmsg="We've got 314 results for teddy bear";
         WebElement search=driver.findElement(By.cssSelector("[id='inputValEnter']"));
         search.sendKeys("teddy bear");
         WebElement searchclick=driver.findElement(By.cssSelector("[id='inputValEnter']~button"));
         searchclick.click();
         WebElement foundmsg=driver.findElement(By.cssSelector("[id='searchMessageContainer'] span"));
         Assert.assertTrue(foundmsg.getText().equals(fmsg));
         BekleKapat();

    }
    @Test
     public void Test4(){
         driver.get("https://testpages.herokuapp.com/styled/index.html");
         WebElement calc=driver.findElement(By.cssSelector("[id='calculate']"));
         calc.click();
         WebElement nmbr1=driver.findElement(By.cssSelector("[id='number1']"));
         nmbr1.sendKeys("5");
         WebElement nmbr2=driver.findElement(By.cssSelector("[id='number2']"));
         nmbr2.sendKeys("8");
         WebElement btcalc=driver.findElement(By.cssSelector("[id='calculate']"));
         btcalc.click();
         WebElement answer=driver.findElement(By.cssSelector("[id='answer']"));
         System.out.println("answer.getText() = " + answer.getText());
         BekleKapat();
    }
    @Test
     public void Test5(){
         driver.get("https://testpages.herokuapp.com/styled/index.html");
         WebElement fakealerttest=driver.findElement(By.cssSelector("[id='fakealerttest']"));
         fakealerttest.click();
         WebElement fakealert=driver.findElement(By.cssSelector("[id='fakealert']"));
         fakealert.click();
         WebElement clickok=driver.findElement(By.cssSelector("[id='dialog-ok']"));
         clickok.click();
         BekleKapat();
    }
    @Test
     public void Test6(){
         driver.get("https://testpages.herokuapp.com/styled/index.html");
         WebElement clickfakealert=driver.findElement(By.cssSelector("[id='fakealerttest']"));
         clickfakealert.click();
         WebElement clickshowmodal=driver.findElement(By.cssSelector("[id='modaldialog']"));
         clickshowmodal.click();
         WebElement showmodalokclick=driver.findElement(By.cssSelector("[id='dialog-ok']"));
         showmodalokclick.click();
         BekleKapat();
    }


}
