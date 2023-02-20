package Gun04;

import Utility.MyFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353"); // sayfaya gittim

        WebElement firstname =driver.findElement(By.id("first_8")); // elemanı id ile buldum
        MyFunction.Bekle(1);

        firstname.sendKeys("Metin");

        WebElement lastname= driver.findElement(By.id("last_8"));
        MyFunction.Bekle(1);
        lastname.sendKeys("Aykul");

        MyFunction.Bekle(2);

        // Chrome ctrl+f ye basıldığında inspect bölümünde arama kutusunu açar
        // (inspect) bölümü aktifken
        // first_name yazarsak bütün kelimelerde arar
        // #first_name yazarsak bütün ID paramtrelerinde arar

        WebElement labelfirstname=driver.findElement(By.id("sublabel_8_first"));
        System.out.println("labelfirstname.getText() = " + labelfirstname.getText());
        WebElement labellastname=driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labellastname.getText() = " + labellastname.getText());

        WebElement submitbutton=driver.findElement(By.id("input_2"));
        submitbutton.click();





        MyFunction.Bekle(5);
        driver.quit();


    }
}
