package Gun08;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClassGiris extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://www.amazon.com.tr/");
        WebElement webMenu=driver.findElement(By.id("searchDropdownBox"));
        // bu element select tag'i ile başlıyorsa o zaman bunu SELECT cast'ine çevirip kullanıyoruz
        Select ddMenu=new Select(webMenu); // elementi daha rahat kullanabiliriz SELECT nesnesi olarak
        //  ddMenu.selectByIndex(4); // index ile seçim
        //  ddMenu.selectByValue("search-alias=electronics"); // value ile seçim
        ddMenu.selectByVisibleText("Elektronik"); // görünen string ile seçim

        System.out.println("ddMenu.getOptions().size() = " + ddMenu.getOptions().size());
        BekleKapat();



    }
}
