package Gun06;
import Utility.BaseDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector_2 extends BaseDriver {
    public static void main(String[] args)  {

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement txtbox= driver.findElement(By.cssSelector("input[id='user-message']"));
        txtbox.sendKeys("Merhaba ben metin");
        WebElement seemesaj=driver.findElement(By.cssSelector("[onclick='showInput();']"));
        seemesaj.click();
        WebElement msg=driver.findElement(By.cssSelector("[id='display']"));

        if (msg.getText().equals("Merhaba ben metin"))
            System.out.println("test passed");
        else
            System.out.println("test fail");

        BekleKapat();

    }

}
