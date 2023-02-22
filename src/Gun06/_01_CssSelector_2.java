package Gun06;
import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector_2 extends BaseDriver {
    @Test
    public void Test1()  {

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        String mesajim="Merhaba ben metin";

        WebElement txtbox= driver.findElement(By.cssSelector("input[id='user-message']"));
        txtbox.sendKeys(mesajim);
        WebElement seemesaj=driver.findElement(By.cssSelector("[onclick='showInput();']"));
        seemesaj.click();
        WebElement msg=driver.findElement(By.cssSelector("[id='display']"));

        Assert.assertTrue("aranilan mesaj bulunamadı",msg.getText().equals(mesajim)); // beklenen expect
        // assertTrue: içindeki değer True mu ? True ise hiç bir şey yapmaz.mesaj vermez
        // değilse beklenen olmamışsa hata mesajı verir.
        //yani genel kural : Hata var ise göster

        BekleKapat();

    }

}
