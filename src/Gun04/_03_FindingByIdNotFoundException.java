package Gun04;

import Utility.MyFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByIdNotFoundException {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");



        try {
            WebElement labelfirstname=driver.findElement(By.id("hataliLocator"));
            //System.out.println("labelfirstname.getText() = " + labelfirstname.getText());

        }
        catch (Exception ex){
            System.out.println("WebElement Bulunamadı"+ex.getMessage());
        }

        MyFunction.Bekle(4);
        driver.quit();

    }
}
