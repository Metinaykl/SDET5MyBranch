package Gun05;

import Utility.BaseDriver;
import Utility.MyFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {
    public static void main(String[] args) {

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        MyFunction.Bekle(3);

        WebElement element=driver.findElement(By.id("alerttest"));
        //WebElement element=driver.findElement(By.linkText("Alerts (JavaScript)"));
        element.click(); // yeni sayfaya gittik
        MyFunction.Bekle(3);

        System.out.println(driver.getCurrentUrl()); // o anda bulunduğum URL bilgisini verir

        driver.navigate().back(); // tarayıcı historysinden geri geldim
        MyFunction.Bekle(3);

        System.out.println(driver.getCurrentUrl()); // o anda bulunduğum URL bilgisini verir

        driver.navigate().forward(); // tarayıcı historysinden ileri gittim
        MyFunction.Bekle(3);

        System.out.println(driver.getCurrentUrl()); // o anda bulunduğum URL bilgisini verir

        BekleKapat();

    }
}
